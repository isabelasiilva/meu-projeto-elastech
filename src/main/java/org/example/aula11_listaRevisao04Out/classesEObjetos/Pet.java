package org.example.aula11_listaRevisao04Out.classesEObjetos;

public class Pet {
    private final String nome;
    private final String raca;
    private final double peso;

    public Pet(String nome, String raca, double peso) {
        this.nome = textoObrigatorio(nome, "nome");
        this.raca = textoObrigatorio(raca, "raça");
        if (!Double.isFinite(peso) || peso <= 0) {
            throw new IllegalArgumentException("O peso deve ser maior que zero.");
        }
        this.peso = peso;
    }

    public String getNome() { return nome; }
    public String getRaca() { return raca; }
    public double getPeso() { return peso; }

    private static String textoObrigatorio(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("O " + campo + " é obrigatório.");
        }
        return valor.trim();
    }

    public void apresentarPet() {
        System.out.printf("O nome do pet é %s, ele é da raça %s e tem %.1f kg \n", this.nome, this.raca, this.peso);
    }
}
