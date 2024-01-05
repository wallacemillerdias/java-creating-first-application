package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BankAccount {
    private String name;
    private double balance;
    private String accountType;

    public BankAccount(String name) {
        this.name = name;
        this.balance = 0;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void withdraw(double value) {
        if (value > this.balance) {
            System.out.println("Opsss... Não há saldo para realizar a transferência.");
        } else {
            System.out.println("Aguarde a contagem das notas... você sacou: " + value);
            this.balance -= value;
        }
    }
}