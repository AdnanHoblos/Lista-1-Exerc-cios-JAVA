/*Exercício 7: Métodos
Escreva um programa que contenha um método chamado soma que receba dois números inteiros como
parâmetros e retorne a soma deles.
Chame esse método a partir do método main e exiba o resultado.*/

public class Ex7 {


    public static int soma(int a, int b) { //FUNÇÃO PARA EXECUTAR A SOMA
        return a + b;
    }

    public static void main(String[] args) {  //MAIN

        int num1 = 10;
        int num2 = 20;

        // Chamada ao método soma e armazenamento do resultado
        int resultado = soma(num1, num2);

        // Exibição do resultado
        System.out.println("A soma de " + num1 + " e " + num2 + " é: " + resultado);
    }
}

