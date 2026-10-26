package org.example.aula24_26Out.atividadeObserver;

public class PainelAeroporto implements ObservadorVoo {
    @Override
    public void atualizar(String status) {
        System.out.println("Painel do aeroporto: " + status);
    }
}
