/*Exercício 9: Calculadora Simples
Crie um programa que funcione como uma calculadora simples. Ele deve oferecer ao
usuário opções para somar, subtrair, multiplicar ou dividir dois números.
Use uma estrutura switch para selecionar a operação.*/

import java.util.Scanner;

public class Ex9{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);

        int soma, subtracao, multiplicacao, divisao;
        int opcao;
        int num1, num2;
        int escolha;

        do {

            System.out.println("Digite o primeiro numero: ");
            num1 = scanner.nextInt();
            System.out.println("Digite o segundo numero: ");
            num2 = scanner.nextInt();

            System.out.println("Agora digite o numero correspondente a operação que deseja realizar: \n 1-soma \n 2-subtracao \n 3-multiplicacao \n 4-divisao");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    soma = num1 + num2;
                    System.out.printf("a soma de %d e %d eh: %d \n", num1, num2, soma);
                    break;
                case 2:
                    subtracao = num1 - num2;
                    System.out.printf("a subtracao de %d e %d eh: %d \n", num1, num2, subtracao);
                    break;
                case 3:
                    multiplicacao = num1 * num2;
                    System.out.printf("a multiplicacao de %d e %d eh: %d \n", num1, num2, multiplicacao);
                    break;
                case 4:
                    divisao = num1 / num2;
                    System.out.printf("a divisao de %d e %d eh: %d \n", num1, num2, divisao);
                    break;
            }
            System.out.println("Deseja realizar nova operacao? 1 para sim, 2 para nao \n");
            escolha = scanner.nextInt();
        }
        while (escolha == 1);
        System.out.println("Fim do programa");
    }
}
