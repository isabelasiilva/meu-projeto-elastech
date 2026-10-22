package org.example.aula21_atividade21Out.factory;

public class AnimalFactory {
    public static Animal getAnimal(String tipo){
        if (tipo.equalsIgnoreCase("gato")){
            return new Gato();
        } else if(tipo.equalsIgnoreCase("cachorro")){
            return new Cachorro();
        } else {
            throw new IllegalArgumentException("Opção inválida");
        }
    }
}
