package application;

import java.util.LinkedList;
import java.util.Scanner;

public class Reserva extends Program{

    private String nome;
    private String local;
    private String cpf;
    private String dataEntrada;
    private String dataSaida;
    private LinkedList<Reserva> listaDeReservas = new LinkedList<>();

    Scanner sc = new Scanner(System.in);

    public Reserva(String nome, String local, String cpf, String dataEntrada, String dataSaida) {
        this.nome = nome;
        this.local = local;
        this.cpf = cpf;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public void reservarDePassagem() {
        System.out.print("Qual seu nome");
        String nome = sc.nextLine();
        System.out.print("Para onde você quer ir? ");
        String local = sc.nextLine();
        System.out.print("Digite seu CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Data de entrada: ");
        String dataEntrada = sc.nextLine();
        System.out.print("Data de saída: ");
        String dataSaida= sc.nextLine();

        Reserva novaReserva = new Reserva(nome, local, cpf, dataEntrada, dataSaida);
        listaDeReservas.add(novaReserva);

        System.out.println("Passagem concluida com sucesso!");
    }

    @Override
    public String toString() {
        return "Reserva nome: " + nome + ", local: " + local + ", cpf: " + cpf + ", dataEntrada: "
                + dataEntrada + ", dataSaida: " + dataSaida;
    }
}

