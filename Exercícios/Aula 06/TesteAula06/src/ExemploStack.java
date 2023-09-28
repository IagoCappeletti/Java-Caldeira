import java.io.*;
import java.util.*;
public class ExemploStack {
    public static void main(String[] args) {

        /*empilhar (push),  desempilhar (pop) elementos, verificar se está vazia (empty),
        procurar elementos (search) e espiar o que tem no topo (peek)*/

        // Tamanho do stack
        int n = 5;

        // Criando uma pilha
        Stack<Integer> pilha = new Stack<Integer>();

        // Adicionando novos elementos ao fim da lista
        for (int i = 1; i <= n; i++)
            pilha.push(i);

        // Imprimindo elementos
        System.out.println("Olha só o que tem na pilha: " + pilha);


        // Removendo elemento do topo da pilha
        int elementoRemovido = pilha.pop(); // Remove o elemento do topo
        System.out.println("Depois de remover o elemento do topo: " + pilha);
        System.out.println("Elemento removido: " + elementoRemovido);

        // Verificando se a pilha está vazia
        boolean vazia = pilha.empty();
        System.out.println("A pilha está vazia? " + vazia);

        // Procurando um elemento na pilha
        int posicao = pilha.search(4); // Procurando o número 4 na pilha
        System.out.println("Posição do elemento 4 na pilha: " + posicao);

        // Dá pra ver o que tem no topo sem tirar
        int elementoNoTopo = pilha.peek();
        System.out.println("Elemento no topo da pilha: " + elementoNoTopo);
    }
}
