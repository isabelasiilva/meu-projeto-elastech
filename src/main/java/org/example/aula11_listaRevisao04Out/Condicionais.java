package org.example.aula11_listaRevisao04Out;

public class Condicionais {
    public static void perguntarIdade(LeitorEntrada entrada){
        verificaIdade(entrada.lerInteiro("Digite sua idade:", 0, 100));
    }

    private static void verificaIdade(int idadePessoa){
        if (idadePessoa < 18){
            System.out.println("Você tem " +  idadePessoa + " anos. Você é menor de idade!");
        } else {
            System.out.println("Você tem " +  idadePessoa + " anos. Você é maior de idade!");
        }
    }

    public static void perguntarNumero(LeitorEntrada entrada){
        verificaNumero(entrada.lerInteiro("Digite um número:"));
    }

    private static void verificaNumero(int numero){
        if (numero % 2 == 0){
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("O número " + numero + " é ímpar");
        }
    }

    public static void perguntarNumeros(LeitorEntrada entrada){
        int numero = entrada.lerInteiro("Digite um número:");
        perguntaOutroNumero(numero, entrada);
    }

    private static void perguntaOutroNumero(int numero, LeitorEntrada entrada){
        int numero2 = entrada.lerInteiro("Digite outro número: ");
        verificaNumeros(numero, numero2);
    }

    private static void verificaNumeros(int numero1, int numero2){
        if (numero1 > numero2){
            System.out.println("O número " + numero1 + " é maior que " + numero2);
        } else if (numero2 > numero1){
            System.out.println("O número " + numero2 + " é maior que " + numero1);
        } else {
            System.out.println("Os números são iguais!");
        }
    }

    public static void perguntarNota(LeitorEntrada entrada) {
        verificaNota(entrada.lerInteiro("Digite uma nota de 0 a 10:", 0, 10));
    }

    private static void verificaNota(int notaPessoa) {
        if (notaPessoa >= 7) {
            System.out.println("Sua nota foi " + notaPessoa + ". Você está aprovado!");
        } else if (notaPessoa >= 5) {
            System.out.println("Sua nota foi " + notaPessoa + ". Você está de recuperação!");
        } else {
            System.out.println("Sua nota foi " + notaPessoa + ". Você está reprovado!");
        }
    }

    public static void mostrarMenuSorveteria(LeitorEntrada entrada) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha um número de 1 a 3, ou 4 para sair:");
            System.out.println("1 - sorvete de chocolate");
            System.out.println("2 - sorvete de baunilha");
            System.out.println("3 - sorvete napolitano");
            System.out.println("4 - sair");

            int opcao = entrada.lerInteiro("Escolha uma opção:");
            continuar = saborSorvete(opcao);
        }
    }

    private static boolean saborSorvete(int opcao) {
        switch (opcao) {
            case 1:
                System.out.println("Você escolheu: Sorvete de chocolate!");
                return true;
            case 2:
                System.out.println("Você escolheu: Sorvete de baunilha!");
                return true;
            case 3:
                System.out.println("Você escolheu: Sorvete napolitano!");
                return true;
            case 4:
                System.out.println("Até logo!");
                return false; // Retorna false para encerrar o loop no menu
            default:
                System.out.println("Opção inválida! Digite um número de 1 a 4.");
                return true;
        }
    }

    public static void perguntarIdade2(LeitorEntrada entrada){
        int idade = entrada.lerInteiro("Digite sua idade:", 0, 100);
        verificaIdade(idade);
        verificaValorIngresso(idade);
    }

    private static void verificaValorIngresso(int idadePessoa){
        if (idadePessoa <= 12 || idadePessoa >= 60) {
            System.out.println("O valor do ingresso é R$10");
        }  else {
            System.out.println("O valor do ingresso é R$25");
        }
    }

    public static void perguntarLadosTriangulo(LeitorEntrada entrada){
        int ladoTriangulo1 = entrada.lerInteiro("Digite um lado do triangulo: ");
        int ladoTriangulo2 = entrada.lerInteiro("Digite o segundo lado do triangulo: ");
        int ladoTriangulo3 = entrada.lerInteiro("Digite o ultimo lado do triangulo: ");
        verificarTipoDeTriangulo(ladoTriangulo1, ladoTriangulo2, ladoTriangulo3);
    }

    private static void verificarTipoDeTriangulo(int lado1, int lado2, int lado3){
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
