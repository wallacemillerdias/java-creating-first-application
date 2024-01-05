package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
        System.out.println("JVM (Java Virtual Machine) - é a Máquina Virtual do Java responsável por executar o bytecode");
        System.out.println("JRE (Java Runtime Environment) - Ambiente de Execução do Java que fornece as bibliotecas padrões do Java para o JDK compilar o seu código e para a JVM executar o seu program");
        System.out.println("-------------------");
        System.out.println(".:: Sreen Match Filmes ::.");
        // Tipos primitimos
        // boolean, byte, short, int, long, float, double
        // "+" (adição)
        // "-" (subtração)
        // "*" (multiplicação)
        // "/" (divisão)
        // "%" (resto da divisão)
        int anoDeLancamento = 2022;
        anoDeLancamento += 1;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String nomeDoFilme = "Top Gun: Maverick";
        System.out.println("Filme:" + nomeDoFilme);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Incluído no plano?: " + (incluidoNoPlano ? "Sim" : "Não"));
        System.out.println("Nota: " + notaDoFilme);
        int a = 10; // Atribui o valor 10 à variável a
        int b = 5; // Atribui o valor 5 à variável b
        int c = 30; // Atribui o valor 30 à variável c
        boolean igual = (b == a); //Nesse caso a variável igual ficará com o valor *false*, pois o valor de b não é igual o valor de a.
        boolean diferente = (b != c); //A variável diferente ficará com o valor *true*, pois o valor de b é diferente do valor de c.
        boolean maior = (b > a); //A variável maior ficará com o valor *false*, pois o valor de b é menor que o valor de a.
        boolean menorIgual = (b <= c); //A variável menorIgual ficará com o valor *true*, pois o valor de b é menor que o valor de c.
        boolean d = true;
        boolean f = false;
        if (d && f) {
            // Este código não será executado, já que a é verdadeiro e f é falso.
        }
        boolean g = true;
        boolean h = false;
        if (g || h) {
            // Este código será executado, já que a é verdadeiro, mesmo que h seja falso.
        }
        int num = 5;
        int resultado = ++num; //num é incrementado para 6 e depois atribuído a resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 6
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
        Person pessoaVazia = new Person();
        Person pessoa = new Person(1L, "Jean", "jeanpaulwebb@gmail.com", "123");
        pessoaVazia.setId(2L);
        pessoaVazia.setNome("Maria");
        pessoaVazia.setEmail("maria@example.com");
        pessoaVazia.setSenha("outrasenha");
        System.out.println(pessoaVazia);
        System.out.println(pessoa);
        int dia = 3;
        String nomeDia;
        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }
        System.out.println("O dia " + dia + " é " + nomeDia);
    }
}


