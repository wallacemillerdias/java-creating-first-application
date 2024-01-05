package org.example;

import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu name: ");
        String name = scanner.nextLine();
        System.out.print("Digite sua age: ");
        int age = scanner.nextInt();
        System.out.print("Digite o valor que pretende investir esse mês: ");
        double value = scanner.nextDouble();
        System.out.println(name + " que tem " + age + " anos, irá investir R$ " + value + " esse mês.");
        scanner.close();
    }
}
