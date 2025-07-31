package org.example;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itens = new ArrayList<>();
    private double desconto = 0;

    public void adicionarItem(Item item) {
        if(item == null) {
            throw new IllegalArgumentException("Item não pode ser nulo");
        }
        itens.add(item);
    }

    //public void removerItem(){}

    //public void aplicarDesconto(){}

    public double calcularTotal(){
        double total = 0;
        for(Item item : itens){
            double subTotal = item.getPreco()*item.getQuantidade();
            total += subTotal;
        }
        return total;
    }

    public int quantidadeItens(){return itens.size();}

}
