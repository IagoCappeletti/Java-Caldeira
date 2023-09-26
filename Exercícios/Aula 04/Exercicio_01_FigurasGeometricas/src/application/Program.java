package application;

import entities.Circulo;
import entities.FormaGeometrica;
import entities.Retangulo;
import entities.Triangulo;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<FormaGeometrica> formas = new ArrayList<>();

        formas.add(new Circulo(2));
        formas.add(new Triangulo(5,10));
        formas.add(new Retangulo(7, 23));

        for (FormaGeometrica forma : formas) {
            System.out.println("Área da forma: " + String.format("%.2f", forma.calcularArea()));
        }
        }
    }
