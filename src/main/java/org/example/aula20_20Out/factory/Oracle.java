package org.example.aula20_20Out.factory;

public class Oracle implements BancoDeDados {
    @Override
    public void proibidoFazerBarulhoAposDezHoras() {
        System.out.println("Barulho Oracle");
    }
}
