package org.example.aula15_08Out.heranca;

public class Diretora extends Gerente{
    public void definirMeta(String meta){
        System.out.println(getNome() + " definiu a meta: " + meta);
    }
}
