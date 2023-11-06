package com.exercicio.caldeira.todoservice.service;

import com.exercicio.caldeira.todoservice.model.task.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ServiceTest {

    @Autowired
    TaskService taskService;
    Task task;

    @BeforeEach
    void setup(){
        task = new Task();
        task.setEstado(true);
        task.setDescricao("Comer");
        task.setDataDeVencimento(LocalDate.parse("2023-11-10"));
    }

    @Test
    void ListarTarefasTest() {
        List<Task> tarefas = taskService.listarTarefas();
        assertEquals(0, tarefas.size());
    }


    @Test
    //Verifica se o ArrayList aumenta ao adicionar tarefa
    void addTarefa(){
        taskService.adicionarTarefa(task);
        Assertions.assertTrue(!taskService.listarTarefas().isEmpty());
    }

    @Test
    void removeTarefa(){
        taskService.excluirTarefa(0);
        Assertions.assertTrue(taskService.listarTarefas().isEmpty());
    }

    @Test
    void getTarefas(){
        Assertions.assertInstanceOf(ArrayList.class, taskService.listarTarefas());
    }

    @Test
    void setTarefa(){
        Task task2 = new Task();
        task2.setEstado(true);
        task2.setDescricao("caminhar");
        task2.setDataDeVencimento(LocalDate.parse("2023-11-10"));
        taskService.atualizarTarefa(1, task2);

        ArrayList<Task> arr = (ArrayList<Task>) taskService.listarTarefas();
        Assertions.assertEquals("caminhar", arr.get(0).getDescricao());
    }


}
