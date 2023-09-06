package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundoNumero = sc.nextInt();

        System.out.printf("O primeiro número digitado foi %d e o segundo foi %d",primeiroNumero, segundoNumero);

        sc.close();
    }
}
