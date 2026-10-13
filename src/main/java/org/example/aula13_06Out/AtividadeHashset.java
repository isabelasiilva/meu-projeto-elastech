package org.example.aula13_06Out;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AtividadeHashset {
    /*
        .add("Ana");
        .contains("Ana");
        .remove("Ana");
        .size();
        .isEmpty();
        .clear();
        new HashSet<>(lista);
        .addAll(List.of("Ana","Maria","Bia","Carla"));
     */
    public static void main(String[] args) {
        System.out.println("--- Exercício 1 ---");
        HashSet<String> listaNomesHashSet = new HashSet<String>();
        listaNomesHashSet.addAll(List.of("Ana", "Bia", "Maria","Bia"));

        System.out.println(listaNomesHashSet);
        System.out.println(listaNomesHashSet.size());

        System.out.println("--- Exercício 2 ---");
        HashSet<String> listaCores = new HashSet<>();
        listaCores.addAll(List.of("Rosa", "Branco", "Amarelo","Verde"));
        if (listaCores.contains("Verde")) {
            System.out.println("Já possui a cor verde");
        } else {
            System.out.println("Ainda não possui a cor verde");
        }

        System.out.println("--- Exercício 3 ---");
        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.addAll(List.of("Ana", "Bia", "Maria","Bia", "Isabela"));

        HashSet<String> listaNomesHashSet2 = new HashSet<>(listaNomes);
        System.out.println(listaNomes);
        System.out.println(listaNomesHashSet2);

        System.out.println("--- Exercício 4 ---");
        HashSet<String> listaCpf = new HashSet<>();
        listaCpf.addAll(List.of("123456789-10", "012345789-20", "789456123-30"));
        System.out.println(listaCpf);
        System.out.println("Tamanho: " + listaCpf.size());
        listaCpf.remove("012345789-20");
        System.out.println(listaCpf);
        System.out.println("Tamanho: " + listaCpf.size());

        System.out.println("--- Exercício 5 ---");
        HashSet<String> listaFrutas = new HashSet<>();
        listaFrutas.addAll(List.of("Banana", "Morango", "Uva"));
        for (String fruta : listaFrutas) {
            System.out.println(fruta);
        }

        System.out.println("--- Exercício 6 ---");
        HashSet<String> listaNomes2 = new HashSet<>();
        System.out.println(listaNomes2.isEmpty());
        listaNomes2.add("Isabela");
        System.out.println(listaNomes2.isEmpty());
    }
}
