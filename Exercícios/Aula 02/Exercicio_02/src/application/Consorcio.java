package application;

public class Consorcio {

    public boolean VerificaConsorcio(String nome, int idade, double salario) {
        boolean atendeRequisitos = idade >= 18 && salario >= 2000;

        if (idade >= 18 && salario >= 2000) {
            System.out.printf("\nParabéns! %s, você se encaixa nos requisitos para a compra do automovel !", nome);
        } else {
            System.out.printf("\nDesculpe %s, você não pode comprar um automóvel.", nome);
            if (idade < 18) {
                System.out.println("\nVocê deve ser maior de 18 anos.");
            }
            if (salario < 2000) {
                System.out.println("Seu salário deve ser igual ou superior a R$ 2.000,00.");
            }
        }
        return atendeRequisitos;
    }
}
