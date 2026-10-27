package org.example.aula18_16Out;

public class TesteSingleton {
    // primeiro criar uma variavel que vai guardar sua instancia
    private static TesteSingleton instancia;

    private TesteSingleton(){}

    public static TesteSingleton getInstancia() {
        if (instancia == null) { // checando se instancia é nula, se for não tem nenhum objeto dentro de instancia
            instancia = new TesteSingleton();
        }
        return instancia;
    }
}
