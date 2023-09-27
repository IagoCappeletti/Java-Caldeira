package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Reserva reserva = new Reserva();
        boolean sairDoLoop = false;
        while (!sairDoLoop) {
            System.out.println("===== M E N U =====");
            System.out.println("#1 - Reservar uma passagem");
            System.out.println("#2 - Cancelar reserva");
            System.out.println("#3 - Exibir lista de reserva");
            System.out.println("#4 - Sair");

            System.out.print("Digite a sua opção: ");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    reserva.reservarDePassagem();
                    break;
                case 2:
                    reserva.excluirPassagem();
                    break;
                case 3:
                    reserva.exibir();
                    break;
                case 4:
                    sairDoLoop = true;
                    break;
                default:
                    System.out.println("Opção invalida! ");
                    break;
            }
        }
    }
}
