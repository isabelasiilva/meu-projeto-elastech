package org.example.aula20_20Out.atividade;

public class MySql implements BancoDeDados {
    int numero = 1;

    @Override
    public void chamarBanco() {
        System.out.println("Chamando Banco MySql");
    }

    @Override
    public void getNumero() {
        System.out.println(numero);
    }
}
