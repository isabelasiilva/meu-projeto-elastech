package org.example.aula24_26Out.strategy;

public class DescontoVIP implements Desconto {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.20;
    }
}
