package org.example.aula11_listaRevisao04Out;

import java.util.Scanner;

public class Strings {
    static Scanner sc = new Scanner(System.in);

    public static void perguntarNomeCompleto(){
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = sc.nextLine();

        System.out.println("O nome " + nomeCompleto + " tem " + nomeCompleto.replace(" ", "").length() + " letras");
    }

    public static void perguntarNome(){
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("O nome em maiúsculo: " + nome.toUpperCase());
        System.out.println("O nome em minúsculo: " + nome.toLowerCase());
    }

    public static void perguntarNome2(){
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("A primeira letra do nome é: " + nome.charAt(0));
    }
    public static void perguntarFrasePalavra(){
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        if (frase.contains(palavra)) {
            System.out.println("A sua palavra está contida na frase");
        } else {
            System.out.println("A sua palavra não está contida na frase");
        }
    }

    public static void perguntarNome3(){
        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o mesmo nome de novo: ");
        String nome2 = sc.nextLine();
        if (nome.equalsIgnoreCase(nome2)) {
            System.out.println("O nome " + nome + " é igual a " + nome2 + "ignorando maiúsculas e minúsculas");
        } else {
            System.out.println("O nome " + nome + " não é igual a " + nome2 + "ignorando maiúsculas e minúsculas");
        }
    }

    public static void perguntarNome4(){
        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();

        System.out.println("O nome em maiúsculo e sem espaços é: " + nome.toUpperCase().trim());
    }

    public static void perguntarPalavra(){
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        int ultimaPosicao = palavra.length();
        int ultimaLetra = ultimaPosicao - 1;

        if (palavra.toLowerCase().charAt(0) == palavra.toLowerCase().charAt(ultimaLetra)) {
            System.out.println("A primeira letra e a ultima letra da palavra são iguais ignorando o case sensitive! " + palavra.toLowerCase().charAt(0) + " = " + palavra.toLowerCase().charAt(ultimaLetra));
        }else {
            System.out.println("A primeira letra e a ultima letra da palavra NÃO são iguais! " + palavra.toLowerCase().charAt(0) + " != " + palavra.toLowerCase().charAt(ultimaLetra));
        }
    }
}
