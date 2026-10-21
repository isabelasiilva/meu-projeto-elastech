package org.example.aula14_08Out.heranca;

public class Professora extends Pessoa{
    private String disciplina;

    public void lancarNota(Aluna aluna, double nota){
        System.out.printf("%s lançou a nota %.1f para %s",  getNome(),  nota,  aluna.getNome());
    }

    @Override
    public void apresentar(){
        System.out.println("Oi, eu sou " + getNome() + " e ensino " + this.disciplina);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
