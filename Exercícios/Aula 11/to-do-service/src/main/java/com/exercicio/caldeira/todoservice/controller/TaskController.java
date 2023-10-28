package com.exercicio.caldeira.todoservice.controller;

import com.exercicio.caldeira.todoservice.model.task.Task;
import com.exercicio.caldeira.todoservice.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public ResponseEntity<List<Task>> listar() {
        List<Task> listaDeTarefas = taskService.listarTarefas();
        return ResponseEntity.ok(listaDeTarefas);
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
    public ResponseEntity<Task> adicionarTarefa(@RequestBody Task novaTask, UriComponentsBuilder uriBuilder) {
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
}
