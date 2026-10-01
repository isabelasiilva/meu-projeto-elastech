package org.example.aula2_25Set;

import java.util.Scanner;

public class Scanear {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.print("Qual seu nome? ");
    String nome = scanner.nextLine();
        System.out.println("Olá " + nome + "!");
    }
}
