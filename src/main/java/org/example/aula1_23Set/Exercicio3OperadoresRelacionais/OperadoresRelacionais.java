package org.example.aula1_23Set.Exercicio3OperadoresRelacionais;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        // exercicio 1
        Aluno aluna1 = new Aluno("Maria", 10);
        Aluno aluna2 = new Aluno("Ana", 3);

        Aluno.mostrarComparaçaoDeAluno(aluna1, aluna2);

        Aluno aluna3 = new Aluno("Rafaela", 3);
        Aluno aluna4 = new Aluno("Thais", 10);

        Aluno.mostrarComparaçaoDeAluno(aluna3, aluna4);

        Aluno aluna5 = new Aluno("Heloisa", 5);
        Aluno aluna6 = new Aluno("Julia", 5);

        Aluno.mostrarComparaçaoDeAluno(aluna5, aluna6);

        // exercicio 2 e 3
        int a = 10;
        int b = 3;
        System.out.println((a==b));
        System.out.println((a=b));

        // exercicio 4
        boolean chovendo = true;
        System.out.println(!chovendo);
    }
}
