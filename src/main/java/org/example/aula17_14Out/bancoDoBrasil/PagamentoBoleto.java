package org.example.aula17_14Out.bancoDoBrasil;

public class PagamentoBoleto implements Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento Boleto");
    }
}
