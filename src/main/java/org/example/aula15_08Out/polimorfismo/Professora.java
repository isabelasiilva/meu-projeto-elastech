package org.example.aula15_08Out.polimorfismo;

import org.example.aula15_08Out.heranca.Pessoa;

public class Professora extends Pessoa {
    String disciplina;

//    @Override
//    public void apresentar() {
//        super.apresentar();
//    }

    void apresentar(String cargo) {
        System.out.println("Oi, sou " + getNome() + ", " + cargo);
    }

    public void lancarNota(Aluna aluna, double nota){
        System.out.printf("%s lançou a nota %.1f para %s\n",  getNome(),  nota,  aluna.getNome());
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
