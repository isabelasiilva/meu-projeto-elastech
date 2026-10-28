package org.example.aula18_16Out.aula18_atividadeSingleton16Out;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carrinho {
    private static int quantidadeItens = 0;
    private static Carrinho instance;

    private Carrinho() {}

    public static Carrinho getInstance() {
        if (instance == null) {
            instance = new Carrinho();
        }
        return instance;
    }

    public void adicionarItem(){
        quantidadeItens ++;
    }

    public void getQuatidadeItens() {
        System.out.println("Quantidade: " + quantidadeItens);
    }
}
