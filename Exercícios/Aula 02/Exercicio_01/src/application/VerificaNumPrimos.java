package application;

public class VerificaNumPrimos {

    // Método para verificar se um número é primo
    public boolean TestePrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) { /* Enquanto i for menor ou igual à raiz quadrada de numero.*/
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}
