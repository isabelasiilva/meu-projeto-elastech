package org.example.aula15_08Out.heranca;

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
