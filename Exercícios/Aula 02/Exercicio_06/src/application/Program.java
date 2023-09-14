package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase();
        String palavraOriginal = palavra;

        palavra = reverse(palavra);
        System.out.printf("Palavra original: %s", palavraOriginal);
        System.out.printf("\nPalavra invertida: %s", palavra);

        sc.close();
    }

    public static String reverse(String palavra) {
        return new StringBuilder(palavra).reverse().toString();
    }

}
