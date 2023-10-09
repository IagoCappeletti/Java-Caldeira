package caldeira.java;

import caldeira.java.calculadora.Calculadora;
import caldeira.java.excecoes.DivisorZeroException;

public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        try {
            System.out.println(calc.dividir(10,2));
            System.out.println(calc.dividir(10,0));
        }catch (DivisorZeroException e) {
            System.out.println(e.getMessage());
        }

    }
}