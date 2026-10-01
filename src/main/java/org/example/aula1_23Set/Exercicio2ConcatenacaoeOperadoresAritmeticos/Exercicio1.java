package org.example.aula1_23Set.Exercicio2ConcatenacaoeOperadoresAritmeticos;

public class Exercicio1 {
    public static void main(String[] args) {
        //Concatenação
        // 1- Crie variáveis para um nome, uma cidade e uma idade. Mostre em uma única linha: "Meu nome é Ana, moro em Salvador e tenho 28 anos."
        Pessoa pessoa = new Pessoa("Isabela",27,"Taubaté");
        pessoa.apresentacao();

        // 2 — Crie variáveis para o nome de um produto ("Caneca"), o preço (12.50) e a quantidade (4). Mostre: "Comprei 4 unidades de Caneca por R$ 12.5 cada. Total: R$ 50.0"
        Produto produto = new Produto("Caneca", 12.5, 4);
        produto.mensagemDoProduto();

        //3- Crie duas variáveis com números inteiros. Mostre a soma em uma frase completa, assim: "A soma de 15 e 4 é igual a 19."
        int numeroA = 15;
        int numeroB = 4;
        int somaNumeros = numeroA + numeroB;
        System.out.println("A soma de " + numeroA + " e " + numeroB + " é igual a " + somaNumeros + "\n");
        // -----------
        // Aritméticos
        System.out.println("2 + 2 = " + 2 + 2);

        System.out.println("2 + 2 = " + (2 + 2));
        System.out.println("Os resultados são diferentes porque as operações dentro dos parênteses tem precedência de operação.\n");


        //1- Crie variáveis para dois números inteiros de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.
        int a1 = 10;
        int b1 = 3;
        System.out.println("A soma é " + (a1+b1));
        System.out.println("A subtração é " + (a1-b1));
        System.out.println("A multiplicação é " + (a1*b1));
        System.out.println("O resto é " + (a1%b1) + "\n");

        // 2- Crie variáveis para dois números decimais de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.
        double a2 = 10;
        double b2 = 3;
        System.out.println("A soma é " + (a2+b2));
        System.out.println("A subtração é " + (a2-b2));
        System.out.println("A multiplicação é " + (a2*b2));
        System.out.println("O resto é " + (a2%b2) + "\n");

        //3- Crie variáveis para três notas (8, 6 e 10). Mostre a soma e a média.
        int nota1 = 8;
        int nota2 = 6;
        int nota3 = 10;

        System.out.println("A soma é " + (nota1+nota2+nota3));
        System.out.println("A média é " + ((nota1+nota2+nota3)/3) + "\n");

        //4- Faça a operação a + b * c, sendo a = 3, b = 4 e c = 5.
        int a3 = 3;
        int b3 = 4;
        int c3 = 5;

        System.out.println((a3+b3*c3) + "\n");

        //5- Faça a operação (a + b) * c, sendo a = 3, b = 4 e c = 5.
        int a4 = 3;
        int b4 = 4;
        int c4 = 5;

        System.out.println(((a4+b4)*c4) + "\n");

        // Desafio: Crie uma variável com 3785 segundos. Mostre quantos minutos inteiros isso dá e quantos segundos sobram.
        int numeros = 3785;
        int segundosEmUmMinuto = 60;
        System.out.println("Isso dá " + (numeros/segundosEmUmMinuto) + " minutos e " + (numeros%segundosEmUmMinuto) + " segundos");
    }
}