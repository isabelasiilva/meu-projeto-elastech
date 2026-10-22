package org.example.aula21_atividade21Out.adapter;

public class PayPalAdapter implements Pagamento{
    @Override
    public void pagar() {
        payPalAPI.sendPayment();
    }

    private PayPalAPI payPalAPI = new PayPalAPI();

}
