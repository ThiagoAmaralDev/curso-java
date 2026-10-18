package java.aula05construtores_encapsulamento;

public class Item {
    private String descricao;
    private double preco;

    public Item(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("ERRO! Valor negativo não é aceito.");
        }


    }


}
