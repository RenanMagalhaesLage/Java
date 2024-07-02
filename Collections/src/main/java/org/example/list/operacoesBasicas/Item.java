package org.example.list.operacoesBasicas;

public class Item {
    private String Nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        Nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Item(String nome) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "\nITEM{" +
                "Nome='" + Nome + '\'' +
                ", Preco=" + preco +
                ", Quantidade=" + quantidade +
                "}\n";
    }
}
