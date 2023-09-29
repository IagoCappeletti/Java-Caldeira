package application;

import Livros.Livros;

import java.util.Scanner;
import java.util.Stack;

public class Program {
    public static void main(String[] args) {

        Stack<Livros> listaDeLivro = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos livros vocês quer adicionar: ");
        int numerosDeLivros = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numerosDeLivros; i++) {
            System.out.print("Digite o nome do livro: ");
            String nomeDoLivro = sc.nextLine();
            System.out.print("Digite a categoria do livro: ");
            String categoriaDoLivro = sc.nextLine();

            Livros livro = new Livros(nomeDoLivro, categoriaDoLivro);
            listaDeLivro.push(livro);
        }

        for (Livros livro : listaDeLivro) {
            System.out.println(livro);
        }

        System.out.print("\nDigite a categoria desejada para filtrar: ");
        String categoriaDigitada = sc.nextLine();
        System.out.println("\nLivros da categoria " + categoriaDigitada + ":");
        listaDeLivro.stream()
                .filter(livro -> livro.getCategoria().equalsIgnoreCase(categoriaDigitada))
                .forEach(livro -> System.out.println(livro.getTitulo() + " - " + livro.getCategoria()));

        System.out.println();
        for (int i = numerosDeLivros; i > 0; i--) {
            Livros livrosExcluidos = listaDeLivro.pop();
            System.out.println("Livros removidos: " + livrosExcluidos.getTitulo() + ", " + livrosExcluidos.getCategoria());
            if (listaDeLivro.empty()) {
                System.out.println("\nA lista está vazia! ");
            }
        }

    }
}
