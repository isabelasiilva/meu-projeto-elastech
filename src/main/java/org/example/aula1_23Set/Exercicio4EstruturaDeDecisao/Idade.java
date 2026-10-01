package org.example.aula1_23Set.Exercicio4EstruturaDeDecisao;

public class Idade {
    static void mensagemFaixaEtaria(int idade) {
        if (idade < 13) {
            System.out.println("É uma criança! A idade é " + idade + " anos.");
        } else if ( idade >= 13 && idade <= 17) {
            System.out.println("É um adolescente! A idade é " + idade + " anos.");
        } else if ( idade >= 18 && idade <= 59) {
            System.out.println("É um adulto! A idade é " + idade + " anos.");
        } else {
            System.out.println("É um idoso! A idade é " + idade + " anos.");
        }
    }

    static void verificadorFesta(int idade, boolean autorizacao) {
        if (idade >= 18 || autorizacao) {
            System.out.println("Pode entrar na festa");
        } else {
            System.out.println("Não tem autorização para entrar na festa ou não atingiu o limite de idade.");
        }
    }

    static void verificadorFesta2(int idade, boolean autorizacao) {
        if (idade >= 18 && autorizacao) {
            System.out.println("Pode entrar na festa");
        } else if (idade >= 18 && !autorizacao){
            System.out.println("É maior de idade, mas não tem autorização para entrar na festa");
        } else {
            System.out.println("Não tem autorização para entrar na festa");
        }
    }
}
