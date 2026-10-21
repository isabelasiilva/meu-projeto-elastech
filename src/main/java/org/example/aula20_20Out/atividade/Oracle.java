package org.example.aula20_20Out.atividade;

public class Oracle implements BancoDeDados {
    int numero = 2;

    @Override
    public void chamarBanco() {
        System.out.println("Chamando Oracle");
    }

    @Override
    public void getNumero() {
        System.out.println(numero);
    }
}
