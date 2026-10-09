package org.example.aula11_listaRevisao04Out.classesEObjetos;

public class Aluna {
    private final String nome;
    private final double nota1;
    private final double nota2;

    public Aluna(String nome, double nota1, double nota2) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome da aluna é obrigatório.");
        }
        validarNota(nota1);
        validarNota(nota2);
        this.nome = nome.trim();
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() { return nome; }
    public double getNota1() { return nota1; }
    public double getNota2() { return nota2; }
    public double getMedia() { return (nota1 + nota2) / 2; }

    public void relatorioAluna(){
        System.out.println("Aluna: " + nome + " \t Nota 1: " + nota1 + " \t Nota 2: " + nota2 + " \t Média: " + getMedia() + "\n");
    }

    private static void validarNota(double nota) {
        if (!Double.isFinite(nota) || nota < 0 || nota > 10) {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
        }
    }
}
