package org.example.aula11_listaRevisao04Out;

import java.util.Scanner;

public class Scanear {
    static String nome;
    static int idade;
    static int numero1;
    static int numero2;
    static double altura;
    static double peso;
    static String cidade;

    public static void mensagemOla(String nomePessoa){
        System.out.println("Olá, " + nomePessoa);
    }

    public static void mensagemIdade(int idadePessoa){
        System.out.println("Você tem " + idadePessoa + " anos. E vai fazer " + (idadePessoa+1) + " anos no ano que vem.");
    }

    public static void soma(int primeiroNumero, int segundoNumero){
        int somaNumeros = primeiroNumero + segundoNumero;
        System.out.println("A soma de " + primeiroNumero + " e " + segundoNumero + " é igual a " + somaNumeros);
    }

    public static void saudacao(int idadePessoa, String nomePessoa, String cidadePessoa){
        System.out.println("Seu nome é " + nomePessoa + ", sua idade é " + idadePessoa + " anos. Você mora em " + cidadePessoa);
    }
}
