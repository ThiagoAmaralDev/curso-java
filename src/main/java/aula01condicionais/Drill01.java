package aula01condicionais;
import java.util.Scanner;

public class Drill01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade = entrada.nextInt();
        boolean vip = entrada.nextBoolean();
        double preco = 0;
        double valorFinal = 0;

        if(idade < 12) {
            preco = 15;
        } else if (idade >= 12 && idade < 60 ) {
            preco = 30;
        } else {
            preco = 20;
        }

        valorFinal = preco;

        if(vip == true) {
            valorFinal = valorFinal + 15;
        } else {
            valorFinal = valorFinal;
        }

        System.out.println("Valor do ingresso: R$ "+valorFinal);

    }

}
