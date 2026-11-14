package org.example.aula26_29Out.atividade.atividadeStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Exercicio 1
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> numerosPares = lista.stream()
                .filter(n -> n % 2 == 0) // lambda que verifica se é par
                .collect(Collectors.toList());

        System.out.println("Números pares: " + numerosPares);

        // Exercicio 2
        List<String> frutas = Arrays.asList("maçã", "banana", "laranja", "uva", "morango");

        frutas.stream()
                .map(fruta -> fruta.toUpperCase()) // cada elemento em upperCase
                .forEach(fruta -> System.out.println(fruta));

        // Exercicio 3
        List<String> cidades = Arrays.asList("São Paulo", "Salvador", "Rio de Janeiro", "Sorocaba", "Curitiba", "Santos");

        // filtrando as cidades que começam com s e contando cada uma
        long quantidade = cidades.stream()
                .filter(cidade -> cidades.indexOf(cidade) >= 0 && cidade.startsWith("S"))
                .count(); // retorna a contagem

        System.out.println("Quantidade de cidades que começam com 'S': " + quantidade);
    }
}
