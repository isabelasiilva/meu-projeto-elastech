package org.example.aula14_08Out.polimorfismo;

public class Boleto implements  MeioDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagando %.2f no boleto\n", valor);
    }
}
