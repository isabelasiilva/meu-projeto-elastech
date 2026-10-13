package org.example.aula14_07Out;

import java.util.ArrayList;
import java.util.List;

public class AtividadeForeach {
    public static void main(String[] args) {
        System.out.println("--- Exercício 1 ---");

        String[] listaNomes = {"Bia", "Luana", "Carol", "Ana"};
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        System.out.println("--- Exercício 2 ---");
        ArrayList<Integer> listaNotas = new ArrayList<>();
        listaNotas.addAll(List.of(8, 6, 10, 7));
        for  (Integer nota : listaNotas) {
            System.out.println(nota);
        }

        System.out.println("--- Exercício 3 ---");
        int soma = 0;
        int media = 0;
        for (Integer nota : listaNotas) {
            soma += nota;
        }

        media = soma / listaNotas.size();
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);

        System.out.println("--- Exercício 4 ---");
        ArrayList<String> listaNomes2 = new ArrayList<>();
        listaNomes2.addAll(List.of("Ana", "Bia", "Maria", "Isabela", "Beatriz", "Mariana"));
        int contadorNomes = 0;

        for (String nome : listaNomes2) {
            if (nome.length() > 5) {
                contadorNomes++;
            }
            System.out.println(nome);
        }

        System.out.println("Há " + contadorNomes + " nomes com mais de 5 letras.");

        System.out.println("--- Exercício 5 ---");
        // exercicio 1 com foreach
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        // exercicio 1 com for tradicional
        for (int i = 0; i < listaNomes.length; i++) {
            System.out.println(listaNomes[i]);
        }
    }
}
