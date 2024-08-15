/*Exercício 11: Palíndromo
Crie um programa que verifique se uma palavra fornecida pelo usuário é
um palíndromo (palavra que se lê da mesma forma de trás para frente).*/

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra para verificar se ela é um palíndromo:");
        String palavra = scanner.nextLine();

        // Inverte a palavra
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        // Verifica se a palavra original é igual à palavra invertida
        if (palavra.equals(palavraInvertida)) {
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
        }

        scanner.close();
    }
}
