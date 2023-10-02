package application;

import entities.Calculadora;
import entities.Operacoes;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        try {
            System.out.println("==== Operaçãos matemáticas ====");
            for (Operacoes operacoes : Operacoes.values()) {
                System.out.println(operacoes.name());
            }
            System.out.print("Digite a operação desejada: ");
            Operacoes operacoes = Operacoes.valueOf(sc.nextLine().toUpperCase());

            System.out.print("Digite o primeiro número: ");
            int primeiroNumero = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int segundoNumero = sc.nextInt();

            switch (operacoes) {
                case SOMAR -> System.out.println("Resultado: " + calc.adicionar(primeiroNumero, segundoNumero));
                case SUBTRAIR -> System.out.println("Resultado: " + calc.subtrair(primeiroNumero, segundoNumero));
                case MULTIPLICAR -> System.out.println("Resultado: " + calc.multiplicar(primeiroNumero, segundoNumero));
                case DIVIDIR -> calc.dividir(primeiroNumero, segundoNumero);
                default -> System.out.println("Operação inválida");
            }
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
