package org.example.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos(){
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
    }
    public void exibirProdutos() {
        System.out.println(estoqueProdutoMap);
    }
    public void calcularValorTotalEstoque(){
        double totalEstoque = 0d;
        if(!estoqueProdutoMap.isEmpty()){
            for (Produto p : estoqueProdutoMap.values()) {
                totalEstoque += p.getPreco() * p.getQuantidade();
            }
            System.out.println("O valor total do estoque é de: " + totalEstoque);

        }else{
            System.out.println("O estoque está vazio !");
        }

    }
    public void obterProdutoMaisCaro(){
        double produtoMaisCaro = Double.MIN_VALUE;
        String nomeProdutoMaisCaro = "";
        if(!estoqueProdutoMap.isEmpty()){
            for (Produto p : estoqueProdutoMap.values()) {
                if(p.getPreco() > produtoMaisCaro){
                    produtoMaisCaro = p.getPreco();
                    nomeProdutoMaisCaro = p.getNome();
                }
            }
            System.out.println("O produto mais CARO do estoque é " + nomeProdutoMaisCaro + " no valor de R$"+produtoMaisCaro);
        }else{
            System.out.println("O estoque está vazio !");
        }
    }
    public void obterProdutoMaisBarato(){
        double produtoMaisBarato= Double.MAX_VALUE;
        String nomeProdutoMaisBarato = "";
        if(!estoqueProdutoMap.isEmpty()){
            for (Produto p : estoqueProdutoMap.values()) {
                if(p.getPreco() < produtoMaisBarato){
                    produtoMaisBarato = p.getPreco();
                    nomeProdutoMaisBarato = p.getNome();
                }
            }
            System.out.println("O produto mais BARATO do estoque é " + nomeProdutoMaisBarato + " no valor de R$"+produtoMaisBarato);
        }else{
            System.out.println("O estoque está vazio !");
        }
    }
    public void obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        double valorQuantPreco= 0d;
        String nomeProduto = "";
        if(!estoqueProdutoMap.isEmpty()){
            for (Produto p : estoqueProdutoMap.values()) {
                if((p.getQuantidade() * p.getPreco()) > valorQuantPreco){
                    valorQuantPreco = p.getQuantidade() * p.getPreco();
                    nomeProduto = p.getNome();
                }
            }
            System.out.println("O produto com maior valor total levando em consideração o estoque é " + nomeProduto + " no valor de R$"+valorQuantPreco);
        }else{
            System.out.println("O estoque está vazio !");
        }
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        estoque.exibirProdutos();

        estoque.calcularValorTotalEstoque();

        estoque.obterProdutoMaisCaro();

        estoque.obterProdutoMaisBarato();

       estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
    }
}
