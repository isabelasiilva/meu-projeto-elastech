package org.example.aula16_14Out.bancoDeDados;

public class Main {
    public static void main(String[] args) {
        MySql mySql = new MySql();
        MongoDb mongoDb = new MongoDb();

        mySql.conectar();
        mongoDb.conectar();
    }
}
