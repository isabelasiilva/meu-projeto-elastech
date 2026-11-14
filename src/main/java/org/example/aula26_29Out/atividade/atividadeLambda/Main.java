package org.example.aula26_29Out.atividade.atividadeLambda;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== 1. Runnable ===");
        Runnable acao = () -> System.out.println("Executando tarefa");
        Runnable acaoSegunda = () -> System.out.println("Executando segunda tarefa");

        acao.run();
        acaoSegunda.run();


        System.out.println("\n=== 2. Consumer ===");
        Consumer<String> saudacao = (nome) -> System.out.println("Olá, " + nome);
        saudacao.accept("Isabela");

        Consumer<String> maiusculo = (nome) -> System.out.println(nome.toUpperCase());
        maiusculo.accept("Isabela");


        System.out.println("\n=== 3. Supplier ===");
        Supplier<String> avisoSistema = () -> "Aviso: O sistema está online!";
        System.out.println(avisoSistema.get());

        Supplier<Integer> geradorNumero = () -> new Random().nextInt(100);
        System.out.println("Primeira chamada: " + geradorNumero.get());
        System.out.println("Segunda chamada: " + geradorNumero.get());


        System.out.println("\n=== 4. Predicate ===");
        Predicate<Integer> maiorQueDez = (numero) -> numero > 10;
        System.out.println("O número 5 é maior que 10? " + maiorQueDez.test(5));   // false
        System.out.println("O número 15 é maior que 10? " + maiorQueDez.test(15)); // true

        Predicate<String> textoVazio = (texto) -> texto.isEmpty();
        System.out.println("A String \"\" está vazia? " + textoVazio.test(""));       // true
        System.out.println("A String \"Java\" está vazia? " + textoVazio.test("Java")); // false


        System.out.println("\n=== 5. Function ===");
        Function<Integer, String> formatarNota = (numero) -> "Nota fiscal nº: " + numero;
        String notaFormatada = formatarNota.apply(1542);
        System.out.println(notaFormatada);

        Function<String, Integer> contarLetras = (palavra) -> palavra.length();
        Integer totalLetras = contarLetras.apply("Professor");
        System.out.println("A palavra 'Professor' tem " + totalLetras + " letras.");
    }
}
