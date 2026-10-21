package org.example.aula16_14Out.bancoDoBrasil;

public class PagamentoBoleto implements Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento Boleto");
    }
}
