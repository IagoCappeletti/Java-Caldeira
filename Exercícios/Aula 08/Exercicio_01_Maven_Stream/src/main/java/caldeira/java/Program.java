package caldeira.java;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<String> listaNomes =  Arrays.asList("Iago", "Pedro","Larissa", "João");

        long count = listaNomes.stream().count();
        System.out.println("Tamanho da lista " + count);

        String maiorNome = listaNomes.stream().findFirst().get();
        System.out.println("O maior nome é: " + maiorNome);

    }
}
