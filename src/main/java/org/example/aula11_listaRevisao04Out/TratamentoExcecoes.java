package org.example.aula11_listaRevisao04Out;

public class TratamentoExcecoes {
    public static void doisNumeros(LeitorEntrada entrada) {
        int n1 = entrada.lerInteiro("Digite o primeiro número:");
        int n2 = entrada.lerInteiro("Digite o segundo número:");

        try {
            int divisao = n1 / n2;
            System.out.println("\nOs números digitados foram: " + n1 + " e " + n2 + ". A divisão é " + divisao);
        } catch (ArithmeticException ae) {
            System.out.println("Não pode dividir por zero!");
        }

    }

    public static void mostrarPosicaoArray(LeitorEntrada entrada){
        int[] listaNotas = {5, 7, 4, 9, 6};
        try {
            int posicao = entrada.lerInteiro("Digite uma posição de array para ser verificada:");
            System.out.println("O número nessa posição é " + listaNotas[posicao]);
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("O array não tem essa posição!");
        }
    }

    public static void pedirIdade(LeitorEntrada entrada){
        int idade = entrada.lerInteiro("Digite uma idade entre 0 e 100:", 0, 100);
        System.out.println("Sua idade é " + idade);
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
        String[] listaNomes = {"Marina", "José", "Mário"};
        try {
            System.out.println(listaNomes[5]);
        }catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Não tem essa posição na lista de nomes!");
        } finally {
            System.out.println("Programa funcionando!");
        }
    }

    public static void imprimeDesafioDivisao(LeitorEntrada entrada) {
        int[] listaNotas = {5, 7, 4, 9, 6};
        try{
            int numero = entrada.lerInteiro("Digite um número:");
            System.out.println(100/numero);
            int posicao = entrada.lerInteiro("Digite uma posição do array para verificar:");
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
