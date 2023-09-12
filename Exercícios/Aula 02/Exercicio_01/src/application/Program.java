package application;

import java.util.Scanner;

/*Número primo é um número que não pode ser exatamente dividido por nenhum outro número além de 1 e ele próprio.*/
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Instanciando a classe que verifica se é número primo
        VerificaNumPrimos verificaNumPrimos = new VerificaNumPrimos();

        System.out.print("Até qual número você deseja verificar se um número é primo: ");
        int numMax = sc.nextInt();

        int numDigitado = numMax;

        for (int i = 0; i <= numMax; i++){
            if (verificaNumPrimos.TestePrimo(i)) {
                    System.out.print(i + " ");
            }

        }

        sc.close();
    }
}
