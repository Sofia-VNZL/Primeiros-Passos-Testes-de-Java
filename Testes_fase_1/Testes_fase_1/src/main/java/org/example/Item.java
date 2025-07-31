package org.example;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        verificarPreco(preco);
        verificarQuantidade(quantidade);
        verificarPreco(preco);

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    private void verificarNome(String nome){
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo");
        }
    }

    private void verificarPreco(double preco){
        if(preco <= 0){
            throw new IllegalArgumentException("Não pode ter preço menor o igual a zero");
        }
    }

    private void verificarQuantidade(int quantidade){
        if(quantidade <= 0){
            throw new IllegalArgumentException("a quantidade deve ser um número inteiro positivo");
        }
    }

    public String getNome() {return nome;}
    public double getPreco() {return preco;}
    public int getQuantidade() {return quantidade;}
}
