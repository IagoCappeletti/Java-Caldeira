package caldeira.java.excecoes;

public class RaizQuadradaNegativaException extends RuntimeException{

    public RaizQuadradaNegativaException() {
        super("A raiz quadrada não pode ser número negativo");
    }
}
