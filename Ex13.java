/*Exercício 13: Jogo de Adivinhação
Desenvolva um jogo de adivinhação onde o computador escolhe um número aleatório
entre 1 e 100, e o usuário deve adivinhar qual é o número. O programa deve fornecer
dicas ao usuário se o palpite for muito alto ou muito baixo e contar o número de tentativas até o acerto.*/

import java.util.Random;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        // Cria um objeto Random para gerar um número aleatório
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Gera um número entre 1 e 100

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        int palpite = 0;
        int tentativas = 0;

        // Loop até o usuário acertar o número
        while (palpite != numeroAleatorio) {
            System.out.print("Adivinhe um número entre 1 e 100: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }
        }

        // Fecha o scanner
        scanner.close();
    }
}

