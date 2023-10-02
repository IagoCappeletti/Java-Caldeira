package entities;

public class Calculadora implements Calculavel {

    public Calculadora() {}

    @Override
    public int adicionar(int primeiroNumero, int segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    @Override
    public int subtrair(int primeiroNumero, int segundoNumero) {
            return primeiroNumero - segundoNumero;
    }

        @Override
        public int multiplicar (int primeiroNumero, int segundoNumero){
            return primeiroNumero * segundoNumero;
        }

        @Override
        public double dividir ( int primeiroNumero, int segundoNumero){
            if (segundoNumero == 0) {
                throw new ArithmeticException("Não divisão por zero: ");
            }
            return (double) primeiroNumero /segundoNumero;
        }
    }
