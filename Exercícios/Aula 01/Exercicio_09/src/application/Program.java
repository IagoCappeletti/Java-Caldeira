package application;

import java.util.Calendar;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ano = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("Digite o ano que você nasceu? ");
        int anoDeNascimento = sc.nextInt();

        int idade = ano - anoDeNascimento;

        System.out.printf("A sua idade é %d anos", idade);

        sc.close();
    }
}
