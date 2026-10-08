package org.example.aula11_listaRevisao04Out;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercícios variáveis
        System.out.println("----------- 1- Exercícios variáveis -----------");
        Variaveis.imprimirPessoa(Variaveis.nome);
        Variaveis.imprimirPessoa(Variaveis.idade);
        Variaveis.imprimirPessoa(Variaveis.altura);
        Variaveis.imprimirPessoa(Variaveis.jaProgramou);
        Variaveis.imprimirCidade(Variaveis.cidade);
        Variaveis.imprimirNomeCompleto(Variaveis.nome, Variaveis.sobrenome);
        Variaveis.imprimirPreco(Variaveis.preco);
        Variaveis.imprimirTemHabilitacao(Variaveis.temCarteira);

        System.out.println("Desafio variáveis");
        Variaveis.trocarValorDeB();


        // Exercícios operadores
        System.out.println("----------- 2- Exercícios operadores -----------");
        System.out.println(Operadores.soma(Operadores.a,Operadores.b));
        System.out.println(Operadores.subtracao(Operadores.a,Operadores.b));
        System.out.println(Operadores.multiplicacao(Operadores.a,Operadores.b));
        System.out.println(Operadores.divisao(Operadores.a,Operadores.b));
        System.out.println(Operadores.resto(Operadores.a,Operadores.b));

        Operadores.saldo +=250;
        System.out.println("Saldo + 250 = " + Operadores.saldo);
        Operadores.saldo -=380;
        System.out.println("Saldo - 380 = " + Operadores.saldo);

        Operadores.a = 10;
        Operadores.b = 10;
        System.out.println("a==b = " + (Operadores.a==Operadores.b));
        System.out.println("a!=b = " + (Operadores.a!=Operadores.b));
        System.out.println("a>b = " + (Operadores.a>Operadores.b));
        System.out.println("a>=b = " + (Operadores.a>=Operadores.b));

        Operadores.verificadorHabilitacao(Operadores.idade, Operadores.temCarteira);

        Operadores.verificaDivisaoPor2(Operadores.numero);
        Operadores.totalCompraArroz(Operadores.arroz);
        Operadores.verificaDivisaoPor3e5(Operadores.numero1);


        // Exercícios concatenação
        System.out.println("----------- 3- Exercícios concatenação -----------");
        Concatenacao.apresentarPessoa(Concatenacao.nome, Concatenacao.idade);
        Concatenacao.calcularMediaNotas(Concatenacao.nota1, Concatenacao.nota2);
        Concatenacao.apresentarProduto(Concatenacao.preco);
        Concatenacao.apresentarPessoa2(Concatenacao.nome, Concatenacao.idade, Concatenacao.altura);
        Concatenacao.imprimirRecibo(Concatenacao.produto1, Concatenacao.produto2, Concatenacao.produto3, Concatenacao.preco1, Concatenacao.preco2, Concatenacao.preco3);

        System.out.println(Concatenacao.total2);
        Concatenacao.total2 += Concatenacao.preco1;
        System.out.println(Concatenacao.total2);

        Concatenacao.total2 += Concatenacao.preco2;
        System.out.println(Concatenacao.total2);

        Concatenacao.total2 += Concatenacao.preco3;
        System.out.println(Concatenacao.total2);


        // Exercícios Scanner
        System.out.println("----------- 4- Exercícios Scanner -----------");
//        Scanear.perguntarNome();
//        Scanear.perguntarIdade();
//        Scanear.perguntarNumeros();
//        Scanear.perguntarAlturaPeso();
//        Scanear.perguntarIdadeNomeCidade();


        // Exercícios Condicionais
        System.out.println("----------- 5- Exercícios Condicionais -----------");
//        Condicionais.perguntarIdade();
//        Condicionais.perguntarNumero();
//        Condicionais.perguntarNumeros();
//        Condicionais.perguntarNota();
//        Condicionais.mostrarMenuSorveteria();
//        Condicionais.perguntarIdade2();
//        Condicionais.perguntarLadosTriangulo();

        // Exercícios Loops
        System.out.println("----------- 6- Exercícios Loops -----------");
        Loops.imprimirNumeros();
        Loops.imprimirNumerosRegressivos();
//        Loops.pedirNumeroTabuada();
        Loops.imprimirNumerosPares();
        Loops.somaNumerosAte100();
        Loops.somaNumerosAte100While();
        Loops.iniciarJogo();
//        Loops.perguntaAsteriscos();

        // Exercícios Arrays
        System.out.println("----------- 7- Exercícios Arrays -----------");
        Arrays.imprimirArrayNomes(0);
        Arrays.imprimirArrayNomes(2);
        Arrays.imprimirArrayNomes(4);
        Arrays.imprimirArrayNotas();
        Arrays.calcularArrayNotas();
        Arrays.verificarNumeros();
//        Arrays.perguntarNomesDesafio();

        // Exercícios Strings
        System.out.println("----------- 8- Exercícios Strings -----------");
//        Strings.perguntarNomeCompleto();
//        Strings.perguntarNome();
//        Strings.perguntarNome2();
//        Strings.perguntarFrasePalavra();
//        Strings.perguntarNome3();
//        Strings.perguntarNome4();
//        Strings.perguntarPalavra();


        // Exercícios Classes e Objetos
        System.out.println("----------- 9- Exercícios Classes e Objetos -----------");
        Pet cachorro = new Pet("Lola", "caramelo", 4.3);
        cachorro.apresentarPet();

        Pet gato = new Pet("Haru", "persa", 3.1);
        gato.apresentarPet();
        Pet passarinho = new Pet("Cristal", "calopsita", 0.8);
        passarinho.apresentarPet();

        Produto produto1 = new Produto("Camiseta", 78.9, 431);
        produto1.relatorioProduto();
        Aluna aluna1 = new Aluna("Rafaela", 7.8, 9.2);
        aluna1.relatorioAluna();
        Jogadora jogadora1 = new Jogadora("Isabela", 8);
        Jogadora jogadora2 = new Jogadora("Micaela", 7);
        Jogadora jogadora3 = new Jogadora("Fernanda", 9);

        Jogadora.comparar3Jogadoras(jogadora1, jogadora2, jogadora3);


        // Exercícios Métodos
        System.out.println("----------- 10- Exercícios Métodos -----------");
        Metodos.mostrarBoasVindas();
        Metodos.saudacao("Marcela");
        Metodos.saudacao("João");
        Metodos.saudacao("Rafael");
        Metodos.dobroNumero(3);
        Metodos.calcularMedia(3, 5);
        Metodos.ehPar(3);
        Metodos.somar(50,4);
        Metodos.somar(35,7,8);
        Metodos.liberarEntrada(20);


        // Exercícios Tratamento de exceções
        System.out.println("----------- 11- Exercícios Tratamento de exceções -----------");
//        TratamentoExcecoes.doisNumeros();
//        TratamentoExcecoes.mostrarPosicaoArray();
//        TratamentoExcecoes.pedirIdade();
        TratamentoExcecoes.imprimeNome();
        TratamentoExcecoes.imprimeListaNomes();
//        TratamentoExcecoes.imprimeDesafioDivisao();
    }
}
