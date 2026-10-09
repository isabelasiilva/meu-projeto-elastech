package org.example.aula11_listaRevisao04Out.classesEObjetos;

public class Jogadora {
    private final String nome;
    private final int pontos;

    public Jogadora(String nome, int pontos) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome da jogadora é obrigatório.");
        }
        if (pontos < 0) {
            throw new IllegalArgumentException("A pontuação não pode ser negativa.");
        }
        this.nome = nome.trim();
        this.pontos = pontos;
    }

    public String getNome() { return nome; }
    public int getPontos() { return pontos; }

    public static void comparar3Jogadoras(Jogadora a, Jogadora b, Jogadora c) {
        if (a == null || b == null || c == null) {
            throw new IllegalArgumentException("As três jogadoras são obrigatórias.");
        }
        int maiorPontuacao = Math.max(a.getPontos(), Math.max(b.getPontos(), c.getPontos()));
        StringBuilder vencedoras = new StringBuilder();

        if (a.getPontos() == maiorPontuacao) {
            vencedoras.append(a.getNome());
        }
        if (b.getPontos() == maiorPontuacao) {
            adicionarNome(vencedoras, b.getNome());
        }
        if (c.getPontos() == maiorPontuacao) {
            adicionarNome(vencedoras, c.getNome());
        }

        if (vencedoras.indexOf(", ") >= 0) {
            System.out.println("Empate entre " + vencedoras + " com " + maiorPontuacao + " pontos");
        } else {
            System.out.println(vencedoras + " tem a maior pontuação: " + maiorPontuacao);
        }
    }

    private static void adicionarNome(StringBuilder nomes, String nome) {
        if (nomes.length() > 0) {
            nomes.append(", ");
        }
        nomes.append(nome);
    }
}
