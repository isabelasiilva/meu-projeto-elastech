package org.example.aula13_06Out;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Scanner;

public class AtividadeQueue {
    public static void main(String[] args) {
        System.out.println("--- Exercício 1 ---");
        ArrayDeque<String> listaNomes = new ArrayDeque<>();
        listaNomes.add("Ana");
        listaNomes.add("Maria");
        listaNomes.add("Marcia");
        System.out.println(listaNomes);
        System.out.println("A lista tem " + listaNomes.size() + " elementos");

        System.out.println("--- Exercício 2 ---");
        ArrayDeque<String> listaGeneros = new ArrayDeque<>();
        listaGeneros.addAll((List.of("Romance", "Científico", "Terror", "Documentário")));

        System.out.println("O primeiro item da lista é: " + listaGeneros.peek());
        System.out.println(listaGeneros);

        System.out.println("--- Exercício 3 ---");
        System.out.println("Vamos remover o primeiro item da lista: " + listaGeneros.poll());
        System.out.println(listaGeneros);

        System.out.println("--- Exercício 4 ---");
        ArrayDeque<String> listaConsultorio = new ArrayDeque<>();
        listaConsultorio.addAll(List.of("Isabela", "Raquel", "Caio"));
        System.out.println("A lista tem " + listaConsultorio.size() + " elementos. E os seguintes pacientes: " + listaConsultorio);
        while (!listaConsultorio.isEmpty()) {
            System.out.println("Atender o proximo paciente: " + listaConsultorio.poll());
        }
        System.out.println("Fila vazia");

        System.out.println("--- Exercício 5 ---");
        ArrayDeque<String> listaNomes2 = new ArrayDeque<>();
        listaNomes2.addAll(List.of("Viviane", "Anália"));
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        do {
            System.out.println("Digite um nome para buscarmos na lista:");
            String nome = sc.nextLine();
            if (listaNomes.contains(nome)) {
                System.out.println("Nome " + nome + " encontrado");
            } else {
                System.out.println("Nome não encontrado: " + nome);
            }
            contador++;
        } while (contador <2);

        System.out.println("--- Exercício 6 ---");
        ArrayDeque<String> listaNomes3 = new ArrayDeque<>();
        if (listaNomes3.isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            System.out.println("Próximo: " + listaNomes3.peek());
        }

        listaNomes3.add("Ana");
        if (listaNomes.isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            System.out.println("Próximo: " + listaNomes3.peek());
        }

    }
}
