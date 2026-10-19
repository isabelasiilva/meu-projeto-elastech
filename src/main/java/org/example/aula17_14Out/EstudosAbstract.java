package org.example.aula17_14Out;

import org.example.aula17_14Out.bancoDeDados.BancoDeDados;
import org.example.aula17_14Out.bancoDeDados.MongoDb;
import org.example.aula17_14Out.bancoDeDados.MySql;
import org.example.aula17_14Out.bancoDoBrasil.Pagamento;

public class EstudosAbstract {
    public static void main(String[] args) {
        MySql mySql = new MySql(); // implementa a interface, entao pode ser passado de parametro para conectarBanco
        mySql.conectar();
        conectarBanco(mySql);

        // criando uma nova conexão com banco de dados, ao inves de criar uma classe unica chamada bacno de dados e ter varios ifs de qual qual vamos chamar
        MongoDb mongoDb = new MongoDb();
        mongoDb.conectar();
        conectarBanco(mongoDb);
    }

    static public void conectarBanco(BancoDeDados bancoGenerico){ // recebe algo da interface generica BancoDeDados
        System.out.println("Conectando Banco de Dados");
    }

    void receberPagamento(int n){}
    void receberPagamento(String a){}
    //Polimorfismo com Interfaces
    void receberPagamento(Pagamento pagamentoPix){} // pode passar os dois objetos como argumentos, desde que que a classe tenha implementado a interface
//    void receberPagamento(Pagamento variavelGenerica){}
}
