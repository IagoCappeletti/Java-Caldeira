package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        Integer valor;
        Integer total = 0;
        Integer totMedia = 0;

        System.out.println("Digite 5 Números: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + i + "º número: " );
            valor = sc.nextInt();
            numeros.add(valor);
        }

        //Soma todos os números que estão no Array
        for (int soma : numeros) {
            total += soma;
        }

        //Calcula a média dos números que estão no Array
        for (int somarMedia : numeros) {
            totMedia += somarMedia;
        }

        System.out.println("A soma dos números: " + total);
        System.out.println("A média dos números: " + totMedia / numeros.size());

    }
}
