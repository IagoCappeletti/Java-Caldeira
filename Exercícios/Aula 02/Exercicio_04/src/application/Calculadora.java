package application;

public class Calculadora {

    public double operacoes(double operacao, double num1, double num2) {
        if (operacao == 1) {
            double soma = num1 + num2;
            System.out.printf("A soma entre %.0f e %.0f é %.0f",num1, num2, soma);
        } else if (operacao == 2) {
            double subtracao = num1 - num2;
            System.out.printf("A subtração entre %.0f e %.0f é %.0f",num1, num2, subtracao);
        } else if (operacao == 3) {
            double multiplicacao = num1 * num2;
            System.out.printf("A multiplicação entre %.0f e %.0f é %.0f",num1, num2, multiplicacao);
        } else if (operacao == 4){
            double divisao = num1 /  num2;
            System.out.printf("A divisão entre %.0f e %.0f é %.0f",num1, num2, divisao);
        } else {
            System.out.println("Opção inválida! ");
        }
        return operacao;
    }

}
