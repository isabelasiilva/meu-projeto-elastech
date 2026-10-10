package org.example.aula12_05Out;

import java.util.HashMap;

public class AtividadeHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer>nomes = new HashMap<>();
        nomes.put("Isa", 27);
        nomes.put("Alexandre", 25);
        nomes.put("Martin", 25);

        System.out.println(nomes);
        System.out.println(nomes.get("Alexandre"));

        HashMap<String, Double>produtos = new HashMap<>();
        produtos.put("Café", 5.00);
        System.out.println(produtos.get("Café"));
        System.out.println(produtos);
        produtos.put("Café", 7.50); // sobrescreve o café de R$5,00
        System.out.println(produtos.get("Café"));
        System.out.println(produtos);

        HashMap<String, String>agenda = new HashMap<>();
        agenda.put("Mariana", "1837190-9382");
        agenda.put("Thiago", "729380-2422");

        if (agenda.containsKey("Mariana")) {
            System.out.println("Esse nome está na agenda");
        } else {
            System.out.println("Esse nome não está na agenda");
        }

        if (agenda.containsKey("Marcelo")) {
            System.out.println("Esse nome está na agenda");
        } else {
            System.out.println("Esse nome não está na agenda");
        }

        HashMap <String, Integer>estoque = new HashMap<>();
        estoque.put("Camiseta", 25);
        estoque.put("Bermuda", 32);

        System.out.println(estoque.getOrDefault("Camiseta", 76));
        System.out.println(estoque.getOrDefault("Calça", 0)); // não consta na lista, retorna 0
        System.out.println(estoque.get("Calça")); // não consta na lista, retorna null

        HashMap <String, Integer>notas = new HashMap<>();
        notas.put("Tatiana", 9);
        notas.put("Fernanda", 6);
        notas.put("Gabriela", 8);
        System.out.println(notas);
        System.out.println(notas.size());
        System.out.println(notas.remove("Tatiana")); // retorna o valor que estava associado à chave
        System.out.println(notas);
        System.out.println(notas.size());
    }

}
