package application;

import java.util.LinkedList;
import java.util.Scanner;

public class Reserva extends Program {

    private String nome;
    private String local;
    private String cpf;
    private String dataEntrada;
    private String dataSaida;
    private LinkedList<Reserva> listaDeReservas = new LinkedList<>();

    Scanner sc = new Scanner(System.in);

    public Reserva() {
    }

    public Reserva(String nome, String local, String cpf, String dataEntrada, String dataSaida) {
        this.nome = nome;
        this.local = local;
        this.cpf = cpf;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public void reservarDePassagem() {
        System.out.print("Qual seu nome? ");
        String nome = sc.nextLine();
        System.out.print("Para onde você quer ir? ");
        String local = sc.nextLine();
        System.out.print("Digite seu CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Data de entrada: ");
        String dataEntrada = sc.nextLine();
        System.out.print("Data de saída: ");
        String dataSaida = sc.nextLine();

        Reserva novaReserva = new Reserva(nome, local, cpf, dataEntrada, dataSaida);
        listaDeReservas.add(novaReserva);

        System.out.println("Passagem concluida com sucesso!");
    }

    public void excluirPassagem() {
        for (int i = 0; i < listaDeReservas.size(); i++) {
            System.out.println("Nº" + (i + 1) + " " + listaDeReservas.get(i));
        }
        System.out.print("Qual cpf está vinculado a passagem você quer cancelar? ");
        String excluirPassagem = sc.nextLine();

        listaDeReservas.removeIf(reserva -> reserva.cpf.equals(excluirPassagem));
    }

    public void exibir() {

        //Verifica se o Array está vazio
        if (listaDeReservas.isEmpty()) {
            System.out.println("Sem reservas no momento! \n");
        } else {
            for (Reserva reservas : listaDeReservas) {
                System.out.println(reservas);
            }
        }
    }


    public void sair() {
        System.out.println("Finalizando o progrma.");
        System.exit(0);
        sc.close();
    }

    @Override
    public String toString() {
        return "Reserva do(a) " + nome + ", destino " + local + ", cpf " + cpf + ", data de partida "
                + dataEntrada + ", data de volta " + dataSaida;
    }
}

