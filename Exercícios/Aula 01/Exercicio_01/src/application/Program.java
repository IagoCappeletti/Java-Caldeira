package application;

import java.util.Scanner;

public class Program {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String nome = sc.nextLine();

        System.out.printf("O nome digitado foi: %s",nome);

        sc.close();

    }
}

