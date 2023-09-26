package application;

import java.util.Scanner;

public class Tarefa {

    private String titulo;
    private String data;
    private String descricao;

    public Tarefa(String titulo, String data, String descricao) {
        this.titulo = titulo;
        this.data = data;
        this.descricao = descricao;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefa: "+ "titulo: " + titulo + ", data: " + data + ", descricao: " + descricao;
    }
}
