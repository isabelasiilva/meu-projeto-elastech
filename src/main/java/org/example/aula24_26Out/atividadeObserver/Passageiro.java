package org.example.aula24_26Out.atividadeObserver;

public class Passageiro implements ObservadorVoo {
    @Override
    public void atualizar(String status) {
        System.out.println("Passageiro avisado: " + status);
    }
}
