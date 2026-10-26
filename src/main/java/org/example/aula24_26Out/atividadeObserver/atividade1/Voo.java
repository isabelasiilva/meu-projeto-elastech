package org.example.aula24_26Out.atividadeObserver.atividade1;

import java.util.ArrayList;

public class Voo {
    ArrayList<ObservadorVoo> voos =  new ArrayList<>();

    public void adicionarObservador(ObservadorVoo o){
        voos.add(o);
    }

    public void mudarStatus(String status){
        for(ObservadorVoo o : voos){
            o.atualizar(status);
        }
    }
}
