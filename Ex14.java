/*Exercício 14: Contagem de Vogais
Escreva um programa que conte o número de vogais em uma string fornecida pelo usuário.*/

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite uma string
        System.out.print("Digite uma frase ou palavra: ");
        String texto = scanner.nextLine();

        // Inicializa a contagem de vogais
        int contadorVogais = 0;

        // Converte o texto para minúsculas para simplificar a verificação
        texto = texto.toLowerCase();

        // Itera sobre cada caractere da string
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            // Verifica se o caractere é uma vogal
            if (caractere == 'a' || caractere == 'e' ||
                    caractere == 'i' || caractere == 'o' ||
                    caractere == 'u') {
                contadorVogais++;
            }
        }

        // Exibe o resultado
        System.out.println("O número de vogais na string é: " + contadorVogais);

        // Fecha o scanner
        scanner.close();
    }
}

