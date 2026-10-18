package java.aula05construtores_encapsulamento;

public class Teste {
    public static void main(String[] args) {
        Item item = new Item("Gelatina",50);

        //alterando preço

        item.setPreco(30);

        System.out.println("Item: "+ item.getDescricao());
        System.out.println("Preço: "+item.getPreco());
    }
}
