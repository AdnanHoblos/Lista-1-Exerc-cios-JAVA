/*Exercício 10: Número Primo
Escreva um programa que determine se um número fornecido pelo usuário é primo.
Um número primo é aquele que só é divisível por 1 e por ele mesmo.*/

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se ele é primo:");
        int num = scanner.nextInt();

        // Assumimos que o número é primo, até que se prove o contrário
        boolean ehPrimo = true;

        // Verificamos se o número é menor que 2 (não é primo se for menor que 2)
        if (num < 2) {
            ehPrimo = false;
        } else {
            // Verificamos se existe algum número entre 2 e num - 1 que divida num sem deixar resto
            for (int i = 2; i < num; i++) {
                if (num % i == 0) { // Se num for divisível por i
                    ehPrimo = false; // Não é primo
                    break; // Saímos do loop, pois já encontramos um divisor
                }
            }
        }

        // Exibimos o resultado
        if (ehPrimo) {
            System.out.println("O número " + num + " é primo.");
        } else {
            System.out.println("O número " + num + " não é primo.");
        }

        scanner.close();
    }
}

