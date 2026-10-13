package org.example.aula15_08Out.heranca;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Exercício 1 ---");
        Aluna aluna = new Aluna();
        aluna.setNome("Isabela");
        aluna.setIdade(27);
        aluna.apresentar();

        System.out.println("--- Exercício 2 ---");
        aluna.setCurso("Biologia");
        aluna.estudar();

        System.out.println("--- Exercício 3 ---");
        Aluna aluna2 = new Aluna();
        aluna2.setNome("Joana");
        aluna2.setIdade(19);

        Professora professora = new Professora();
        professora.setNome("Flora");
        professora.setDisciplina("Biologia");
        professora.lancarNota(aluna2, 8.5);

        System.out.println("\n--- Exercício 4 ---");
        aluna2.apresentar();
        professora.apresentar();

        System.out.println("\n--- Exercício 5 ---");
        Diretora diretora = new Diretora();
        diretora.setNome("Maria");
        diretora.definirMeta("completar cursos");
        diretora.baterPonto();
        diretora.aprovarFerias("Rafaela");

        System.out.println("\n--- Exercício 6 ---");
        Gerente gerente = new Gerente();
        gerente.setNome("Luiz");

        gerente.baterPonto();
        gerente.aprovarFerias("Guilherme");
        gerente.exportar();
        gerente.notificar("todos devem comparecer na reunião de hoje 14h");
    }
}
