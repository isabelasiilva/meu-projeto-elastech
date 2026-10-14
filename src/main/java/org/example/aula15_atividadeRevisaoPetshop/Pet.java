package org.example.aula15_atividadeRevisaoPetshop;

public class Pet {
    private String nome;
    private String especie;
    private double peso;
    private String porte;

    public Pet() {}

    public Pet(String nome, String especie, double peso, String porte) {
        this.nome = nome;
        this.especie = especie;
        this.peso = peso;
        this.porte = porte;
    }

    public String verificaPorteDoPet(){
        if (this.getPeso() < 10) {
            return "Pequeno";
        } else if (this.getPeso() >= 10 && this.getPeso() < 25) {
            return "Médio";
        } else{
            return "Grande";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
}
