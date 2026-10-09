package org.example.aula11_listaRevisao04Out;

public class ListaArrays {
    public static void imprimirArrayNomes(int posicao) {
        String[] nomes = {"Isabela", "Rafael", "Ronaldo", "Yasmin", "Micaela"};
        System.out.println(nomes[posicao]);
    }

    public static void imprimirArrayNotas() {
        int[] notas = {8, 6, 10, 7, 9};
        for (int nota : notas) {
            System.out.println(nota);
        }
    }

    public static void calcularArrayNotas() {
        int[] notas = {8, 6, 10, 7, 9};
        int soma = 0;

        for (int nota : notas) {
            soma += nota;
        }
        double media = (double) soma / notas.length;

        System.out.println("A soma do array é " + soma);
        System.out.println("A média do array é " + media);
    }

    public static void verificarNumeros() {
        int[] numeros = {8, 5, 10, 4, 7};
        int contador = 0;
        for (int numero : numeros) {
            if (numero >= 7) {
                contador++;
            }
        }
        System.out.println("Há " + contador + " números maiores ou iguais a 7 no array numeros = {8, 5, 10, 4, 7}");
    }

    public static void perguntarNomesDesafio(LeitorEntrada entrada) {
        String[] nomesDesafio = {"Felipe", "Flora", "Fabiana", "Fernanda", "Frida"};
        String nomeInformado = entrada.lerTexto("Envie um nome para verificar se está na lista:");
        int posicao = -1;

        for (int i = 0; i < nomesDesafio.length; i++) {
            if (nomesDesafio[i].equals(nomeInformado)) {
                posicao = i;
                break;
            }
        }
        if (posicao == -1) {
            System.out.println("Não foi encontrado nenhum nome igual a " + nomeInformado);
        } else {
            System.out.println("Encontramos um nome na lista igual a " + nomeInformado + " na posição " + posicao);
        }
    }
}
