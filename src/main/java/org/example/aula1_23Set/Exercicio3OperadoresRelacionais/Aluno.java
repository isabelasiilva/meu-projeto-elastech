package org.example.aula1_23Set.Exercicio3OperadoresRelacionais;

public class Aluno {
    String nome;
    double nota;

    Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public static void mostrarComparaçaoDeAluno(Aluno aluno1, Aluno aluno2) {
        if (aluno1.nota == aluno2.nota) {
            System.out.println("As notas de " + aluno1.nome + " e " + aluno2.nome + " são iguais.");
        } else {
            if (aluno1.nota < aluno2.nota) {
                System.out.println("As notas de " + aluno1.nome + " e " + aluno2.nome + "são diferentes. E a nota de " + aluno2.nome + " é maior que a nota de " + aluno1.nome + ".");
            } else {
                System.out.println("As notas de " + aluno1.nome + " e " + aluno2.nome + " são diferentes. E a nota de " + aluno1.nome + " é maior que a nota de " + aluno2.nome + ".");
            }
        }
    }
}
