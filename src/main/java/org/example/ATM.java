package org.example;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Jean Paul");
        account.setAccountType("Corrente");
        account.setBalance(0);
        Scanner optionScanner = new Scanner(System.in);
        Scanner pixScanner = new Scanner(System.in);
        Scanner removeScanner = new Scanner(System.in);
        int option = 0;
        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Fazer pix transferir valor
                3 - Sacar
                4 - Sair do sistema
                """;
        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + account.getName());
        System.out.println("Tipo conta: " + account.getAccountType());
        System.out.println("Saldo atual: " + account.getBalance());
        System.out.println("\n***********************");
        while (option != 4) {
            if (option == 1) {
                System.out.println("Olá " + account.getName() + ", seu saldo é: R$ " + account.getBalance());
                System.out.println("Digite 0 para voltar o menu principal");
            } else if (option == 2) {
                System.out.println("Qual valor do pix?");
                double pix = pixScanner.nextDouble();
                account.deposit(pix);
                System.out.println("Você depositou: " + pix);
                System.out.println("Digite 0 para voltar o menu principal");
            } else if (option == 3) {
                System.out.println("Qual valor que você deseja sacar?, Você tem R$ " + account.getBalance());
                double remove = removeScanner.nextDouble();
                account.withdraw(remove);
                System.out.println("Digite 0 para voltar o menu principal");
            } else if (option == 4) {
                System.out.println("Até logo!");
            } else if (option >= 5) {
                System.out.println("Opção inválida!");
                System.out.println("Digite 0 para voltar o menu principal");
            } else {
                System.out.println(menu);
            }
            option = optionScanner.nextInt();
        }
        System.out.println("Caixa Fechado!");
    }
}
