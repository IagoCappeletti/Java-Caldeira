package application;

import entities.DiaDaSemana;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("segunda - terca - quarta - quinta - sexta - sabado - domingo");
        System.out.print("Digite um dia da semana: ");
        String diaDigitado = sc.nextLine().toUpperCase();

        DiaDaSemana dia = DiaDaSemana.valueOf(diaDigitado);

        switch (dia) {
            case SEGUNDA:
                System.out.println("Hoje é segunda-feira.");
                break;
            case TERCA:
                System.out.println("Hoje é terça-feira.");
                break;
            case QUARTA:
                System.out.println("Hoje é quarta-feira.");
                break;
            case QUINTA:
                System.out.println("Hoje é quinta-feira.");
                break;
            case SEXTA:
                System.out.println("Hoje é sexta-feira.");
                break;
            case SABADO:
                System.out.println("Hoje é sábado.");
                break;
            case DOMINGO:
                System.out.println("Hoje é domingo.");
                break;
            default:
                System.out.println("Dia inválido! ");
        }
    }
}
