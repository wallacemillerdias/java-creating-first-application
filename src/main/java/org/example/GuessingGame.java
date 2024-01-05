package org.example;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberGenerated = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int attempts = 0;
        while (attempts < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            int numberTyped = reader.nextInt();
            attempts++;
            if (numberTyped == numberGenerated) {
                System.out.println("Parabéns, você acertou o número em " + attempts + " attempts!");
                break; // interrompe o loop while
            } else if (numberTyped < numberGenerated) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }
        if (attempts == 5) {
            System.out.println("Você não conseguiu adivinhar o número em 5 attempts. O número era " + numberGenerated);
        }
    }
}
