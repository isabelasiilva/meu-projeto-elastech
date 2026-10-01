package org.example.aula4_29Set;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        System.out.println("Exercício 1");
//        String[] pessoas = new String[5];
//        pessoas[0] = "Rafaela";
//        pessoas[1] = "Marcela";
//        pessoas[2] = "Jorge";
//        pessoas[3] = "Otavio";
//        pessoas[4] = "Rosana";
//
//        System.out.println(pessoas[0]);
//        System.out.println(pessoas[2]);
//        System.out.println(pessoas[4]);
//
//        System.out.println("Exercício 2");
//        int[] notas = {8, 6, 10, 7, 9};
//
//        for (int i = 0; i < notas.length; i++) {
//            System.out.println("Nota "+ (i+1) + " : "+ notas[i]);
//        }
//
//        System.out.println("Exercício 3");
//        int somaDasNotas = 0;
//
//        for (int i = 0; i < notas.length; i++) {
//            somaDasNotas += notas[i];
//        }
//        int mediaDasNotas = somaDasNotas / notas.length;
//        System.out.println("A soma é " + somaDasNotas);
//        System.out.println("A média das notas é " + mediaDasNotas);

        System.out.println("Exercício 4");
        Scanner scanner = new Scanner(System.in);
        int[] respostas = new int[5];

        for (int i = 0; i < respostas.length; i++) {
            System.out.println("Insira um número: ");
            int numero = scanner.nextInt();
            respostas[i] = numero;
        }

        System.out.println("Quantas respostas recebi: " + respostas.length);

        for (int a = respostas.length - 1; a == 0; a--) {
            System.out.println(respostas[a]);
        }

    }
}
