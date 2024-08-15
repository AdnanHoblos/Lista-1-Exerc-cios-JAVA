/*Exercício 6: Arrays
Crie um programa que declare um array de inteiros com 5 elementos,
inicialize-o com valores e imprima todos os valores do array no console.*/

public class Ex6 {
    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};
        int i;

        for (i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
    }
}