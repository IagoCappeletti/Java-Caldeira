package application;

import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorAleatorio = new Random().nextInt(300000);
        double numero = 0;

        while (numero != valorAleatorio) {
            System.out.println("===================");
            System.out.println("Jogo de adivinhação");
            System.out.println("===================");
            System.out.print("Digite um número: ");
            numero = sc.nextDouble();

            System.out.println(valorAleatorio);
            if (numero < valorAleatorio) {
                System.out.println("Um pouco mais!");
            } else if (numero > valorAleatorio){
                System.out.println("Um pouco menos!");
            } else {
                System.out.println("Você acertou!");
            }
        }
        sc.close();
    }
}
