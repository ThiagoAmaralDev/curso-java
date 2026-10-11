package aula02repeticao;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Escreva um programa em Java que leia um valor inteiro correspondente a uma nota (de 0 a 10). Se o valor digitado for inválido (menor que 0 ou maior que 10), o programa deve exibir "Nota Invalida. Digite novamente:" e continuar lendo até que uma nota válida seja informada. Quando for válida, imprima "Nota registrada com sucesso!".
         */

        System.out.println("Insira uma nota (de 0 a 10): ");
        int nota = sc.nextInt();

        while(nota < 0 || nota > 10) {
            System.out.println("Nota Invalida. Digite novamente:");
            nota = sc.nextInt();
        }
        System.out.println("Nota registrada com sucesso!");

    }
}
