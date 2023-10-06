package caldeira.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> listaNomes = Arrays.asList("Iago", "Larissa", "João", "piaaaaaaaaaaaaaaaaaaaaaa", "Larissa", "Iago", "Iago", "Iago");

        long count = listaNomes.stream().count();
        System.out.println("Tamanho da lista " + count);

        /*.max(Comparator.comparingInt(String::length)): Nesta parte, você está usando a operação max do stream
             para encontrar o elemento máximo na sequência. No entanto, você precisa fornecer um comparador que
             determine como os elementos devem ser comparados para determinar o máximo.
             O Comparator.comparingInt(String::length) faz isso. Ele compara os elementos da sequência (nomes) com
             base em seu comprimento (número de caracteres), e isso é feito usando a referência de método String::length. */
        String maiorNome = listaNomes.stream().max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println("O maior nome é: " + maiorNome);

        Map<String, Long> contagemStrings = listaNomes.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        contagemStrings.entrySet().stream()
                .sorted((entry1, entry2) -> Long.compare(entry2.getValue(), entry1.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}

