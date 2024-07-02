package org.example.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoCompras;

    public CarrinhoDeCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoCompras.add(new Item(nome, preco, quantidade));

    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!carrinhoCompras.isEmpty()) {
            for (Item i : carrinhoCompras) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            carrinhoCompras.removeAll(itensParaRemover);
            System.out.println(nome + " removido com sucesso!");
        } else {
            System.out.println("A lista está vazia!");
        }

    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!carrinhoCompras.isEmpty()){
            for (Item i: carrinhoCompras) {
                valorTotal += i.getQuantidade() * i.getPreco() ;
                return valorTotal;
            }
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
        return 0d;
    }

    public void exibirItens(){
        if(!carrinhoCompras.isEmpty()){
            System.out.println(carrinhoCompras);
        }else{
            System.out.println("A lista está vazia!");
        }

    }
}
