package application;

public class FilaDePrioridade {

    public void VerificaPrioridade(int num) {
        switch (num) {
            case 1 -> System.out.println("Você recebeu a senha da fila prioritária de gestante.");
            case 2 -> System.out.println("Você recebeu a senha da fila prioritária de idosos.");
            case 3 -> System.out.println("Você recebeu a senha da fila prioritária de deficiente.");
            case 4 -> System.out.println("Você recebeu a senha da fila comum.");
            default -> System.out.println("Opção inválida! Tente novamente.");
        }
    }
}
/*switch com setas  introduzida no java 12 com o intuito de simplificar a sintaxe da estrutura*/