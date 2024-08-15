/*Exercício 15: Fatorial
Crie um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Utilize tanto a versão iterativa quanto a versão recursiva.*/

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }
}

