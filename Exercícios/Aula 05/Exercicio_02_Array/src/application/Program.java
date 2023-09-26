package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        List<Integer> numerosSortidos = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int numerosSortido = random.nextInt(100) + 1;
            numerosSortidos.add(numerosSortido);
        }

        System.out.print("Digite um número: ");
        int numeroInserido = sc.nextInt();

        boolean encontrado = false;

        for (int numero : numerosSortidos) {
            if (numero == numeroInserido) {
                encontrado = true;
                break;
            }
        }

        System.out.println("O número " + numeroInserido + (encontrado ? " foi encontrado" : " não foi encontrado"));

    }
}