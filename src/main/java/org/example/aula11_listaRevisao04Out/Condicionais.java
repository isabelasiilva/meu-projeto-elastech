package org.example.aula11_listaRevisao04Out;

import java.util.Scanner;

public class Condicionais {
    static int idade;
    static int numero;
    static int numero2;
    static int nota;
    static int ladoTriangulo1;
    static int ladoTriangulo2;
    static int ladoTriangulo3;

    static Scanner sc = new Scanner(System.in);

    public static void perguntarIdade(){
        System.out.println("Digite sua idade: ");
        Condicionais.idade = sc.nextInt();
        Condicionais.verificaIdade(Condicionais.idade);
    }

    public static void verificaIdade(int idadePessoa){
        if (idadePessoa < 18){
            System.out.println("Você tem " +  idadePessoa + " anos. Você é menor de idade!");
        } else {
            System.out.println("Você tem " +  idadePessoa + " anos. Você é maior de idade!");
        }
    }

    public static void perguntarNumero(){
        System.out.println("Digite um número: ");
        Condicionais.numero = sc.nextInt();
        Condicionais.verificaNumero(Condicionais.numero);
    }

    public static void verificaNumero(int numero){
        if (numero % 2 == 0){
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("O número " + numero + " é impar");
        }
    }

    public static void perguntarNumeros(){
        System.out.println("Digite um número: ");
        Condicionais.numero = sc.nextInt();
        System.out.println("Digite outro número: ");
        Condicionais.numero2 = sc.nextInt();
        Condicionais.verificaNumeros(Condicionais.numero, Condicionais.numero2);
    }
    public static void verificaNumeros(int numero1, int numero2){
        if (numero1 > numero2){
            System.out.println("O número " + numero1 + " é maior que " + numero2);
        } else if (numero2 > numero1){
            System.out.println("O número " + numero2 + " é maior que " + numero1);
        } else {
            System.out.println("Os números são iguais!");
        }
    }

    public static void perguntarNota(){
        System.out.println("Digite uma nota de 0 a 10");
        Condicionais.nota = sc.nextInt();
        if  (Condicionais.nota > 10 || Condicionais.nota < 0){
            System.out.println("A nota deve ser entre 0 e 10!");
        } else {
            Condicionais.verificaNota(Condicionais.nota);
        }
    }
    public static void verificaNota(int notaPessoa){
        if (notaPessoa <= 10 && notaPessoa >= 7){
            System.out.println("Sua nota foi " +  notaPessoa + ". Você está aprovado!");
        } else if (notaPessoa >= 5 && notaPessoa < 7 ){
            System.out.println("Sua nota foi " +  notaPessoa + ". Você está de recuperação!");
        } else{
            System.out.println("Você está reprovado!");
        }
    }

    public static void mostrarMenuSorveteria(){
        System.out.println("Escolha um número de 1 a 3, ou 4 para sair:");
        System.out.println("1 - sorvete de chocolate");
        System.out.println("2 - sorvete de baunilha");
        System.out.println("3 - sorvete de napolitano");
        System.out.println("4 - sair");
        int opcao = sc.nextInt();
        saborSorvete(opcao);
    }

    public static void saborSorvete(int opcao){
        switch (opcao){
            case 1:
                System.out.println("Sorvete de chocolate");
                break;
            case 2:
                System.out.println("Sorvete de baunilha");
                break;
            case 3:
                System.out.println("Sorvete napolitado");
                break;
            case 4:
                System.out.println("Até logo!");
                break;
            default:
                mostrarMenuSorveteria();
        }
    }

    public static void perguntarIdade2(){
        System.out.println("Digite sua idade: ");
        Condicionais.idade = sc.nextInt();
        Condicionais.verificaValorIngresso(Condicionais.idade);
    }

    public static void verificaValorIngresso(int idadePessoa){
        if (idadePessoa <= 12 || idadePessoa >= 60) {
            System.out.println("O valor do ingresso é R$10");
        }  else {
            System.out.println("O valor do ingresso é R$25");
        }
    }

    public static void perguntarLadosTriangulo(){
        System.out.println("Digite um lado do triangulo: ");
        ladoTriangulo1 = sc.nextInt();
        System.out.println("Digite o segundo lado do triangulo: ");
        ladoTriangulo2 = sc.nextInt();
        System.out.println("Digite o ultimo lado do triangulo: ");
        ladoTriangulo3 = sc.nextInt();
        verificarTipoDeTriangulo(ladoTriangulo1, ladoTriangulo2, ladoTriangulo3);
    }

    public static void verificarTipoDeTriangulo(int lado1, int lado2, int lado3){
        if (lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado1 != lado2 || lado2 == lado3 && lado1 != lado3){
            System.out.println("É um triângulo isósceles! Tem 2 lados iguais");
        } else if (lado1 == lado2 && lado1 == lado3){
            System.out.println("É um triângulo equilátero! Os 3 lados são iguais");
        }
        else {
            System.out.println("É um triângulo escaleno! Os 3 lados são diferentes");
        }
    }
}
