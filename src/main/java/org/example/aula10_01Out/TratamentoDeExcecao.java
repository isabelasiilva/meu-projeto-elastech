package org.example.aula10_01Out;

public class TratamentoDeExcecao {

    public static void main(String[] args) {
        try {
            int resultado = 10 / 2;
            System.out.println(resultado);

        } catch (ArithmeticException e) {
            System.out.println("Não dá pra dividir por zero!");

        } finally {
            System.out.println("Isso sempre roda.");
        }

        System.out.println("O programa continua.");

    }
}
