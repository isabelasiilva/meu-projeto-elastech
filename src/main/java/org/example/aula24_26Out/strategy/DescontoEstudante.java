package org.example.aula24_26Out.strategy;

public class DescontoEstudante implements Desconto {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.10;
    }

}
