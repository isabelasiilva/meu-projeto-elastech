package org.example.aula23_23Out.atividade;

public class CalculadoraDesconto {
    public double aplicarDesconto(double valorCompra, boolean clienteVip) {
        if (valorCompra <= 0) { // se o valor for menor ou igual a zero lança a exceção
            throw new IllegalArgumentException("O valor da compra deve ser maior que zero.");
        }

        if (clienteVip) { // se o cliente for VIP, ganha 10% de desconto
            return valorCompra * 0.90;
        }

        // se o valor for menor que R$100 e não for VIP, retorna o próprio valor sem desconto
        return valorCompra;
    }
}
