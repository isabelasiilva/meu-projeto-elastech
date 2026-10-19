package org.example.aula17_14Out;

import org.example.aula17_14Out.banco.Pagamento;

public class EstudosAbstract {
    public static void main(String[] args) {

    }

    void receberPagamento(int n){}
    void receberPagamento(String a){}
    //Polimorfismo com Interfaces
    void receberPagamento(Pagamento pagamentoPix){} // pode passar os dois objetos como argumentos, desde que que a classe tenha implementado a interface
//    void receberPagamento(Pagamento variavelGenerica){}
}
