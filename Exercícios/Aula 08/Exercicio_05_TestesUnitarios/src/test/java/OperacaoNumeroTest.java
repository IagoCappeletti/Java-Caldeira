import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperacaoNumeroTest {

    /*Fontes:
     https://www.baeldung.com/parameterized-tests-junit-5
     https://www.devmedia.com.br/teste-unitario-com-junit/41235
     */

    OperacaoNumero operacao = new OperacaoNumero();

    @Test
    @DisplayName("Verifica se o metodo está somando todos os números do Array")
    void somaNumeros() {
        int[] numero = {1, 2, 3, 4};
        assertEquals(10, operacao.somarNumeros(numero));
    }

    @Test
    @DisplayName("Verifica se os numeros sao pares")
    void verificaSeNumeroEPar() {
        assertTrue(operacao.ehPar(2));
        assertTrue(operacao.ehPar(-2));
        assertFalse(operacao.ehPar(3));
        assertFalse(operacao.ehPar(-7));
    }

    @Test
    void verificaFatorialDeZero() {
        assertThrows(IllegalArgumentException.class, () -> operacao.calcularFatorial(-1));
        assertEquals(1, operacao.calcularFatorial(0));
        assertEquals(1, operacao.calcularFatorial(1));
        assertEquals(120, operacao.calcularFatorial(5));
    }

    @Test
    void verificaSeStringEhPalindromo() {
        assertFalse(operacao.ehPalindromo("java"));
        assertTrue(operacao.ehPalindromo("anilina"));
    }

    @Test
    void verificaSequenciaFibonacci() {
        assertThrows(IllegalArgumentException.class, () -> operacao.calcularFibonacci(-6));
        assertEquals(0, operacao.calcularFibonacci(0));
        assertEquals(1, operacao.calcularFibonacci(1));
        assertEquals(233, operacao.calcularFibonacci(13));
    }
}
