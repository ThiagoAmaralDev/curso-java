package aula03outrosTopicos;

public class Drill03 {

    public static void main(String[] args) {

        /*
        Dado: int statusServidor = 255;

        Dado: int mascaraErro = 128;

        Missão: Crie a variável String status que receba "ERRO" se (statusServidor & mascaraErro) != 0, e "OK" caso contrário.
         */

        int statusServidor = 255;
        int mascaraErro = 128;

        String status;

        if((statusServidor & mascaraErro) != 0) {
            status = "ERRO";
        } else {
            status = "OK";
        }
    }
}
