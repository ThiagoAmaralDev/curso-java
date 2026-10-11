package aula02repeticao;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*

            Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
            segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
         */

        int nVezes = sc.nextInt();

        for(int i = 0 ; i < nVezes ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(b == 0) {
                System.out.println("Divisão impossível");
            } else {
                double divisao = (double) a / b;
                System.out.println(divisao);
            }
        }
        sc.close();
    }

}
