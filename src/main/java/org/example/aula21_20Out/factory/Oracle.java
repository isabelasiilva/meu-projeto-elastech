package org.example.aula21_20Out.factory;

public class Oracle implements BancoDeDados {
    @Override
    public void proibidoFazerBarulhoAposDezHoras() {
        System.out.println("Barulho Oracle");
    }
}
