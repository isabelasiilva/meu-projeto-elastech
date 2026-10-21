package org.example.aula15_atividadeRevisaoPetshop.pets;

import org.example.aula15_atividadeRevisaoPetshop.Pet;

public class Gato extends Pet {
    @Override
    public void emitirSom(){
        System.out.println(getNome() + " está miando");
    }
}
