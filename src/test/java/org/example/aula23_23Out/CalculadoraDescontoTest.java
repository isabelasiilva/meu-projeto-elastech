package org.example.aula23_23Out;

import org.example.aula23_23Out.atividade.CalculadoraDesconto;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CalculadoraDescontoTest {
    @Test
    void deveRetornarMesmoValorParaCompraAbaixoDeCemClienteComum() {
        // 1. Arrange: preparar
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double valorCompra = 50.0;
        boolean clienteVip = false;

        // 2. Act: agir
        double resultado = calculadora.aplicarDesconto(valorCompra, clienteVip);

        // 3. Assert: afirmar
        assertEquals(50.0, resultado, 0.0001);
    }

    @Test
    void deveAplicarDezPorCentoDeDescontoParaClienteVisComQualquerValor() {
        // 1. Arrange: preparar
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double valorCompra = 200.0;
        boolean clienteVip = true;

        // 2. Act: agir
        double resultado = calculadora.aplicarDesconto(valorCompra, clienteVip);

        // 3. Assert: afirmar
        assertEquals(180.0, resultado, 0.0001);
    }

    @Test
    void deveLancarIllegalArgumentExceptionQuandoValorForNegativo() {
        // 1. Arrange: preparar
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double valorCompra = -10.0;
        boolean clienteVip = false;

        // 2. Act e Assert: agir e afirmar simultaneamente com assertThrows
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.aplicarDesconto(valorCompra, clienteVip);
        });
    }

}
