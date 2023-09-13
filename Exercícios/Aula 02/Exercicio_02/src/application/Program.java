package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Consorcio consorcio = new Consorcio();

        Scanner sc = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println("== C O N S Ó R C I O ==");
        System.out.println("=======================");

        System.out.print("Qual é seu nome? ");
        String nome = sc.nextLine().toUpperCase();
        System.out.print("Qual a sua idade? ");
        int idade = sc.nextInt();
        System.out.print("Qual é o seu salário? ");
        double salario = sc.nextDouble();

        consorcio.VerificaConsorcio(nome, idade, salario);

        sc.close();
    }
}
