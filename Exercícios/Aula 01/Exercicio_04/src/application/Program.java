package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioMinimo = 1320;

        System.out.print("Qual o valor do seu salário: ");
        double salarioDigitado = sc.nextDouble();

        double quantidadeSalariosMinimos = salarioDigitado / salarioMinimo;

        System.out.printf("Você recebe %.2f salários mínimos", quantidadeSalariosMinimos);

        sc.close();
    }
}
