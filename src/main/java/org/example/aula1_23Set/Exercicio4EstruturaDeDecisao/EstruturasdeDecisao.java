package org.example.aula1_23Set.Exercicio4EstruturaDeDecisao;

public class EstruturasdeDecisao {
    public static void main(String[] args) {
        System.out.println("Exercicio 1");
        Idade.mensagemFaixaEtaria(3);
        Idade.mensagemFaixaEtaria(10);
        Idade.mensagemFaixaEtaria(13);
        Idade.mensagemFaixaEtaria(15);
        Idade.mensagemFaixaEtaria(17);
        Idade.mensagemFaixaEtaria(18);
        Idade.mensagemFaixaEtaria(20);
        Idade.mensagemFaixaEtaria(23);
        Idade.mensagemFaixaEtaria(59);
        Idade.mensagemFaixaEtaria(60);
        Idade.mensagemFaixaEtaria(80);

        System.out.println("\nExercicio 2");
        ContaBancaria.AprovadorDeCompra(300, 301);
        ContaBancaria.AprovadorDeCompra(20, 400);
        ContaBancaria.AprovadorDeCompra(10, 2);

        System.out.println("\nExercicio 3 (com Scanner)");
        Cardapio.ApresentarCardapio();

        System.out.println("\nExercicio 4");
        Idade.verificadorFesta(20, false);
        Idade.verificadorFesta2(13, false);

        System.out.println("\nDesafio: \n Crie variáveis para três notas de uma aluna. Calcule a média e mostre: \"Aprovada\" se for 7 ou mais, \"Recuperação\" entre 5 e 6.9, e \"Reprovada\" abaixo de 5. Mostre também a média na tela.");
        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média é  %.2f%n", media);

        if (media >= 7) {
            System.out.println("Aprovada");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovada");
        }
        System.out.printf("Sua nota 1 é %.2f, sua nota 2 é %.2f, sua nota 3 é %.2f, e sua média é %.2f", nota1, nota2, nota3, media);
    }
}
