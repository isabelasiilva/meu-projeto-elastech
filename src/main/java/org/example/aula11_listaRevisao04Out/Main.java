package org.example.aula11_listaRevisao04Out;

public class Main {
    public static void main(String[] args) {
        // Exercícios variáveis
        System.out.println("----------- Exercícios variáveis -----------");
        System.out.println("Nome: " + Variaveis.nome);
        System.out.println("Idade: " + Variaveis.idade);
        System.out.println("Altura: " + Variaveis.altura);

        System.out.println("Eu moro em " + Variaveis.cidade);

        System.out.println("Nome completo: " + Variaveis.primeiroNome + " " + Variaveis.sobrenome);

        System.out.println("O valor do boné é R$" + Variaveis.preco);

        if (Variaveis.temCarteira == true) {
            System.out.println("Tem carteira");
        } else {
            System.out.println("Não tem carteira");
        }

        System.out.println("Desafio variáveis");

        System.out.println("a = " + Variaveis.a + ", b = " + Variaveis.b);
        int c = Variaveis.b;

        Variaveis.b = Variaveis.a;
        Variaveis.a = c;
        System.out.println("a = " + Variaveis.a + ", b = " + Variaveis.b);


        // Exercícios operadores
        System.out.println("----------- Exercícios operadores -----------");
        System.out.println(Operadores.soma(Operadores.a,Operadores.b));
        System.out.println(Operadores.subtracao(Operadores.a,Operadores.b));
        System.out.println(Operadores.multiplicacao(Operadores.a,Operadores.b));
        System.out.println(Operadores.divisao(Operadores.a,Operadores.b));
        System.out.println(Operadores.resto(Operadores.a,Operadores.b));

        Operadores.saldo +=250;
        System.out.println("Saldo + 250 = " + Operadores.saldo);
        Operadores.saldo -=380;
        System.out.println("Saldo - 380 = " + Operadores.saldo);

        Operadores.a = 10;
        Operadores.b = 10;
        System.out.println("a==b = " + (Operadores.a==Operadores.b));
        System.out.println("a!=b = " + (Operadores.a!=Operadores.b));
        System.out.println("a>b = " + (Operadores.a>Operadores.b));
        System.out.println("a>=b = " + (Operadores.a>=Operadores.b));

        if (Operadores.idade >=18 && Operadores.temCarteira) {
            System.out.println("A pessoa é maior de 18 anos e tem carteira de motorista");
        } else {
            System.out.println("A pessoa não tem 18 anos ou não possui carteira de motorista");
        }

        System.out.println("Resto da divisão de " + Operadores.numero + " por 2 = " + (Operadores.numero % 2));

        System.out.println("\nA compra de 3 arroz é R$" + (Operadores.arroz*3));

        System.out.println("\nEsse número é divisível por 3 e por 5 ao mesmo tempo?");
        System.out.println(Operadores.resultado);


        // Exercícios concatenação
        System.out.println("----------- Exercícios concatenação -----------");
        System.out.println(Concatenacao.nome + " tem " + Concatenacao.idade + " anos.");

        System.out.printf("A media das notas %.2f e %.2f é %.2f \n", Concatenacao.nota1, Concatenacao.nota2, Concatenacao.media);

        System.out.printf("O valor é R$ %.2f \n", Concatenacao.preco);

        System.out.printf("Meu nome é %s, tenho %d, e %.1f de altura \n",  Concatenacao.nome, Concatenacao.idade, Concatenacao.altura);

        System.out.println("----Recibo---");
        System.out.printf("Produto: %s / Valor R$ %.2f", Concatenacao.produto1, Concatenacao.preco1);
        System.out.printf("Produto: %s / Valor R$ %.2f", Concatenacao.produto2, Concatenacao.preco2);
        System.out.printf("Produto: %s / Valor R$ %.2f", Concatenacao.produto3, Concatenacao.preco3);
        System.out.printf("---Total: R$ %.2f---", Concatenacao.total);

        System.out.println(Concatenacao.total2);

        Concatenacao.total2 += Concatenacao.preco1;
        System.out.println(Concatenacao.total2);

        Concatenacao.total2 += Concatenacao.preco2;
        System.out.println(Concatenacao.total2);

        Concatenacao.total2 += Concatenacao.preco3;
        System.out.println(Concatenacao.total2);

        // Exercícios Scanner
        System.out.println("----------- Exercícios Scanner -----------");
    }
}
