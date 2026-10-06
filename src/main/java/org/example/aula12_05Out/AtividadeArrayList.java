package org.example.aula12_05Out;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtividadeArrayList {

    public static void main(String[] args) {
        System.out.println("Exercício 1");
        ArrayList<String> listaNomes = new ArrayList<>();

        listaNomes.add("Isabela");
        listaNomes.add("Giovanna");
        listaNomes.add("Marcela");

        System.out.println(listaNomes);


        System.out.println("\nExercício 2");
        ArrayList<String> listaFrutas = new ArrayList<>(List.of("Maçã", "Banana", "Morango", "Mamão"));
        System.out.println(listaFrutas.get(0));
        System.out.println(listaFrutas.get(3));
        //ou
        System.out.println(listaFrutas.get(listaFrutas.size() - 1));
        System.out.println("O tamanho é: " + listaFrutas.size());


        System.out.println("\nExercício 3");
        ArrayList<String> listaNomes2 = new ArrayList<>();
        listaNomes2.add("Beatriz");
        listaNomes2.add("Juliana");
        listaNomes2.add("Flora");
        listaNomes2.add("Ana Luiza");

        System.out.println(listaNomes2);
        listaNomes2.set(2, "João");
        System.out.println(listaNomes2);

        System.out.println("\nExercício 4");
        ArrayList<String> listaCidades = new ArrayList<>();
        listaCidades.add("Taubaté");
        listaCidades.add("São Paulo");
        listaCidades.add("Tremembé");
        listaCidades.add("Pindamonhangaba");

        System.out.println(listaCidades);
        listaCidades.remove(1);
        System.out.println(listaCidades);

        System.out.println("\nExercício 5");
        ArrayList<String> listaNomes3 = new ArrayList<>();
        listaNomes3.add("Marcela");
        listaNomes3.add("Ana Luiza");
        listaNomes3.add("Juliana");
        listaNomes3.add("Priscila");
        listaNomes3.add("Jaqueline");
        listaNomes3.add("Amanda");

        for(int i = 0; i < listaNomes3.size(); i++){
            System.out.println(i + ": " + listaNomes3.get(i));
        }

        System.out.println("\nExercício 6");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaNomes4 = new ArrayList<>();
        listaNomes4.add("Maria");
        listaNomes4.add("Pâmela");
        listaNomes4.add("Elaine");
        listaNomes4.add("Carol");
        listaNomes4.add("Jéssica");

        System.out.println("Digite um nome");
        String novoNome = sc.next();

        if (listaNomes4.contains(novoNome)){
            System.out.println("O nome " + novoNome +  " está na lista");
        } else {
            System.out.println("O nome " + novoNome +  " não está na lista");
        }
    }
}
