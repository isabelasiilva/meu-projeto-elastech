package org.example.aula3_listaRevisao26Set;

public class Pet {
    String nome;
    String raca;
    double peso;

    public void apresentarPet() {
        System.out.printf("O nome do seu pet é %s , ele é da raça %s e tem %.2f peso.\n", nome, raca, peso);
    }

    Pet(String nome, String raca, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
    }
}
