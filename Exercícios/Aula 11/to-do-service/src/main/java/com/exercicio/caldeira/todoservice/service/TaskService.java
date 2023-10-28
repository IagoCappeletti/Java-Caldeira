package com.exercicio.caldeira.todoservice.service;

import com.exercicio.caldeira.todoservice.model.task.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TaskService {

    private final List<Task> listaDeTarefas = new ArrayList<>();
    private final AtomicLong contadorDeId = new AtomicLong(1);

    public List<Task> listarTarefas() {
        return listaDeTarefas;
    }

    public Task obterTarefaPorId(long id) {
        return listaDeTarefas.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Task adicionarTarefa(Task novaTask) {
        novaTask.setId(contadorDeId.getAndIncrement());
        listaDeTarefas.add(novaTask);
        return novaTask;
    }

    public Task atualizarTarefa(long id, Task taskAtualizada) {
        for (Task task : listaDeTarefas) {
            if (task.getId() == id) {
                task.setDescricao(taskAtualizada.getDescricao());
                task.setDataDeVencimento(taskAtualizada.getDataDeVencimento());
                task.setEstado(taskAtualizada.isEstado());
                return task;
            }
        }
        return null;
    }

    public boolean excluirTarefa(long id) {
        boolean tarefaExcluida = listaDeTarefas.removeIf(task -> task.getId() == id);

        if (tarefaExcluida) {
            ordenaIds();
        }
        return tarefaExcluida;
    }

    public void ordenaIds() {
        long novoId = 1;
        for (Task task: listaDeTarefas) {
            task.setId(novoId++);
        }
    }

}
