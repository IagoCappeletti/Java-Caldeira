package application;

import entities.Carro;
import entities.Moto;

public class Program {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.imprimirDados("volkswagen", "Polo", 2023);
        carro.calcularCustoViagem(30);

        moto.imprimirDados("Honda", "Titan", 2022);
        moto.calcularCustoViagem(25);


    }
}
