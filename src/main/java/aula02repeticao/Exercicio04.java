package aula02repeticao;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
         */


        int quantidadeEscolhidaAlcool = 0;
        int quantidadeEscolhidaGasolina = 0;
        int quantidadeEscolhidaDiesel = 0;
        int tipo = 0;
        tipo = sc.nextInt();
        while(tipo != 4) {
            if(tipo == 1) {
                quantidadeEscolhidaAlcool++;
            } else if (tipo == 2) {
                quantidadeEscolhidaGasolina++;
            } else if (tipo == 3) {
                quantidadeEscolhidaDiesel++;
            }
            tipo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + quantidadeEscolhidaAlcool);
        System.out.println("Gasolina: " + quantidadeEscolhidaGasolina);
        System.out.println("Diesel: " + quantidadeEscolhidaDiesel);
    }



}
