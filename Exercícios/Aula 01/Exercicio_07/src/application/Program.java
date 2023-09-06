package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println("== C O N S Ó R C I O ==");
        System.out.println("=======================");

        System.out.print("Qual é seu nome? ");
        String nome = sc.nextLine();
        System.out.print("Qual a sua idade? ");
        int idade = sc.nextInt();
        System.out.print("Qual é o seu salário? ");
        double salario = sc.nextDouble();

        if (idade >= 18 && salario >=2000) {
            System.out.printf("\nParabéns! %s,você se encaixa nos requisitos para a compra do automovel !",nome);
        } else {
            System.out.printf("\nDesculpe %s, você não pode comprar um automóvel.",nome);
            if (idade < 18) {
                System.out.println("\nVocê deve ser maior de 18 anos.");
            }
            if (salario < 2000) {
                System.out.println("Seu salário deve ser igual ou superior a R$ 2.000,00.");
            }
        }

        sc.close();
    }
}
