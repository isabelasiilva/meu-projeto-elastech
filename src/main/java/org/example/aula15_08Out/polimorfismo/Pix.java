package org.example.aula15_08Out.polimorfismo;

public class Pix implements MeioDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagando %.2f no Pix\n", valor);
    }
}
