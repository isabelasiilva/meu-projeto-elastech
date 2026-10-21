package org.example.aula20_atividade21Out;

public class Builder {
    private String nomePet;
    private String servico;
    // ...

    public Builder nome(String nomePet) {
        this.nomePet = nomePet;
        return this;
    }
    public Builder servico(String servico) {
        this.servico = servico;
        return this;
    }
    // ...
}
