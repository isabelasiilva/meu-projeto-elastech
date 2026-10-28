package org.example.aula18_16Out.aula18_atividadeSingleton16Out;

public class Main {
    public static void main(String[] args) {
        // ContadorVisitas
        ContadorVisitas pagina1 = ContadorVisitas.getInstancia();
        ContadorVisitas pagina2 = ContadorVisitas.getInstancia();

        pagina1.registrarVisita();
        System.out.println(pagina1.getTotal());
        pagina2.registrarVisita();
        System.out.println(pagina2.getTotal());

        // Carrinho
        Carrinho telaProdutos = Carrinho.getInstance();
        Carrinho telaPromocoes = Carrinho.getInstance();

        telaProdutos.adicionarItem();
        telaProdutos.adicionarItem();
        telaProdutos.getQuatidadeItens();

        telaPromocoes.adicionarItem();
        telaPromocoes.adicionarItem();
        telaPromocoes.getQuatidadeItens();
    }
}
