//Exercício 3: Operadores Aritméticos
//Escreva um programa que leia dois números
// do usuário e exiba a soma, subtração, multiplicação e divisão desses números.

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int A, B;

        System.out.println("Digite o primeiro numero");
        A = scanner.nextInt();
        System.out.println("Digite o segundo numero");
        B = scanner.nextInt();

        int soma = A + B;
        int subtracao = A - B;
        int multiplicacao = A * B;
        int divisao = A / B;

        System.out.printf("soma: %d \n", soma);
        System.out.printf("subtracao: %d \n", subtracao);
        System.out.printf("multiplicacao: %d \n", multiplicacao);
        System.out.printf("divisao: %d \n", divisao);

    }
}
