package org.example.aula11_listaRevisao04Out;

public class Concatenacao {
        static String nome = "Isabela";
        static int idade = 27;
        static double altura = 175.5;

        static double nota1 = 8.0;
        static double nota2 = 7.0;

        static double preco = 50;

        static String produto1 = "Camiseta";
        static String produto2 = "Bermuda";
        static String produto3 = "Vestido";
        static double preco1 = 50;
        static double preco2 = 37.25;
        static double preco3 = 21.49;

        static double total2 = 0;

        public static void apresentarPessoa(String nomePessoa, int idadePessoa) {
                System.out.println(nomePessoa + " tem " + idadePessoa + " anos.");
        }

        public static void calcularMediaNotas(double primeiraNota, double segundaNota) {
                double media = (nota1 + nota2)/2;
                System.out.printf("A media das notas %.2f e %.2f é %.2f \n", primeiraNota, segundaNota, media);
        }

        public static void apresentarProduto(double precoProduto) {
                System.out.printf("O valor é R$ %.2f \n", precoProduto);
        }

        public static void apresentarPessoa2(String nomePessoa, int idadePessoa,  double aluraPessoa) {
                System.out.printf("Meu nome é %s, tenho %d, e %.1f de altura \n",  nomePessoa, idadePessoa, aluraPessoa);
        }

        public static void imprimirRecibo(String primeiroProduto,String segundoProduto, String terceiroProduto, double primeiroPreco, double segundoPreco, double terceiroPreco) {
                double total = primeiroPreco + segundoPreco + terceiroPreco;

                System.out.println("\n----Recibo---");
                System.out.printf("Produto: %s / Valor R$ %.2f\n", primeiroProduto, primeiroPreco);
                System.out.printf("Produto: %s / Valor R$ %.2f\n", segundoProduto, segundoPreco);
                System.out.printf("Produto: %s / Valor R$ %.2f\n", terceiroProduto, terceiroPreco);
                System.out.printf("---Total: R$ %.2f---\n", total);
        }

}
