package org.example.aula11_listaRevisao04Out;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecoes {
    static Scanner sc = new Scanner(System.in);
    static int[] listaNotas = {5, 7, 4, 9, 6};
    static String[] listaNomes = {"Marina", "José", "Mário"};

    public static void doisNumeros() {
        int n1 = 0;
        int n2 = 0;
        int divisao = 0;
        boolean controlador1 = false;
        boolean controlador2 = false;

        // Leitura do primeiro número
        do {
            System.out.println("Digite o primeiro número:");
            try {
                n1 = sc.nextInt();
                controlador1 = true;
            } catch (InputMismatchException ime) {
                System.out.println("Erro: digite um número inteiro válido!\n");
                sc.next(); // Limpa o buffer do Scanner
            }
        } while (!controlador1);

        // Leitura do segundo número
        do {
            System.out.println("Digite o segundo número:");
            try {
                n2 = sc.nextInt();
                controlador2 = true;
            } catch (InputMismatchException ime) {
                System.out.println("Erro: digite um número inteiro válido!\n");
                sc.next(); // Limpa o buffer do Scanner
            }
        } while (!controlador2);

        try {
            divisao = n1 / n2;
            System.out.println("\nOs números digitados foram: " + n1 + " e " + n2 + " a média é " + divisao);
        } catch (ArithmeticException ae) {
            System.out.println("Não pode dividir por zero!");
        }

    }

    public static void mostrarPosicaoArray(){
        try {
            System.out.println("Digite uma posição de array para ser verificada:");
            int posicao = sc.nextInt();
            System.out.println("O número nessa posição é " + listaNotas[posicao]);
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("O array não tem essa posição!");
        }
    }

    public static void pedirIdade(){
        try {
            System.out.println("Digite uma idade entre 0 e 100:");
            int idade = sc.nextInt();
            if (idade < 0 || idade > 100) {
                System.out.println("Só são aceitos números entre 0 e 100!");
            } else {
                System.out.println("Sua idade é " + idade);
            }
        }catch (InputMismatchException ime) {
            System.out.println("Digite apenas números inteiros!");
        }
    }

    public static void imprimeNome(){
        try {
            String nome = null;
            System.out.println(nome.length());
        } catch (NullPointerException npe){
            System.out.println("O nome está com valor = null !");
        }
    }

    public static void imprimeListaNomes(){
        try {
            System.out.println(listaNomes[5]);
        }catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Não tem essa posição na lista de nomes!");
        } finally {
            System.out.println("Programa funcionando!");
        }
    }

    public static void imprimeDesafioDivisao() {
        try{
            System.out.println("Digite um número:");
            int numero = sc.nextInt();
            System.out.println(100/numero);
            System.out.println("Digite uma posição do array para verificar:");
            int posicao = sc.nextInt();
            System.out.println(listaNotas[posicao]);
        } catch(ArithmeticException ae){
            System.out.println("Não é possível dividir por zero!");
        } catch(ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("O array não tem essa posição!");
        } catch(Exception e){
            System.out.println("Erro no programa!");
        }
    }
}
