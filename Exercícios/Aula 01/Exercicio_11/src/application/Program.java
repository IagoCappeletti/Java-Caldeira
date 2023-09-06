package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("== Contador  de vogais ==");
        System.out.println("=========================");
        System.out.print("Digite uma palavra ou uma frase: ");
        String palavra = sc.nextLine().toLowerCase();

        int totalVogais = 0;

        for (int i = 0; i < palavra.length(); i++ ) {
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                totalVogais++;
            }
        }

        System.out.printf("Total de vogais : %d",totalVogais);

        sc.close();
    }
}
