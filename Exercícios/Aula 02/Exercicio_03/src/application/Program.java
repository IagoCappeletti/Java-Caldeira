package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FilaDePrioridade prioridade = new FilaDePrioridade();

        System.out.println("\n===== Token Filas Prioritárias =====");
        System.out.println("#1 - Gestante");
        System.out.println("#2 - Idosos");
        System.out.println("#3 - Deficiente ");
        System.out.println("#4 - Fila Comum");
        System.out.println("========================================");
        System.out.print("Qual opção você deseja acessar? ");
        int opcao = sc.nextInt();
        prioridade.VerificaPrioridade(opcao);


        sc.close();
    }
}
