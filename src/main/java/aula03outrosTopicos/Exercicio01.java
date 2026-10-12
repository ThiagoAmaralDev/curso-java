package aula03outrosTopicos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        /*
         * DESAFIO PRÁTICO: Processamento e Validação de Payload de Integração Legada
         *
         * Descrição:
         * Este programa simula o processamento de dados brutos provenientes de um sistema
         * legado (integração via arquivo batch/payload em String). O objetivo é realizar a
         * higienização, extração, conversão e aplicação de regras de negócio sobre os dados.
         *
         * Tópicos e Conceitos Aplicados:
         * - Manipulação de Strings (trim, split, substring, toUpperCase)
         * - Operadores Bitwise (máscara de bits para verificação de permissões/flags)
         * - Funções e Modularização (sintaxe, passagem de parâmetros e organização)
         * - Convenções de código e boas práticas
         *
         * Contexto da Regra de Negócio:
         * Recebe-se uma String no formato: "  TX_98412;152;  jose da silva  ;5400.50;ATIVO   "
         * 1. Limpar espaços excedentes e separar os campos delimitação por ';'.
         * 2. Extrair o ID numérico da transação ignorando o prefixo "TX_".
         * 3. Normalizar o nome do cliente em letras maiúsculas e sem espaços nas extremidades.
         * 4. Avaliar o campo de flags usando operação bitwise (& 16) para verificar autorização.
         * 5. Exibir os dados processados e estruturados no console.
         */

        Scanner sc = new Scanner(System.in);

        String payload = "   TX_98412;10011000;  jose da silva  ;5400.50;ATIVO   ";

        String payloadSemEspaco = payload.trim(); //TX_98412;10011000;  jose da silva  ;5400.50;ATIVO
        String[] payloadDivisor = payloadSemEspaco.split(";"); // TX_98412 (0) ;10011000 (1) ; (2) jose da silva  ; (3) 5400.50; (4) ATIVO

        String codigoTransacao = payloadDivisor[0].substring(3);
        String nomeCliente = payloadDivisor[2].trim().toUpperCase();
        String valor = payloadDivisor[3].trim();
        String status = payloadDivisor[4].trim().toUpperCase();

        int flags = 152; // 10011000 B = 152 D
        int mascara = 16;

        System.out.println("=== DADOS PROCESSADOS ===");
        System.out.println("ID Transação: " + codigoTransacao);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Status: " + status);

        if((flags & mascara) != 0) {
            System.out.println("Autorização prévia: SIM");
        } else {
            System.out.println("Autorização prévia: NAO");
        }





    }
}
