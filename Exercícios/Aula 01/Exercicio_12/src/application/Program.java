package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de dolar? ");
        double quantidadeDolar = sc.nextDouble();
        System.out.print("Qual a cotação do Dolar? ");
        double cotacaoDolar = sc.nextDouble();

        double total = quantidadeDolar * cotacaoDolar;

        System.out.printf("valor a ser pego em reais %.2f%n", total);

        sc.close();
    }
}
