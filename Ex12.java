/*Exercício 12: Ordenação de Números
Implemente um programa que leia 5 números inteiros do usuário,
armazene-os em um array e os imprima em ordem crescente.*/

import java.util.Arrays;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        // Lê 5 números do usuário
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

        // Ordena o array em ordem crescente
        Arrays.sort(numeros);

        // Imprime os números em ordem crescente
        System.out.println("Os números em ordem crescente são:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}

