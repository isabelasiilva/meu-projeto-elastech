package org.example.aula15_atividadeRevisaoPetshop;

public class Pet {
    private String nome;
    private String especie;
    private double peso;
    private String porte;

    public void verificaPorteDoPet(){
        if (this.getPeso() < 10) {
            porte = "Pequeno";
        } else if (this.getPeso() >= 10 && this.getPeso() < 25) {
            porte = "Médio";
        } else{
            porte = "Grande";
        }
    }

    public void emitirSom(){
        System.out.println(nome + " está fazendo som");
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
        verificaPorteDoPet();
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
}
