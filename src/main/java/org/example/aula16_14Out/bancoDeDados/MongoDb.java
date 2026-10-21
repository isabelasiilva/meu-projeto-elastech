package org.example.aula16_14Out.bancoDeDados;

public class MongoDb implements BancoDeDados {
    @Override
    public void conectar() {
        System.out.println("Conectando ao MongoDb...");
    }
}
