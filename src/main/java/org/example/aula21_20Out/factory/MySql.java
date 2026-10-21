package org.example.aula21_20Out.factory;

public class MySql implements BancoDeDados {
    @Override
    public void proibidoFazerBarulhoAposDezHoras() {
        System.out.println("Barulho MySql");
    }
}
