import caldeira.java.calculadora.Calculadora;
import caldeira.java.excecoes.DivisorZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();


    @Test
    void somarNumeros() {
        Assertions.assertEquals(3, calc.somar(1, 2));
    }

    @Test
    void diminuirNumeros() {
        Assertions.assertEquals(8, calc.diminuir(10, 2));
    }

    @Test
    void multiplicaNumero() {
        Assertions.assertEquals(40, calc.multiplicar(2, 20));
    }

    @Test
    void dividirNumero() {
        Assertions.assertEquals(5, calc.dividir(10, 2));
        Assertions.assertEquals(DivisorZeroException.class, calc.dividir(10, 0));
    }

    @Test
    void raizQuadrada(){
        Assertions.assertEquals(9, calc.raizQuadrada(81));
        Assertions.assertEquals(0, calc.raizQuadrada(0));
    }

    @Test
    void potencia() {
        Assertions.assertEquals(81, calc.potencia(3,4));
        Assertions.assertEquals(64, calc.potencia(4,3));
    }

}
