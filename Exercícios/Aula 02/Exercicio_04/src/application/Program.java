package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        char userInput;

        do {
            System.out.println("\n===== Calculadora =====");
            System.out.println("= #1 - Adição");
            System.out.println("= #2 - Subtração");
            System.out.println("= #3 - Multiplicação");
            System.out.println("= #4 - Divisão");
            System.out.println("=======================");
            System.out.print("Qual operação você deseja fazer? ");
            int operacao = sc.nextInt();

            System.out.print("Digite um número: ");
            int num1 = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int num2 = sc.nextInt();

            calc.operacoes(operacao, num1, num2);
            System.out.println();
            System.out.print("\nVocê gostaria de fazer outra operação? (S/N)");
            userInput = sc.next().toUpperCase().charAt(0);

        } while (userInput != 'N');
    }
}
