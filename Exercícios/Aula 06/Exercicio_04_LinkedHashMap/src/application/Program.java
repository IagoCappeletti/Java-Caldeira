package application;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        LinkedHashMap<String, Double> listaProdutos = new LinkedHashMap<>();

        listaProdutos.put("Ps5", 5000.0);
        listaProdutos.put("Televisão", 2500.0);
        listaProdutos.put("Controle de Ps5", 500.0);
        listaProdutos.put("Teclado", 350.0);


        System.out.println("Lista de Produtos: ");
        for (Map.Entry<String, Double> mapElementos : listaProdutos.entrySet()) {
            System.out.println(mapElementos.getKey() + " " + mapElementos.getValue());
        }
    }
}
