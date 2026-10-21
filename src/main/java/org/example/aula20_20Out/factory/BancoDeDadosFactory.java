package org.example.aula20_20Out.factory;

public class BancoDeDadosFactory {
    public static BancoDeDados criar(int opcao){
        if(opcao == 1){
            return new MySql();
        } else if(opcao == 2){
            return new Oracle();
        } else {
            throw new IllegalArgumentException("Opção inválida");
        }
    }
}
