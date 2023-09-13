package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase();

        int tamanho = palavra.length();
        int metade = tamanho / 2;

        String primeiraMetade = palavra.substring(0, metade);
        String segundaMetade = palavra.substring(metade, tamanho);

        System.out.printf("Primeira metade da palavra: %s", primeiraMetade);
        System.out.printf("\nSegunda metade da palavra: %s", segundaMetade);

        sc.close();
    }
}
