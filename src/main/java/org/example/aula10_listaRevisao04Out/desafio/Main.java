package org.example.aula10_listaRevisao04Out.desafio;

import org.example.aula10_listaRevisao04Out.LeitorEntrada;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(new LeitorEntrada());
        menu.mostrarMenu();

    }
}
