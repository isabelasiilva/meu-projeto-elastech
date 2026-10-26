package org.example.aula24_26Out.atividadeObserver;

public class Main {
    public static void main(String[] args) {
        Voo voo1 = new Voo();
        Passageiro pass1 = new Passageiro();
        Passageiro pass2 = new Passageiro();

        // adicionando passageiro no voo
        voo1.adicionarObservador(pass1);
        voo1.adicionarObservador(pass2);

        voo1.mudarStatus("Embarque iniciado");

        PainelAeroporto painel1 = new PainelAeroporto();
        voo1.adicionarObservador(painel1);

        voo1.mudarStatus("Atrasado");
    }
}
