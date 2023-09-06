package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Token Filas Prioritárias =====");
            System.out.println("#1 - Gestante");
            System.out.println("#2 - Idosos");
            System.out.println("#3 - Deficiente ");
            System.out.println("#4 - Fila Comum");
            System.out.println("========================================");
            System.out.print("Qual opção você deseja acessar? ");
            int opcao = sc.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.println("Você recebeu a senha da fila prioritária de gestante.");
                    return;
                case 2:
                    System.out.println("Você recebeu a senha da fila prioritária de idosos.");
                    return;
                case 3:
                    System.out.println("Você recebeu a senha da fila prioritária de deficiente.");
                    return;
                case 4:
                    System.out.println("Você recebeu a senha da fila comum.");
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}

