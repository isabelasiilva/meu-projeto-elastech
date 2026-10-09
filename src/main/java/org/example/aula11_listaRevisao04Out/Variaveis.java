package org.example.aula11_listaRevisao04Out;

public class Variaveis {
    public static void imprimirPessoa(String nomePessoa){
        System.out.println("Nome: " + nomePessoa);
    }
    public static void imprimirPessoa(int idadePessoa){
        System.out.println("Idade: " + idadePessoa);
    }

    public static void imprimirPessoa(double alturaPessoa){
        System.out.println("Altura: " + alturaPessoa);
    }

    public static void imprimirPessoa(boolean programouPessoa){
        System.out.print("Já programou? ");
        System.out.println(programouPessoa ? "Sim" : "Não");
    }

    public static void imprimirCidade(String cidadePessoa){
        System.out.println("Eu moro em " + cidadePessoa);
    }

    public static void imprimirNomeCompleto(String nome,  String sobrenomee){
        System.out.println("Nome completo: " + nome + " " + sobrenomee);
    }

    public static void imprimirPreco(double valor){
        System.out.println("O valor do boné é R$" + valor);
    }

    public static void imprimirTemHabilitacao(boolean habilitacao){
        System.out.print("Tem habilitação para dirigir? ");
        System.out.println(habilitacao ? "Sim" : "Não");
    }

    public static void trocarValorDeB(){
        int a = 10;
        int b = 20;
        int temporario = b;

        System.out.println("a = " + a + ", b = " + b);
        b = a;
        a = temporario;
        System.out.println("a = " + a + ", b = " + b);
    }
}
