package org.example.aula11_listaRevisao04Out.classesEObjetos;

public class Pet {
    String nome;
    String raca;
    double peso;

    public Pet(String nome, String raca, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
    }

    public void apresentarPet() {
        System.out.printf("O nome do pet é %s, ele é da raça %s e tem %.1f kg \n", this.nome, this.raca, this.peso);
    }
}
