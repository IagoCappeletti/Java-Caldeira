package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Compra> listaCompras = new ArrayList<>();

        while (true){
            System.out.println("====== MENU ======");
            System.out.println("#1 - Adicionar produto");
            System.out.println("#2 - Remover produto");
            System.out.println("#3 - Exibir lista de produtos");
            System.out.println("#4 - Sair");

            System.out.print("Digite a sua opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Qual produto você quer adicionar na lista: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.print("Quantas unidades vai querer: ");
                    int quantidade = sc.nextInt();
                    System.out.print("Data de validade: ");
                    sc.nextLine();
                    String validade = sc.nextLine();

                    Compra novaCompra = new Compra(nome, quantidade, validade);
                    listaCompras.add(novaCompra);
                    System.out.println("Produto adicionado com sucesso! ");
                    break;

                case 2:
                    for (int i = 0; i < listaCompras.size(); i++) {
                        System.out.println("Nº" + (i + 1) + " " + listaCompras.get(i).getNome());
                    }

                    System.out.print("Qual produto você quer excluir: ");
                    String excluirTarefa = sc.next();

                    //Expressão Lambda
                    listaCompras.removeIf(compra -> compra.getNome().equals(excluirTarefa));
                    break;

                case 3:
                    System.out.println("Sua lista de produtos: ");
                    for (Compra compras : listaCompras) {
                        System.out.println(compras);
                    }
                    break;
                case 4:
                    System.out.println("Finalizando o progrma.");
                    System.exit(0);
                    sc.close();
                default:
                    System.out.println("Opção inválida! ");
            }
        }
    }
}

//Site explicando RemoveIf:  http://www.mauda.com.br/?p=2288
