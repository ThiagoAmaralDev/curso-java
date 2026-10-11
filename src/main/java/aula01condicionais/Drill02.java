package aula01condicionais;

import java.util.Scanner;

public class Drill02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tipoPlano = entrada.nextInt();
        boolean querSauna = entrada.nextBoolean();
        boolean querPersonal = entrada.nextBoolean();
        double valorPlano = 0;
        double valorPlanoFinal = 0;

        if(tipoPlano == 1) {
            valorPlano = 100;
        } else if (tipoPlano == 2) {
            valorPlano = 160;
        } else {
            return;
            //tentei voltar mas n vai eu acho kk caso n seja nenhum dos 2.
        }
        valorPlanoFinal = valorPlano;

        if(querSauna == true) {
            valorPlanoFinal = valorPlanoFinal + 30;
        }

        if(querPersonal == true) {
            valorPlanoFinal = valorPlanoFinal + 80;
        }

        System.out.println("Valor final: "+valorPlanoFinal);
    }
}
