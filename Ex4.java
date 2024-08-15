/*Exercício 4: Estruturas Condicionais
Crie um programa que leia um número inteiro
do usuário e verifique se ele é par ou ímpar. Exiba uma mensagem correspondente no console.*/

import java.util.Scanner;
public class Ex4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int numero;
        int calculo;

        System.out.println("Digite um numero");
        numero = scanner.nextInt();

        if (numero % 2 == 0){ //aqui o (numero % 2 == 0) calcula o resto da divisão do numero dividido por 2.
            System.out.printf("o numero %d eh par: %d \n", numero);
        }else{
            System.out.printf("o numero %d eh impar: %d \n", numero);
        }

    }
}
