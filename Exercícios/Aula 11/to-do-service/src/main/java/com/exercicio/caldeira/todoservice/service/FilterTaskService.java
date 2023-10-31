package com.exercicio.caldeira.todoservice.service;

import com.exercicio.caldeira.todoservice.model.task.Task;

import java.util.List;
import java.util.stream.Collectors;

public class FilterTaskService {

    public static List<Task> filtroPorDescricao(List<Task> listaDeTarefas, String descricao) {
        return listaDeTarefas.stream()
                .filter(task -> task.getDescricao().equals(descricao))
                .collect(Collectors.toList());
    }


    public static Task filtroPorId(List<Task> listaDeTarefas, long id) {
        return listaDeTarefas.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .orElse(null);
    }

}
