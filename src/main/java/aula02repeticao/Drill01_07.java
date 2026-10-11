package aula02repeticao;

import java.util.Scanner;

public class Drill01_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Escreva um programa simples que:Leia um número inteiro $N$ (quantidade de repetições).Use um laço for que rode $N$ vezes.Dentro do laço, leia dois números inteiros (a e b).Se b for igual a 0, imprima "divisao impossivel".Caso contrário, imprima o resultado da divisão de a por b convertido para double (ex: (double) a / b).(Dica de tipo: utilize double para o resultado da divisão sair com casas decimais, por exemplo 5 / 2 = 2.5).
         */

        int numeroRepeticoes = sc.nextInt();

        for(int i = 0 ; i < numeroRepeticoes ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(b == 0) {
                System.out.println("Divisão impossível");
            } else {
                double resultado = (double) a / b;
            }
        }
    }
}
