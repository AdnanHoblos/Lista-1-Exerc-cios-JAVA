/*Exercício 16: Conversor de Temperatura
Desenvolva um programa que converta temperaturas entre Celsius e Fahrenheit.
O usuário deve escolher qual conversão deseja realizar e inserir o valor da temperatura a ser convertida.*/

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe as opções de conversão para o usuário
        System.out.println("Escolha a conversão desejada:");
        System.out.println("1: Celsius para Fahrenheit");
        System.out.println("2: Fahrenheit para Celsius");

        // Lê a escolha do usuário
        int escolha = scanner.nextInt();

        // Lê o valor da temperatura a ser convertida
        System.out.print("Digite o valor da temperatura: ");
        double temperatura = scanner.nextDouble();
        double temperaturaConvertida;

        // Verifica a escolha do usuário e realiza a conversão
        if (escolha == 1) {
            // Converte de Celsius para Fahrenheit
            temperaturaConvertida = (temperatura * 9/5) + 32;
            System.out.println(temperatura + "°C é igual a " + temperaturaConvertida + "°F");
        } else if (escolha == 2) {
            // Converte de Fahrenheit para Celsius
            temperaturaConvertida = (temperatura - 32) * 5/9;
            System.out.println(temperatura + "°F é igual a " + temperaturaConvertida + "°C");
        } else {
            // Opção inválida
            System.out.println("Opção inválida! Por favor, escolha 1 ou 2.");
        }

        // Fecha o scanner
        scanner.close();
    }
}

