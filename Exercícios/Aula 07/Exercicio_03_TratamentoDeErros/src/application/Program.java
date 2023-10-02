package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;
        int soma;

        try {
            System.out.print("Digite um número: ");
            primeiroNumero = sc.nextInt();
            System.out.print("Digite outro número: ");
            segundoNumero = sc.nextInt();
            soma = primeiroNumero + segundoNumero;
            System.out.printf("A soma entre %d + %d é %d", primeiroNumero, segundoNumero, soma);
        }catch (InputMismatchException e) {
            System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            sc.close();
        }
    }
}
