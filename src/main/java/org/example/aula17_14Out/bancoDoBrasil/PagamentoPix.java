package org.example.aula17_14Out.bancoDoBrasil;

public class PagamentoPix implements Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento Pix");
    }
}
