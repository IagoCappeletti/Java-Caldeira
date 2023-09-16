package PACKAGE_NAME.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        while (true) {
            System.out.println("\n===== Caldeira Bank =====");
            System.out.println("#1 - Entrar");
            System.out.println("#2 - Cadastrar usuário");
            System.out.println("#3 - Sair do aplicativo");
            System.out.println("==========================");
            System.out.print("Qual opção você deseja acessar? ");
            int opcao = sc.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    conta.logar();
                    break;
                case 2:
                    conta.registarUsuario();
                    break;
                case 3:
                    System.out.println("Obrigado por acessar o aplicativo do Caldeira Bank!");
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}


