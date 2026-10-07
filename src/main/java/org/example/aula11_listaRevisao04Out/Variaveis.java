package org.example.aula11_listaRevisao04Out;

import org.w3c.dom.ls.LSOutput;

public class Variaveis {
    static String nome = "Isabela";
    static int idade = 27;
    static double altura = 1.7;
    static boolean jaProgramou = true;

    static String cidade = "Salvador";

    static String primeiroNome = "Isabela";
    static String sobrenome = "Cristina da Silva";

    static double preco = 29.90;

    static boolean temCarteira = true;

    public static void imprimirPessoa(String nomePessoa){
        System.out.println("Nome: " + nome);
    }
    public static void imprimirPessoa(int idadePessoa){
        System.out.println("Idade: " + idade);
    }

    public static void imprimirPessoa(double alturaPessoa){
        System.out.println("Altura: " + altura);
    }

    public static void imprimirPessoa(boolean programouPessoa){
        System.out.print("Já programou? ");
        System.out.println(jaProgramou ? "Sim" : "Não");
    }

    public static void imprimirCidade(String cidadePessoa){
        System.out.println("Eu moro em " + cidade);
    }

    public static void imprimirNomeCompleto(String nome,  String sobrenomee){
        System.out.println("Nome completo: " + primeiroNome + " " + sobrenome);
    }

    public static void imprimirPreco(double valor){
        System.out.println("O valor do boné é R$" + preco);
    }

    public static void imprimirTemHabilitacao(boolean habilitacao){
        System.out.print("Tem habilitação para dirigir? ");
        System.out.println(temCarteira ? "Sim" : "Não");
    }

    static int a = 10;
    static int b = 20;
    static int c;
    public static void trocarValorDeB(){
        System.out.println("a = " + Variaveis.a + ", b = " + Variaveis.b);
        Variaveis.c = Variaveis.b;
        trocarValorDeA();
    }

    private static void trocarValorDeA(){
        Variaveis.b = Variaveis.a;
        Variaveis.a = c;
        System.out.println("a = " + Variaveis.a + ", b = " + Variaveis.b);
    }
}
