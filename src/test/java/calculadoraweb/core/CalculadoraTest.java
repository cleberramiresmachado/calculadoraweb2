package calculadoraweb.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Testes para {@link Calculadora}
 **/
public class CalculadoraTest {

    @Test
    public void testAdicionar() {
        double resultado = 2;
        assertEquals(resultado, Calculadora.adicionar(1, 1));
    }

    @Test
    public void testSubtrair() {
        double resultado = 1;
        assertEquals(resultado, Calculadora.subtrair(2, 1));
    }

    @Test
    public void testDividir() {
        double resultado = 1.5;
        assertEquals(resultado, Calculadora.dividir(3, 2));
    }

    @Test
    public void testDividirPositivoPorZero() {
        double resultado = Double.POSITIVE_INFINITY;
        assertEquals(resultado, Calculadora.dividir(3, 0));
    }

    @Test
    public void testDividirNegativoPorZero() {
        double resultado = Double.NEGATIVE_INFINITY;
        assertEquals(resultado, Calculadora.dividir(-3, 0));
    }

    @Test
    public void testMultiplicar() {
        double resultado = 3;
        assertEquals(resultado, Calculadora.multiplicar(1.5, 2));
    }

}
