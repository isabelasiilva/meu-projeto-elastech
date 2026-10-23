package org.example.aula21_atividade21Out.factory;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = AnimalFactory.getAnimal("gato");
        Animal animal2 = AnimalFactory.getAnimal("cachorro");

        animal1.emitirSom();
        animal2.emitirSom();
    }
}
