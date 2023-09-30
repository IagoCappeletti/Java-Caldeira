package application;

import entities.Contatos;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TreeMap<String, Contatos> agendaMap = new TreeMap<>();

        agendaMap.put("João", new Contatos("123-456-7890", "João Silva", "123 Rua A", "norte"));
        agendaMap.put("Maria", new Contatos("987-654-3210", "Maria Santos", "456 Rua B", "sul"));
        agendaMap.put("Pedro", new Contatos("567-890-1234", "Pedro Oliveira", "789 Rua C", "centro"));
        agendaMap.put("Ana", new Contatos("345-678-9012", "Ana Souza", "101 Rua D", "leste"));
        agendaMap.put("Carlos", new Contatos("234-567-8901", "Carlos Pereira", "222 Rua E", "oeste"));

        /*Imprime lista em order alfabética*/
        System.out.println("Lista em ordem alfabética");
        for (Map.Entry<String, Contatos> entry : agendaMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.print("Qual localidade você quer ver(norte, sul, leste, oeste, centro): ");
        String localidade = sc.next();
        for (Map.Entry<String, Contatos> entry : agendaMap.entrySet()) {
            Contatos contatos = entry.getValue();
            if (contatos.getLocalidade().equalsIgnoreCase(localidade)) {
                System.out.println(entry.getKey() + ": " + contatos);
            }
        }
    }
}
