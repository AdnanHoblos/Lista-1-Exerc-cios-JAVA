//Exercício 2: Variáveis e Tipos de Dados
//Crie um programa que declare variáveis de diferentes tipos (int, double, boolean, char)
// e as inicialize com valores apropriados. Em seguida, imprima esses valores no console.

public class Ex2 {
    public static void main(String[]args){
        int age = 32;
        double salary = 10000.00;
        boolean verdadeiro = true;
        char name = 'B';

        System.out.printf("age:%d \n", age);
        System.out.printf("salary:%.2f \n", salary);
        System.out.printf("verdadeiro:%b\n", verdadeiro);
        System.out.printf("name:%c \n", name);
    }
}
