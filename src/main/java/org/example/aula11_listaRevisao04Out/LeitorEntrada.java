package org.example.aula11_listaRevisao04Out;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class LeitorEntrada {
    private final Scanner scanner;

    public LeitorEntrada() {
        this(new Scanner(System.in));
    }

    public LeitorEntrada(Scanner scanner) {
        this.scanner = Objects.requireNonNull(scanner, "O Scanner é obrigatório.");
    }

    public String lerTexto(String mensagem) {
        System.out.println(mensagem);
        return scanner.nextLine();
    }

    public String lerTextoNaoVazio(String mensagem) {
        String texto;
        do {
            texto = lerTexto(mensagem).trim();
            if (texto.isEmpty()) {
                System.out.println("A entrada não pode ser vazia.");
            }
        } while (texto.isEmpty());
        return texto;
    }

    public int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.println(mensagem);
                return scanner.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Digite um número inteiro válido.");
                scanner.next();
            }
        }
    }

    public int lerInteiro(String mensagem, int minimo, int maximo) {
        int valor;
        do {
            valor = lerInteiro(mensagem);
            if (valor < minimo || valor > maximo) {
                System.out.println("Digite um valor entre " + minimo + " e " + maximo + ".");
            }
        } while (valor < minimo || valor > maximo);
        return valor;
    }

    public double lerDouble(String mensagem) {
        while (true) {
            try {
                System.out.println(mensagem);
                return scanner.nextDouble();
            } catch (InputMismatchException exception) {
                System.out.println("Digite um número válido.");
                scanner.next();
            }
        }
    }

    public void consumirFimDaLinha() {
        scanner.nextLine();
    }

    public void perguntarNome() {
        mensagemOla(lerTextoNaoVazio("Digite seu nome:"));
    }

    private void mensagemOla(String nomePessoa) {
        System.out.println("Olá, " + nomePessoa);
    }

    public void perguntarIdade() {
        mensagemIdade(lerInteiro("Digite sua idade:", 0, 100));
    }

    private void mensagemIdade(int idadePessoa) {
        System.out.println("Você tem " + idadePessoa + " anos. E vai fazer " + (idadePessoa + 1) + " anos no ano que vem.");
    }

    public void perguntarNumeros() {
        int numero1 = lerInteiro("Digite um número:");
        int numero2 = lerInteiro("Digite outro número:");
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + (numero1 + numero2));
    }

    public void perguntarAlturaPeso() {
        double altura = lerDouble("Qual sua altura?");
        double peso = lerDouble("Qual seu peso?");
        System.out.println("Sua altura é " + altura + " e seu peso é " + peso);
    }

    public void perguntarIdadeNomeCidade() {
        int idade = lerInteiro("Digite sua idade:", 0, 100);
        consumirFimDaLinha();
        String nome = lerTextoNaoVazio("Digite seu nome:");
        String cidade = lerTextoNaoVazio("Digite sua cidade:");
        System.out.println("Seu nome é " + nome + ", sua idade é " + idade + " anos. Você mora em " + cidade);
    }
}
