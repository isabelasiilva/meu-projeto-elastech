package org.example.aula17_14Out.bancoDeDados;

public class MySql implements BancoDeDados {
    @Override
    public void conectar() {
        System.out.println("Conectando ao MySql...");
    }
}
