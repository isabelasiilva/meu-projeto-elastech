package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // como ter um input do usuario
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        System.out.println(idade);

        String nome = sc.nextLine();
    }
}
