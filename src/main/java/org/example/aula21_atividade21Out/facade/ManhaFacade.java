package org.example.aula21_atividade21Out.facade;

public class ManhaFacade {
    private Despertador despertador = new Despertador();
    private Cafeteira cafeteira = new Cafeteira();
    private Chuveiro chuveiro = new Chuveiro();

    void acordar(){
        despertador.desligar();
        cafeteira.fazerCafe();
        chuveiro.ligar();
    }
}
