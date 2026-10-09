package org.example.aula11_listaRevisao04Out;

public class Concatenacao {
        public static void apresentarPessoa(String nomePessoa, int idadePessoa) {
                System.out.println(nomePessoa + " tem " + idadePessoa + " anos.");
        }

        public static void calcularMediaNotas(double primeiraNota, double segundaNota) {
                double media = (primeiraNota + segundaNota) / 2;
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
