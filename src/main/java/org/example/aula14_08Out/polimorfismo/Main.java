package org.example.aula14_08Out.polimorfismo;

import org.example.aula14_08Out.heranca.Pessoa;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Exercício 1 ---");
        Calculadora calculadora = new Calculadora();
        calculadora.calcularArea(2.0);
        calculadora.calcularArea(2.0, 3.0);
        calculadora.calcularArea(4);

        System.out.println("--- Exercício 2 ---");
        Painel painel = new Painel();
        painel.exibir("texto");
        painel.exibir(10);
        painel.exibir(true);
        painel.exibir(10.2);

        System.out.println("--- Exercício 3 ---");
        Aluna maria = new Aluna();
        maria.setNome("Maria");
        maria.setIdade(20);
        maria.setCurso("Java e IA");

        Professora flora = new Professora();
        flora.setNome("Flora");
        flora.setIdade(30);
        flora.setDisciplina("Java e IA");

        maria.apresentar();
        maria.estudar();
        flora.apresentar();
        flora.lancarNota(maria, 8.6);

        System.out.println("--- Exercício 4 ---");
        Pessoa beatriz = new Estagiaria();
        beatriz.setNome("Beatriz");
        beatriz.setIdade(24);
        beatriz.apresentar();

        System.out.println("--- Exercício 5 ---");
        mostrarFicha(maria);
        mostrarFicha(flora);
        mostrarFicha(beatriz);

        System.out.println("--- Exercício 6 ---");
        MeioDePagamento forma;
        forma = new Pix();
        forma.pagar(150.00);
        forma = new Boleto();
        forma.pagar(150.00);

        System.out.println("--- Exercício 7 ---");
        flora.apresentar("Professora de ensino fundamental");
    }

    static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }
}
