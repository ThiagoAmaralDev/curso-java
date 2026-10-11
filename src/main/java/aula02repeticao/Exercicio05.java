package aula02repeticao;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*

        Exercício: Pesquisa de Satisfação do Cinema
        Um cinema deseja fazer uma rápida pesquisa de opinião sobre um filme recém-lançado. Escreva um algoritmo em Java para ler as escolherNota dadas pelos clientes, codificadas da seguinte forma:

        1 - Excelente

        2 - Bom

        3 - Ruim

        0 - Fim da Pesquisa

        Regras:

        Caso o usuário informe um código inválido (fora da faixa de 0 a 3), ele deve ser ignorado e o programa deve solicitar um novo código (o laço continua).

                O programa será encerrado apenas quando o código informado for 0.

        Ao encerrar, o programa deve exibir a mensagem "PESQUISA ENCERRADA" e a quantidade total de votos que cada categoria recebeu. */

        int escolherNota = 0;
        int notaExcelente = 0;
        int notaBom = 0;
        int notaRuim = 0;

        escolherNota = sc.nextInt();

        while(escolherNota != 0) {
            if(escolherNota == 1) {
                notaExcelente++;
            } else if (escolherNota == 2) {
                notaBom++;
            } else if (escolherNota == 3) {
                notaRuim++;
            }

            escolherNota = sc.nextInt();
        }

        System.out.println("PESQUISA ENCERRADA");
        System.out.println("Excelente: "+notaExcelente);
        System.out.println("Bom: "+notaBom);
        System.out.println("Ruim: "+notaRuim);

    }
}
