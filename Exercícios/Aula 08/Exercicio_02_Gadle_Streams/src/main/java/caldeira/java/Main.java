package caldeira.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Produto> produtosList = Arrays.asList(
                new Produto("Pc", 3500, 3),
                new Produto("Televisão", 2500, 23),
                new Produto("Teclado", 400, 11)
        );

           /*Clase Optional serve para lidar com valores que podem ser nulos, de uma maneira mais segura e expressiva.
           Ela é usada principalmente para evitar exceções do tipo NullPointerException ao acessar
           valores que podem ser nulos.*/
        Optional<Produto> maiorPreco = produtosList.stream().max(Comparator.comparingDouble(Produto::getPreco));
        Produto produto = maiorPreco.get();
        System.out.println("Produto com maior preço: " + produto.getNome() + " - Preço: " + produto.getPreco());

        double totValorProdutos = produtosList.stream().mapToDouble(Produto::getPreco).sum();
        System.out.printf("Preço total dos produtos é %.2f", totValorProdutos);

        List<Produto> produtosPelaQuantidade = produtosList.stream()
                .filter(p -> p.getQuantidade() > 10)
                .toList();

        System.out.println("\nProdutos com quantidade maior que 10: ");
        if (produtosPelaQuantidade.isEmpty()) {
            System.out.println("Sem produtos com mais de 10 unidades!");
        } else {
            produtosPelaQuantidade.forEach(p -> System.out.println("Produto: " + p.getNome() + ", unidades: " + p.getQuantidade()));
        }

    }
}