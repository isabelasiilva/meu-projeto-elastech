package org.example.aula21_21Out.facade;

public class CompraFacade {
    private Estoque estoque = new Estoque();
    private Cobranca cobranca = new Cobranca();
    private NotaFiscal notaFiscal = new NotaFiscal();
    private Entrega entrega = new Entrega();

    public void finalizarCompra() {
        estoque.darBaixa();
        cobranca.cobrar();
        notaFiscal.emitir();
        entrega.agendar();
    }
}
