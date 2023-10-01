package application;

import entities.Circulo;
import entities.Quadrado;

public class Program {
    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();

        circulo.desenha();
        quadrado.desenha();

    }
}
