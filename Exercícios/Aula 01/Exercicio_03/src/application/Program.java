package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Primeiro número: ");
        double primeiroNumero = sc.nextInt();
        System.out.print("Digite o Segundo número: ");
        double segundoNumero = sc.nextInt();
        System.out.print("Digite o Terceiro número: ");
        double terceiroNumero = sc.nextInt();

        double maiorNumero = primeiroNumero;
        if (segundoNumero > maiorNumero) {
            maiorNumero = segundoNumero;
        }
        if (terceiroNumero > maiorNumero) {
            maiorNumero = terceiroNumero;
        }

        double menorNumero = primeiroNumero;
        if (segundoNumero < menorNumero) {
            menorNumero = segundoNumero;
        }
        if (terceiroNumero < menorNumero) {
            menorNumero = terceiroNumero;
        }

        double media = (primeiroNumero + segundoNumero + terceiroNumero) / 3;

        System.out.println("O maior número digitado foi: " + maiorNumero);
        System.out.println("O menor número digitado foi: " + menorNumero);
        System.out.printf("A média aritmética é: %.1f", media);

        sc.close();
    }
}
