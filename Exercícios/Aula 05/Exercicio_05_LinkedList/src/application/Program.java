package application;

import java.util.LinkedList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Reserva> reservas = new LinkedList<>();
        char opcao;


        do {
            System.out.print("Qual o nome do documento: ");
            String nome = sc.next();

            System.out.print("Quantas páginas tem: ");
            int numPaginas = sc.nextInt();

            Reserva novaReserva = new Reserva(nome, numPaginas);
            reservas.add(novaReserva);

            System.out.println("Adicionado na fila de impressão!");

            System.out.print("Você quer continuar: (s ou n)");
            opcao = sc.next().toLowerCase().charAt(0);
        }while (opcao != 'n');


        System.out.println("\n==== Fila de impressão ====");
        for (int i =0; i < reservas.size(); i++) {
            System.out.println((i+1) + "º da fila " + reservas.get(i));
        }

    }
}
