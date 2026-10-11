package aula01condicionais;

import java.util.Scanner;

public class Drill03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== SIMULADOR DE COMPRA DE SMARTPHONE ===");
        System.out.println("Selecione o modelo desejado:");
        System.out.println("1 - Standard (R$ 2000,00)");
        System.out.println("2 - Pro (R$ 3500,00)");
        System.out.print("Digite a opção (1 ou 2): ");

        int modelo = entrada.nextInt();
        double valorBase = 0;

        // Processamento do Modelo
        if (modelo == 1) {
            valorBase = 2000.00;
            System.out.println("-> Modelo selecionado: Standard (Base: R$ 2000,00)");
        } else if (modelo == 2) {
            valorBase = 3500.00;
            System.out.println("-> Modelo selecionado: Pro (Base: R$ 3500,00)");
        } else {
            System.out.println("\n[ERRO] Modelo inválido. Operação cancelada.");
            entrada.close();
            return; // Encerra a execução do programa
        }

        double valorTotal = valorBase;

        // Pergunta sobre Garantia Estendida
        System.out.print("\nDeseja adicionar Garantia Estendida por R$ 300,00? (true/false): ");
        boolean garantiaExtendida = entrada.nextBoolean();

        if (garantiaExtendida) {
            valorTotal += 300.00;
            System.out.println("-> Garantia Adicionada: +R$ 300,00 | Subtotal: R$ " + valorTotal);
        } else {
            System.out.println("-> Sem garantia adicional | Subtotal: R$ " + valorTotal);
        }

        // Pergunta sobre Cupom de Desconto
        System.out.print("\nPossui cupom de 15% de desconto? (true/false): ");
        boolean cupomDesconto = entrada.nextBoolean();

        if (cupomDesconto) {
            double valorDesconto = valorTotal * 0.15;
            valorTotal = valorTotal * 0.85; // Aplica 15% de desconto
            System.out.println("-> Cupom Aplicado: -R$ " + valorDesconto + " (15%)");
        } else {
            System.out.println("-> Nenhum cupom aplicado.");
        }

        // Resumo Final da Operação
        System.out.println("\n========================================");
        System.out.printf("VALOR FINAL A PAGAR: R$ %.2f\n", valorTotal);
        System.out.println("========================================");

        entrada.close();
    }
}