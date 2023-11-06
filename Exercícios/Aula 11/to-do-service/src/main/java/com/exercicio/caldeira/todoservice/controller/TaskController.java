package com.exercicio.caldeira.todoservice.controller;

import com.exercicio.caldeira.todoservice.model.task.Task;
import com.exercicio.caldeira.todoservice.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private  TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public ResponseEntity<List<Task>> listar() {
        List<Task> listaDeTarefas = taskService.listarTarefas();
        return ResponseEntity.ok(listaDeTarefas);
    }

    @GetMapping("/descricao/{descricao}")
    public ResponseEntity<List<Task>> exibeFiltro(@PathVariable String descricao) {
        List<Task> task = taskService.filtroDescricao(descricao);
        if (task!= null) {
            return ResponseEntity.ok(task);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> exibeInformacao(@PathVariable long id) {
        Task task = taskService.obterTarefaPorId(id);
        if (task != null) {
            return ResponseEntity.ok(task);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/add")
    public ResponseEntity<Task> adicionarTarefa(@RequestBody @Valid Task novaTask, UriComponentsBuilder uriBuilder) {
        Task tarefaAdicionada = taskService.adicionarTarefa(novaTask);
        var uri = uriBuilder.path("/task/{id}").buildAndExpand(tarefaAdicionada.getId());
        return ResponseEntity.created(uri.toUri()).body(tarefaAdicionada);
    }

    @PutMapping(value = "/edit/{id}")
    public ResponseEntity<Task> atualizarTarefa(@PathVariable long id, @RequestBody Task taskAtualizada) {
        Task tarefaAtualizada = taskService.atualizarTarefa(id, taskAtualizada);
        if (tarefaAtualizada != null) {
            return ResponseEntity.ok(tarefaAtualizada);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> excluir(@PathVariable long id) {
        boolean tarefaExcluida = taskService.excluirTarefa(id);
        if (tarefaExcluida) {
            return ResponseEntity.ok("Tarefa excluída com sucesso!");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST) //Pega apenas erros que retornem BAD REQUEST
    @ExceptionHandler(MethodArgumentNotValidException.class) //Classe que retorna o erro
    //Metodo retorna um Map de erros
    public Map<String, String> handleValidationException(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>(); //cria um hashmap
        ex.getBindingResult().getAllErrors().forEach((e) -> {
            String fieldName = ((FieldError) e).getField(); //pega o campo do erro
            String errorMessage = e.getDefaultMessage(); //pega a mensagem do erro
            errors.put(fieldName, errorMessage); //coloca no hashmap a chave e o valor
        });
        return errors;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGlobalException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocorreu um erro interno: " + ex.getMessage());
    }

}
