package org.example.aula16_14Out.bancoDoBrasil;

public class PagamentoPix implements Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento Pix");
    }
}
