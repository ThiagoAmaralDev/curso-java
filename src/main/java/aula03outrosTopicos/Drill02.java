package aula03outrosTopicos;

public class Drill02 {
    public static void main(String[] args) {

        /*
        Dado: int perfilUsuario = 8; (em binário 0000 1000)

        Dado: int bitVIP = 2; (em binário 0000 0010)

        Missão: Crie a variável String eVIP que receba "ACESSO_LIBERADO" se o bit bitVIP estiver ativo, e "ACESSO_NEGADO" caso contrário.
         */

        int perfilUsuario = 8; // 0000 1000
        int bitVIP = 2; // 0000 0010

        int resultado = perfilUsuario & bitVIP;

        String eVIP;

        if(resultado != 0) {
            eVIP = "ACESSO_LIBERADO";

        } else {
            eVIP = "ACESSO_NEGADO";
        }

        System.out.println(eVIP);
    }
}


