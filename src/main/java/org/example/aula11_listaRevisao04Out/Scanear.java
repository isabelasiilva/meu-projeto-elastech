package org.example.aula11_listaRevisao04Out;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanear {
    static String nome;
    static int idade;
    static int numero1;
    static int numero2;
    static double altura;
    static double peso;
    static String cidade;

    static Scanner sc = new Scanner(System.in);

    public static void perguntarNome(){
        System.out.println("Digite seu nome:");
        Scanear.nome = sc.nextLine();
        mensagemOla(Scanear.nome);
    }

    private static void mensagemOla(String nomePessoa){
        System.out.println("Olá, " + nomePessoa);
    }

    public static void perguntarIdade(){

        boolean entradaValidaIdade = false;
        do {
            System.out.println("Digite sua idade:");
            try {
                Scanear.idade =  sc.nextInt();
                if(Scanear.idade >= 0 && Scanear.idade <= 100){
                    entradaValidaIdade = true;
                    mensagemIdade(Scanear.idade);
                } else {
                    System.out.println("Só são aceitos números de 0 a 100");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Erro: são aceitos somente números de 0 a 100");
                sc.next();
            }
        } while (!entradaValidaIdade);

    }

    private static void mensagemIdade(int idadePessoa){
        System.out.println("Você tem " + idadePessoa + " anos. E vai fazer " + (idadePessoa+1) + " anos no ano que vem.");
    }

    public static void perguntarNumeros(){
        boolean entradaValidaNumero = false;
        do {
            System.out.println("Digite um número:");
            try {
                Scanear.numero1 =  sc.nextInt();
                System.out.println("Digite outro número:");
                Scanear.numero2 =  sc.nextInt();
                soma(Scanear.numero1, Scanear.numero2);
                entradaValidaNumero = true;
            } catch (InputMismatchException ime) {
                System.out.println("Erro: são aceitos somente números inteiros");
                sc.next();
            }
        } while (!entradaValidaNumero);
    }

    private static void soma(int primeiroNumero, int segundoNumero){
        int somaNumeros = primeiroNumero + segundoNumero;
        System.out.println("A soma de " + primeiroNumero + " e " + segundoNumero + " é igual a " + somaNumeros);
    }

    public static void perguntarAlturaPeso(){
        boolean entradaValidaAltura = false;
        boolean entradaValidaPeso = false;

        // Uso do 'do while' com try catch
        do {
            System.out.println("Qual sua altura?");
            try {
                Scanear.altura = sc.nextDouble();
                entradaValidaAltura = true; // Se chegou aqui sem erro, marca como válido para sair do laço
            } catch (InputMismatchException ime) {
                System.out.println("Erro: insira números válidos. Use ',' (vírgula) ao inves de '.' (ponto)");
                sc.next(); // Limpa o valor inválido do buffer do Scanner para não travar o loop
            }
        } while (!entradaValidaAltura);

        do {
            System.out.println("Qual seu peso?");
            try {
                Scanear.peso = sc.nextDouble();
                entradaValidaPeso = true; // Se chegou aqui sem erro, marca como válido para sair do laço
            } catch (InputMismatchException ime) {
                System.out.println("Erro: insira números válidos. Use ',' (vírgula) ao inves de '.' (ponto)");
                sc.next(); // Limpa o valor inválido do buffer do Scanner para não travar o loop
            }
        } while (!entradaValidaPeso);


        System.out.println("Sua altura é " +  Scanear.altura + " e seu peso é " +  Scanear.peso);
    }

    public static void perguntarIdadeNomeCidade(){
        boolean entradaValidaIdade = false;

        // Pergunta Idade
        do {
            System.out.println("Digite sua idade: ");
            try {
                Scanear.idade = sc.nextInt();
                if(Scanear.idade>=0 && Scanear.idade<=100){
                    sc.nextLine(); // Consome o '\n' que ficou pendente no buffer
                    entradaValidaIdade = true; // Se chegou aqui sem erro, marca como válido para sair do laço
                } else {
                    System.out.println("Só são aceitos números de 0 a 100");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Erro: são aceitos somente números de 0 a 100");
                sc.next(); // Limpa o valor inválido do buffer do Scanner para não travar o loop
            }
        } while (!entradaValidaIdade);

        System.out.println("Digite seu nome: ");
        Scanear.nome = sc.nextLine();
        System.out.println("Digite sua cidade: ");
        Scanear.cidade = sc.nextLine();
        saudacao(Scanear.idade,  Scanear.nome, Scanear.cidade);
    }

    private static void saudacao(int idadePessoa, String nomePessoa, String cidadePessoa){
        System.out.println("Seu nome é " + nomePessoa + ", sua idade é " + idadePessoa + " anos. Você mora em " + cidadePessoa);
    }
}
