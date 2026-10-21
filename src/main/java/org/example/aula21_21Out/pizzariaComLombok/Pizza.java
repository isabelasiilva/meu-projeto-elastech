package org.example.aula21_21Out.pizzariaComLombok;

import lombok.Builder;

@Builder
public class Pizza {
    String sabor;
    boolean temQueijo;
    String borda;

    void mostrar(){
        System.out.println("Pizza de sabor " + this.sabor + " com a borda de " + this.borda + " e com extra de queijo: " + this.temQueijo);
    }
}
