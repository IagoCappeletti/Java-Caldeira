package caldeira.java.excecoes;

public class DivisorZeroException extends RuntimeException{

    public DivisorZeroException() {
        super("O divisor não pode ser zero!");
    }
}
