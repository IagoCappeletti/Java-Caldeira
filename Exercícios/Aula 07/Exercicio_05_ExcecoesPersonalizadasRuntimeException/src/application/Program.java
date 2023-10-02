package application;

import entities.IdadeInvalidaException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (idade < 0 || idade > 150 ) {
            throw new IdadeInvalidaException("Idade digitada é menor que zero e maior de 150");
        } else {
            System.out.printf("Voce tem %d anos.", idade);
        }

    }
}
