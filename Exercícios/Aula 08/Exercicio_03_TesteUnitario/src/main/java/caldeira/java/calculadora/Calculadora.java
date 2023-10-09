package caldeira.java.calculadora;

import caldeira.java.excecoes.DivisorZeroException;
import caldeira.java.excecoes.RaizQuadradaNegativaException;

public class Calculadora {

    public double somar(double primeiro, double segundo) {
        return primeiro + segundo;
    }

    public double diminuir(double primeiro, double segundo) {
        return primeiro - segundo;
    }

    public double multiplicar(double primeiro, double segundo) {
        return primeiro * segundo;
    }

    public double dividir(double primeiro, double segundo) {
        if (segundo == 0) {
            throw new DivisorZeroException();
        }
        return primeiro / segundo;
    }

    public double raizQuadrada(double numero) {
        if (numero < 0) {
            throw new RaizQuadradaNegativaException();
        }
        return Math.sqrt(numero);
    }

    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}
