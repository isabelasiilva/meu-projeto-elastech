package org.example.aula15_atividadeRevisaoPetshop;

public class Gato extends Pet{
    @Override
    public void emitirSom(){
        System.out.println(getNome() + " está miando");
    }
}
