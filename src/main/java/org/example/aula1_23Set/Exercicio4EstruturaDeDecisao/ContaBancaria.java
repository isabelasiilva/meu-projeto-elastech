package org.example.aula1_23Set.Exercicio4EstruturaDeDecisao;

public class ContaBancaria {

    public static void AprovadorDeCompra(double saldoDaConta,double valorCompra) {
        double saldoRestante = saldoDaConta - valorCompra;
        if (saldoDaConta >= valorCompra) {
            System.out.println("Compra aprovada! O saldo restante: R$" + saldoRestante);
        } else {
            System.out.println("Saldo insuficiente! Faltam R$" + (saldoRestante*-1));
        }
    }
}
