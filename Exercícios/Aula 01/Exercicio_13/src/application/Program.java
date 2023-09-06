package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um Fatorial que não seja negativo: ");
        int numero = sc.nextInt();
        int original = numero;
        int fatorial = 1;

        while (numero > 1) {
            fatorial *= numero;
            numero--;
        }
        System.out.printf("O valor do fatorial de %d é igual a %d",original, fatorial);

        sc.close();
    }
}
