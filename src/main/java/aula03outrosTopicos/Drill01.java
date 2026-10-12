package aula03outrosTopicos;

public class Drill01 {
    public static void main(String[] args) {

        /*
        Dado: int permissao = 12; (em binário 0000 1100)

        Dado: int bitAdmin = 4; (em binário 0000 0100)

        Missão: Crie a variável String eAdmin que receba "SIM" se o bit bitAdmin estiver ativo em permissao, e "NÃO" se não estiver.
         */

        int permissao = 12; //0000 1100
        int bitAdmin = 4; // 0000 0100

        int resultado = permissao & bitAdmin;

        String eAdmin;

        if(resultado != 0) {
            eAdmin = "SIM";
        } else {
            eAdmin = "NÃO";
        }

        System.out.println(eAdmin);
    }
}
