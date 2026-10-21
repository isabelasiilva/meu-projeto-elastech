package org.example.aula10_listaRevisao04Out.desafio;

import org.example.aula10_listaRevisao04Out.LeitorEntrada;

public class Menu {
    private final LeitorEntrada entrada;
    private final Filme[] listaFilmes = new Filme[5];
    private int contadorFilme = 0;

    public Menu(LeitorEntrada entrada) {
        if (entrada == null) {
            throw new IllegalArgumentException("O leitor de entrada é obrigatório.");
        }
        this.entrada = entrada;
    }

    public void mostrarMenu(){
        boolean condicaoMenu = true;
        while(condicaoMenu) {
            System.out.println("=== MEU CATÁLOGO === \n" +
                    "1 - Cadastrar filme \n" +
                    "2 - Listar filmes \n" +
                    "3 - Buscar por título \n" +
                    "4 - Estatísticas \n" +
                    "5 - Sair \n");
            int opcao = entrada.lerInteiro("Escolha:");
            entrada.consumirFimDaLinha();

            switch (opcao) {
                case 1:
                    cadastrarFilme();
                    break;
                case 2:
                    listarFilmes();
                    break;
                case 3:
                    buscarFilmes();
                    break;
                case 4:
                    verEstatisticas();
                    break;
                case 5:
                    System.out.println("Escolheu a opção 5");
                    condicaoMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void cadastrarFilme(){
        if (contadorFilme == listaFilmes.length) {
            System.out.println("O catálogo está cheio.");
            return;
        }

        String titulo = entrada.lerTextoNaoVazio("Digite o título do filme:");
        String genero = entrada.lerTextoNaoVazio("Digite o gênero do filme:");
        double nota = entrada.lerDouble("Digite a nota do filme:");
        if (!Double.isFinite(nota) || nota < 0 || nota > 10) {
            System.out.println("A nota deve estar entre 0 e 10.");
            return;
        }

        Filme filme = new Filme(titulo, genero.toUpperCase(), nota);
        listaFilmes[contadorFilme] = filme;
        contadorFilme++;
    }

    private String calcularNota(Filme filme){
        double nota = filme.getNota();
        if (nota >= 8) {
            return "Ótimo";
        } else if (nota >= 5 && nota < 7.9) {
            return "Bom";
        } else {
            return "Ruim";
        }
    }

    private void listarFilmes(){
            for (int i = 0; i < contadorFilme; i++) {
                String classificacao = calcularNota(listaFilmes[i]);
                System.out.println("Título: " + listaFilmes[i].getTitulo()+ " Gênero: " + listaFilmes[i].getGenero() +  " Nota: " + listaFilmes[i].getNota() + " - " + classificacao);
            }
    }

    private void buscarFilmes(){
            String titulo = entrada.lerTexto("Digite o titulo do filme:");
            boolean condicaoFilme = false;

            for (int i = 0; i < contadorFilme; i++) {
                String titulosCadastrados = listaFilmes[i].getTitulo().toLowerCase().trim();
                if (titulosCadastrados.contains(titulo.trim().toLowerCase())) {
                    condicaoFilme = true;
                }
            }
            if (condicaoFilme) {
                System.out.println("O filme está na lista");
            } else {
                System.out.println("O filme nao está na lista");
            }
    }

    private void verEstatisticas(){
        double somaNotas = 0;
        double mediaNotas = 0;
        double maiorNota = 0;
        String nomeMaiorNota = "";
        int contadorNotasOtimo = 0;

        for (int i = 0; i < contadorFilme; i++) {
            somaNotas += listaFilmes[i].getNota();

            if (listaFilmes[i].getNota() >= 8 ) {
                contadorNotasOtimo ++;
            }
            if (listaFilmes[i].getNota() > maiorNota ) {
                maiorNota = listaFilmes[i].getNota();
                nomeMaiorNota = listaFilmes[i].getTitulo();
            }
        }

        mediaNotas = somaNotas / contadorFilme;

        System.out.println("Há " + contadorFilme + " filmes cadastrados.");
        System.out.printf("A média das notas é: %.2f%n", mediaNotas);
        System.out.println("O filme com maior nota é " + nomeMaiorNota);
        System.out.println("Há " + contadorNotasOtimo + " filmes classificados como ótimo.");
    }
}
