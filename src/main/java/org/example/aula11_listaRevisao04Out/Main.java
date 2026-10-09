package org.example.aula11_listaRevisao04Out;

import org.example.aula11_listaRevisao04Out.classesEObjetos.Aluna;
import org.example.aula11_listaRevisao04Out.classesEObjetos.Jogadora;
import org.example.aula11_listaRevisao04Out.classesEObjetos.Pet;
import org.example.aula11_listaRevisao04Out.classesEObjetos.Produto;

public class Main {
    public static void main(String[] args) {
        // Exercícios variáveis
        System.out.println("----------- 1- Exercícios variáveis -----------");
        Variaveis.imprimirPessoa("Isabela");
        Variaveis.imprimirPessoa(27);
        Variaveis.imprimirPessoa(1.7);
        Variaveis.imprimirPessoa(true);
        Variaveis.imprimirCidade("Salvador");
        Variaveis.imprimirNomeCompleto("Isabela", "Cristina da Silva");
        Variaveis.imprimirPreco(29.90);
        Variaveis.imprimirTemHabilitacao(true);

        System.out.println("Desafio variáveis");
        Variaveis.trocarValorDeB();


        // Exercícios operadores
        System.out.println("----------- 2- Exercícios operadores -----------");
        int a = 15;
        int b = 4;
        System.out.println(Operadores.soma(a, b));
        System.out.println(Operadores.subtracao(a, b));
        System.out.println(Operadores.multiplicacao(a, b));
        System.out.println(Operadores.divisao(a, b));
        System.out.println(Operadores.resto(a, b));

        int saldo = 1000;
        saldo += 250;
        System.out.println("Saldo + 250 = " + saldo);
        saldo -= 380;
        System.out.println("Saldo - 380 = " + saldo);

        a = 10;
        b = 10;
        System.out.println("a==b = " + (a == b));
        System.out.println("a!=b = " + (a != b));
        System.out.println("a>b = " + (a > b));
        System.out.println("a>=b = " + (a >= b));

        Operadores.verificadorHabilitacao(20, true);

        Operadores.verificaDivisaoPor2(30);
        Operadores.totalCompraArroz(5.50);
        Operadores.verificaDivisaoPor3e5(12);


        // Exercícios concatenação
        System.out.println("----------- 3- Exercícios concatenação -----------");
        Concatenacao.apresentarPessoa("Isabela", 27);
        Concatenacao.calcularMediaNotas(8.0, 7.0);
        Concatenacao.apresentarProduto(50);
        Concatenacao.apresentarPessoa2("Isabela", 27, 175.5);
        Concatenacao.imprimirRecibo("Camiseta", "Bermuda", "Vestido", 50, 37.25, 21.49);

        double total = 0;
        System.out.println(total);
        total += 50;
        System.out.println(total);
        total += 37.25;
        System.out.println(total);
        total += 21.49;
        System.out.println(total);


        // Exercícios Scanner
        System.out.println("----------- 4- Exercícios Scanner -----------");
        LeitorEntrada entrada = new LeitorEntrada();
//        entrada.perguntarNome();
//        entrada.perguntarIdade();
//        entrada.perguntarNumeros();
//        entrada.perguntarAlturaPeso();
//        entrada.perguntarIdadeNomeCidade();


        // Exercícios Condicionais
        System.out.println("----------- 5- Exercícios Condicionais -----------");
//        Condicionais.perguntarIdade(entrada);
//        Condicionais.perguntarNumero(entrada);
//        Condicionais.perguntarNumeros(entrada);
//        Condicionais.perguntarNota(entrada);
//        Condicionais.mostrarMenuSorveteria(entrada);
//        Condicionais.perguntarIdade2(entrada);
//        Condicionais.perguntarLadosTriangulo(entrada);

        // Exercícios Loops
        System.out.println("----------- 6- Exercícios Loops -----------");
        Loops.imprimirNumeros();
        Loops.imprimirNumerosRegressivos();
//        Loops.pedirNumeroTabuada(entrada);
        Loops.imprimirNumerosPares();
        Loops.somaNumerosAte100();
        Loops.somaNumerosAte100While();
        Loops.iniciarJogo();
//        Loops.perguntaAsteriscos(entrada);

        // Exercícios Arrays
        System.out.println("----------- 7- Exercícios Arrays -----------");
        ListaArrays.imprimirArrayNomes(0);
        ListaArrays.imprimirArrayNomes(2);
        ListaArrays.imprimirArrayNomes(4);
        ListaArrays.imprimirArrayNotas();
        ListaArrays.calcularArrayNotas();
        ListaArrays.verificarNumeros();
//        ListaArrays.perguntarNomesDesafio(entrada);

        // Exercícios Strings
        System.out.println("----------- 8- Exercícios Strings -----------");
//        Strings.perguntarNomeCompleto(entrada);
//        Strings.perguntarNome(entrada);
//        Strings.perguntarNome2(entrada);
//        Strings.perguntarFrasePalavra(entrada);
//        Strings.perguntarNome3(entrada);
//        Strings.perguntarNome4(entrada);
//        Strings.perguntarPalavra(entrada);


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
//        TratamentoExcecoes.doisNumeros(entrada);
//        TratamentoExcecoes.mostrarPosicaoArray(entrada);
//        TratamentoExcecoes.pedirIdade(entrada);
        TratamentoExcecoes.imprimeNome();
        TratamentoExcecoes.imprimeListaNomes();
//        TratamentoExcecoes.imprimeDesafioDivisao(entrada);
    }
}
