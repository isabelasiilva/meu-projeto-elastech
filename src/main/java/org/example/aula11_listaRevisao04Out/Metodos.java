package org.example.aula11_listaRevisao04Out;

public class Metodos {
    public static void mostrarBoasVindas(){
        System.out.println("Seja bem vindo ao programa!");
    }
    public static void saudacao(String nome){
        System.out.println("Bem vindo ao programa, " + nome + "!");
    }
    public static void dobroNumero(int numero){
        System.out.println(numero + "x2 = " + (numero * 2));
    }
    public static void calcularMedia(double n1, double n2){
        double media = (n1 + n2) / 2;
        System.out.printf("A média de %.1f e %.1f é %.2f%n",n1, n2, media);
    }

    public static void ehPar(int numero){
        if (numero % 2 == 0){
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("O número " + numero + " é ímpar");
        }
    }

    public static void somar(int n1, int n2){
        int soma = n1 + n2;
        System.out.println("A soma dos números é " + soma);
    }
    public static void somar(int n1, int n2, int n3){
        int soma = n1 + n2 + n3;
        System.out.println("A soma dos números é " + soma);
    }

    private static boolean ehMaiorDeIdade(int idade){
        boolean condicionalIdade;

        if (idade >= 18){
            condicionalIdade = true;
        }else {
            condicionalIdade = false;
        }

        return condicionalIdade;
    }

    public static void liberarEntrada(int idade){
        if (ehMaiorDeIdade(idade)){
            System.out.println("A pessoa tem " + idade + " anos. Ela é maior de idade e pode entrar!");
        } else {
            System.out.println("A pessoa tem " + idade + " anos. Ela é menor de idade e não pode entrar!");
        }
    }
}
