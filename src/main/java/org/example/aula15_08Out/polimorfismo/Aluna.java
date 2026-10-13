package org.example.aula15_08Out.polimorfismo;

import org.example.aula15_08Out.heranca.Pessoa;

public class Aluna extends Pessoa {
    private String curso;

    public void estudar(){
        System.out.println(getNome() + " está estudando " + curso);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
