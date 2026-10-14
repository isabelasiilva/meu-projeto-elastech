package org.example.aula15_atividadeRevisaoPetshop;

public class Cachorro extends Pet {
    @Override
    public void emitirSom(){
        System.out.println(getNome() + " está latindo");
    }

//    public void buscarBolinha(){
//        System.out.println(getNome() + " vai buscar a bolinha");
//    }
}
