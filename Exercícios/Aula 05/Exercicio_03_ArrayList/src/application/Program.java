package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<Tarefa> listaDetarefas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("#1 - Adicionar tarefa");
            System.out.println("#2 - Remover tarefa");
            System.out.println("#3 - Exibir tarefa");
            System.out.println("#4 - Sair do programa");
            System.out.print("Qual apção você quer acessar? ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    sc.nextLine();
                    String titulo = sc.nextLine();

                    System.out.print("Digite a data da tarefa (dd/mm/yyyy): ");
                    String data = sc.nextLine();
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = sc.nextLine();

                    Tarefa novaTarefa = new Tarefa(titulo, data, descricao);
                    listaDetarefas.add(novaTarefa);
                    System.out.println("Tarefa adicionada com sucesso! ");
                    break;
                case 2:
                    for (int i = 0; i < listaDetarefas.size(); i++){
                        System.out.println("Nº" + (i + 1) + " "+listaDetarefas.get(i).getTitulo());
                    }

                    System.out.print("Qual o nome da tarefa que deseja exluir: ");
                    String excluirTarefa = sc.next();
                    for (Tarefa tarefa : listaDetarefas ){
                        if (tarefa.getTitulo().equals(excluirTarefa)) {
                            listaDetarefas.remove(tarefa);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Sua lista de tarefas: ");
                    for (Tarefa tarefa : listaDetarefas) {
                        System.out.println(tarefa);
                    }
                    break;
                case 4:
                    System.out.println("Finalizando o programa.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Opação inválida!");
            }
        }
    }
}
