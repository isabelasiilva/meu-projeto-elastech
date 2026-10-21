package org.example.aula20_20Out.polimorfismoComInterfaces;

public class Main {
    public static void main(String[] args) {
        MySql mySql = new MySql();
        mySql.nomeMySql = "aqui será acessado";

        BancoDeDados mongoDb = new MongoDb();
        //mongoDb. // nao tem acesso ao atributo nomeUsuario

        metodo1(mySql);
//        metodo1(mongoDb); // nao funciona
        metodo2(mySql);
        metodo2(mongoDb);
    }

    public static void metodo1(MySql mysql){}
    public static void metodo2(BancoDeDados bancoGenerico){}
}
