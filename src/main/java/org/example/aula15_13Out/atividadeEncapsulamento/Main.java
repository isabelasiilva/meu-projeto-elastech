package org.example.aula15_13Out.atividadeEncapsulamento;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        System.out.println("--- Exercício 1 ---");
//        Testar erro de saída quando tentamos acessar a propriedade private
//        System.out.println(conta.titular);
//        conta.saldo = -5000;

        System.out.println("--- Exercício 2 ---");
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());

        System.out.println("--- Exercício 3 ---");
        conta.setTitular("");
        conta.setTitular("Isabela");
        System.out.println("Titular: " + conta.getTitular());

        conta.setSaldo(-300);
        conta.setSaldo(500);
        System.out.println("Saldo: " + conta.getSaldo());

        System.out.println("--- Exercício 4 ---");
        conta.depositar(100);
        conta.depositar(-30);
        System.out.println("Saldo: " + conta.getSaldo());

        conta.sacar(2000);
        conta.sacar(200);
        System.out.println("Saldo: " + conta.getSaldo());

        System.out.println("--- Exercício 5 ---");
        Produto produto = new Produto();
        // System.out.println(produto.codigoInterno); // para testar saída no terminal
        System.out.println(produto.nome);
        System.out.println(produto.preco);

        System.out.println("--- Exercício 6 ---");
        System.out.println("Numero da conta: " + conta.getNumeroConta());
        // conta.setNumeroConta; // para testar saída no terminal
    }
}
