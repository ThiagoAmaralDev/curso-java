package aula01condicionais;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double distancia = 0;
        double peso = 0;
        boolean vip = true;
        double frete = 0;
        double adicional = 0;
        double desconto = 0.10;
        double valorTotal = 0;

        System.out.println("Diga a distância: ");
        distancia = entrada.nextDouble();
        System.out.println("Diga o peso: ");
        peso = entrada.nextDouble();

        System.out.println("É vip? True ou false?");
        vip = entrada.nextBoolean();

       if(peso <= 5) {
           frete = 10;
       } else if (peso > 5 && peso <= 20) {
           frete = 25;
       } else {
           frete = 50;
       }

       if(distancia <= 100) {
           adicional = 0;
       } else if (distancia > 100 && distancia <= 500) {
           adicional = 15;
       } else {
           adicional = 30;
       }

       valorTotal = frete + adicional;

       if(vip) {
           valorTotal = valorTotal - (valorTotal * desconto);
       } else {
           valorTotal = valorTotal;
       }

        System.out.println("Valor do frete: "+valorTotal);

    }
}
