package org.example.aula15_08Out.heranca;

public class Professora extends Pessoa{
    String disciplina;

    public void lancarNota(Aluna aluna, double nota){
        System.out.printf("%s lançou a nota %.1f para %s",  this.nome,  nota,  aluna.nome);
    }

    @Override
    public void apresentar(){
        System.out.println("Oi, eu sou " + this.nome + " e ensino " + this.disciplina);
    }
}
