package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================");
        System.out.println("== V O T A Ç Ã O ==");
        System.out.println("===================");

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();


        if (idade < 16) {
            System.out.println("Você ainda não pode votar!");
        } else if (idade < 18) {
            System.out.println("Você tem direito ao voto, mas seu voto é opcional!");
        } else if (idade <= 65) {
            System.out.println("O seu voto é obrigatório!");
        } else {
            System.out.println("Seu voto não é obrigatório, ele é facultativo!");
        }

        sc.close();
    }
}
