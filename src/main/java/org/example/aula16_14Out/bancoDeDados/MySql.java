package org.example.aula16_14Out.bancoDeDados;

public class MySql implements BancoDeDados {
    @Override
    public void conectar() {
        System.out.println("Conectando ao MySql...");
    }
}
