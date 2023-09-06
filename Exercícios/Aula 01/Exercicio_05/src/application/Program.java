package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma hora: ");
        int hora = sc.nextInt();
        System.out.print("Digite um minutos: ");
        int minuto = sc.nextInt();
        System.out.print("Digite uns segundos: ");
        int segundo = sc.nextInt();

        int segundosDesdeMeiaNoite = hora * 3600 + minuto * 60 + segundo;

        int segundosParaMeiaNoite = 24 * 3600 - segundosDesdeMeiaNoite;

        System.out.println("Segundos desde a meia-noite: " + segundosDesdeMeiaNoite);
        System.out.println("Segundos restantes até a meia-noite: " + segundosParaMeiaNoite);

        sc.close();
    }
}
