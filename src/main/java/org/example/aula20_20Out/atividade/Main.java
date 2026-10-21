package org.example.aula20_20Out.atividade;

public class Main {
    /*
    Crie uma interface BancoDeDados que implementa chamarBanco() e getNumero(). Depois classes chamadas Oracle e MySql e Main. MySql e Oracle devem implementar a interface e ter um atributo int numero. chamarBanco() deve retornar uma mensagem de acordo com o banco conectado, e getNumero deve retornar o numero.

    Exemplo:

    O Banco conectado é o MySql.

    Na sua Main crie um método conectarBanco() para receber um dos bancos e dentro dele chamar o método chamarBanco() .
    */
    public static void main(String[] args) {
        BancoDeDados mySql = new MySql();
        mySql.chamarBanco();
        mySql.getNumero();

        BancoDeDados oracle = new Oracle();
        oracle.chamarBanco();
        oracle.getNumero();
    }
}
