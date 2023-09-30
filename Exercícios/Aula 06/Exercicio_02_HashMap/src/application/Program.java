package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> informacaoMap = new HashMap<>();

        informacaoMap.put("Iago", 22);
        informacaoMap.put("Eduardo", 23);
        informacaoMap.put("João", 72);
        informacaoMap.put("Vitoria", 66);
        informacaoMap.put("Vanderleia", 80);

        /*Imprime todos os dados do HashMap
          informacaoMap.Entry armazena a chave e o valor juntos em uma classe, obtemos os dois em uma única operação.
          As mesmas regras se aplicam ao uso de operações de fluxo do Java 8. O streaming pelo entrySet e o trabalho com
          objetos Entry são mais eficientes e podem exigir menos código.
        */
        for (Map.Entry<String, Integer> informacao : informacaoMap.entrySet()) {
            System.out.println(informacao.getKey() + " tem " + informacao.getValue() + " anos");
        }

        /*Imprime o nome e a idade digitado pelo usuário*/
        System.out.print("Qual nome você quer ver: ");
        String nome = sc.nextLine();
        if (informacaoMap.containsKey(nome)) {
            int idade = informacaoMap.get(nome);
            System.out.println(nome + " tem " + idade + " anos.");
        } else {
            System.out.println("Nome não encontrado!");
        }

        System.out.println("\nPessoas com terceira idade: ");
        /*Imprime pessoas da terceira idade*/
        boolean encontrouIdoso = false;
        for (Map.Entry<String, Integer> informacao : informacaoMap.entrySet()) {
            String nomeIdoso = informacao.getKey();
            int idadeIdoso = informacao.getValue();

            if (idadeIdoso > 60) {
                encontrouIdoso = true;
                System.out.println(nomeIdoso + " tem " + idadeIdoso + " anos.");
            }
        }

        if (!encontrouIdoso) {
            System.out.println("Nehuma pessoa de terceira idade encontrada!");
        }
    }
}
