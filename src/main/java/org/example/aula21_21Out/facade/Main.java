package org.example.aula21_21Out.facade;

public class Main {
        public static void main(String[] args) {
            //SEM FACADE
//            Estoque estoque = new Estoque();
//            Cobranca cobranca = new Cobranca();
//            NotaFiscal notaFiscal = new NotaFiscal();
//            Entrega entrega = new Entrega();
//
//            estoque.darBaixa();
//            cobranca.cobrar();
//            notaFiscal.emitir();
//            entrega.agendar();

            // DEPOIS DO FACADE - centraliza varias chamadas de métodos em um só
            CompraFacade compra = new CompraFacade();
            compra.finalizarCompra();
        }
    }