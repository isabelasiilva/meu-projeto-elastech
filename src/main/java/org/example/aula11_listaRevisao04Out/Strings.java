package org.example.aula11_listaRevisao04Out;

public class Strings {
    public static void perguntarNomeCompleto(LeitorEntrada entrada){
        String nomeCompleto = entrada.lerTextoNaoVazio("Digite seu nome completo: ");

        System.out.println("O nome " + nomeCompleto + " tem " + nomeCompleto.replace(" ", "").length() + " letras");
    }

    public static void perguntarNome(LeitorEntrada entrada){
        String nome = entrada.lerTextoNaoVazio("Digite seu nome: ");

        System.out.println("O nome em maiúsculo: " + nome.toUpperCase());
        System.out.println("O nome em minúsculo: " + nome.toLowerCase());
    }

    public static void perguntarNome2(LeitorEntrada entrada){
        String nome = entrada.lerTextoNaoVazio("Digite seu nome: ");

        System.out.println("A primeira letra do nome é: " + nome.charAt(0));
    }
    public static void perguntarFrasePalavra(LeitorEntrada entrada){
        String frase = entrada.lerTexto("Digite uma frase: ");

        String palavra = entrada.lerTextoNaoVazio("Digite uma palavra: ");
        if (frase.contains(palavra)) {
            System.out.println("A sua palavra está contida na frase");
        } else {
            System.out.println("A sua palavra não está contida na frase");
        }
    }

    public static void perguntarNome3(LeitorEntrada entrada){
        String nome = entrada.lerTextoNaoVazio("Digite um nome: ");

        String nome2 = entrada.lerTextoNaoVazio("Digite o mesmo nome de novo: ");
        if (nome.equalsIgnoreCase(nome2)) {
            System.out.println("O nome " + nome + " é igual a " + nome2 + "ignorando maiúsculas e minúsculas");
        } else {
            System.out.println("O nome " + nome + " não é igual a " + nome2 + "ignorando maiúsculas e minúsculas");
        }
    }

    public static void perguntarNome4(LeitorEntrada entrada){
        String nome = entrada.lerTextoNaoVazio("Digite um nome: ");

        System.out.println("O nome em maiúsculo e sem espaços é: " + nome.toUpperCase().trim());
    }

    public static void perguntarPalavra(LeitorEntrada entrada){
        String palavra = entrada.lerTextoNaoVazio("Digite uma palavra: ");

        int ultimaPosicao = palavra.length();
        int ultimaLetra = ultimaPosicao - 1;

        if (palavra.toLowerCase().charAt(0) == palavra.toLowerCase().charAt(ultimaLetra)) {
            System.out.println("A primeira letra e a ultima letra da palavra são iguais ignorando o case sensitive! " + palavra.toLowerCase().charAt(0) + " = " + palavra.toLowerCase().charAt(ultimaLetra));
        }else {
            System.out.println("A primeira letra e a ultima letra da palavra NÃO são iguais! " + palavra.toLowerCase().charAt(0) + " != " + palavra.toLowerCase().charAt(ultimaLetra));
        }
    }
}
