package org.example.aula13_06Out;

import java.util.ArrayDeque;
import java.util.List;

public class AulaQueue {
    public static void main(String[] args) {
        /*
        .add("Ana");
        .peek();    mostra a primeira posição
        .poll();    remove a primeira posição
        .isEmpty();     é sempre bom testar antes de fazer qualquer coisa se a lista ja esta vazia
        .size();
        .contains("Bia");
        .addAll(List.of("Ana", "Bia"));
         */

        ArrayDeque<String> lista = new ArrayDeque<>();
        lista.add("Ana");
        lista.add("Maria");
        System.out.println(lista);
        lista.addAll(List.of("Marcelo", "Yasmin", "Nathalia"));
        System.out.println(lista);
        System.out.println(lista.peek()); // mostra a primeira posição
        lista.poll(); // removeu a primeira posição
        System.out.println(lista);

        if(!lista.isEmpty()) {
            System.out.println("Lista preenchida");
        } else {
            lista.add("Marcos");
            lista.add("Karla");
            lista.addAll(List.of("Vanessa", "Cristina", "Marcia"));
            System.out.println(lista);
        }
    }
}
