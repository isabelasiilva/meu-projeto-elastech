package org.example.aula21_atividade21Out.adapter;

public class Main {
    public static void main(String[] args) {
        // Não funciona:
        //Pagamento payPalApi = new PayPalAPI();

        // Com adapter:
        Pagamento payPalAdapter = new PayPalAdapter();
        payPalAdapter.pagar();
    }
}
