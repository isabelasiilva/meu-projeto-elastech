package org.example.aula11_listaRevisao04Out;

public class Loops {
    public static void imprimirNumeros(){
        for (int i = 1; i <= 20; i++){
            System.out.println(i);
        }
    }

    public static void imprimirNumerosRegressivos(){
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println("Fim!");
    }

    public static void pedirNumeroTabuada(LeitorEntrada entrada) {
        int numero = entrada.lerInteiro("Digite um número para saber a tabuada:");
        imprimirTabuada(numero);
    }

    private static void imprimirTabuada(int numero) {
        System.out.println("\n--- Tabuada do " + numero + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println("--------------------\n");
    }

    public static void imprimirNumerosPares(){
        for (int i = 1; i <= 30; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void somaNumerosAte100(){
        int soma = 0;
        for (int i = 1; i <= 100; i++){
            soma += i;
        }
        System.out.println("A soma dos números de 1 até 100 é " + soma);
    }

    public static void somaNumerosAte100While(){
        int soma = 0;
        int inicio = 0;
        int fim = 100;

        while (inicio <= fim){
            soma += inicio;
            inicio++;
        }

        System.out.println("A soma dos números de 1 até 100 é " + soma);
    }

    public static void iniciarJogo(){
        int vidas = 3;
        while (vidas > 0){
            System.out.println("Jogando... Você tem " + vidas + " vidas");
            vidas--;
        }
    }

    public static void perguntaAsteriscos(LeitorEntrada entrada){
        int altura = entrada.lerInteiro("Escolha qual a altura do triângulo?");

        for (int i = 1; i <= altura; i++) {

            // Laço de dentro: imprime os asteriscos da linha atual
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Quebra de linha após imprimir todos os asteriscos da linha
            System.out.println();
        }
    }
}
