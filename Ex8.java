/*Exercício 8: Entrada de Dados
Escreva um programa que leia o nome e a idade de uma pessoa a partir do teclado
e imprima uma mensagem no console com essas informações.*/

import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        String nome;

        System.out.println("Digite o seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Digite o seu idade: ");
        idade = scanner.nextInt();

        System.out.printf("O nome eh %s \n", nome);
        System.out.printf("A idade eh %d \n", idade);



    }
}
