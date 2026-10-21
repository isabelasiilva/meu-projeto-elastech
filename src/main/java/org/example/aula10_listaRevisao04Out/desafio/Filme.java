package org.example.aula10_listaRevisao04Out.desafio;

public class Filme {
    private final String titulo;
    private final String genero;
    private final double nota;

    public Filme(String titulo, String genero, double nota) {
        this.titulo = textoObrigatorio(titulo, "título");
        this.genero = textoObrigatorio(genero, "gênero");
        if (!Double.isFinite(nota) || nota < 0 || nota > 10) {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
        }
        this.nota = nota;
    }

    public String getTitulo() { return titulo; }
    public String getGenero() { return genero; }
    public double getNota() { return nota; }
    public String getClassificacao() {
        if (nota >= 8) return "Ótimo";
        if (nota >= 5) return "Bom";
        return "Ruim";
    }

    private static String textoObrigatorio(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("O " + campo + " é obrigatório.");
        }
        return valor.trim();
    }
}
