package org.example.map.ordenacao;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrariaMap;

    public LivrariaOnline(){
        this.livrariaMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro obra){
        livrariaMap.put(link, obra);
    }
    public void removerLivro(String titulo){
        List<String> chavesRemover = new ArrayList<>();
        if(!livrariaMap.isEmpty()){
            for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
                if (entry.getValue().getNome().equalsIgnoreCase(titulo)) {
                    chavesRemover.add(entry.getKey());
                }
            }
            for (String chave : chavesRemover) {
                livrariaMap.remove(chave);
            }
        }else{
            System.out.println("A livraria não possui nenhum livro cadastrado");
        }
    }
    public void exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrariaMap.entrySet());

        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
        System.out.println(livrosOrdenadosPorPreco);
    }
    public void pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        if(!livrariaMap.isEmpty()){
            for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
                Livro livro = entry.getValue();
                if (livro.getAutor().equals(autor)) {
                    livrosPorAutor.put(entry.getKey(), livro);
                }
            }
            System.out.println(livrosPorAutor);
        }else{
            System.out.println("A livraria não possui nenhum livro cadastrado");
        }
    }
    public void exibirLivroMaisCaro(){
        double maisCaro = Double.MIN_VALUE;
        Livro livroCaro = null;
        if(!livrariaMap.isEmpty()){
            for(Livro l : livrariaMap.values()){
                if(l.getPreco() > maisCaro){
                    maisCaro = l.getPreco();
                    livroCaro = l;
                }
            }
            System.out.println("O livro mais CARO é: " + livroCaro.getNome() + " no valor de R$"+livroCaro.getPreco());
        }else{
            System.out.println("A livraria não possui nenhum livro cadastrado");
        }


    }
    public void exibirLivroMaisBarato(){
        double maisBarato= Double.MAX_VALUE;
        Livro livroBarato = null;
        if(!livrariaMap.isEmpty()){
            for(Livro l : livrariaMap.values()){
                if(l.getPreco() < maisBarato){
                    maisBarato = l.getPreco();
                    livroBarato = l;
                }
            }
            System.out.println("O livro mais BARATO é: " + livroBarato.getNome() + " no valor de R$"+livroBarato.getPreco());
        }else{
            System.out.println("A livraria não possui nenhum livro cadastrado");
        }
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        livrariaOnline.exibirLivrosOrdenadosPorPreco();

        livrariaOnline.pesquisarLivrosPorAutor("Josh Malerman");

        livrariaOnline.exibirLivroMaisCaro();

        livrariaOnline.exibirLivroMaisBarato();

        livrariaOnline.removerLivro("1984");
        System.out.println(livrariaOnline.livrariaMap);


    }



}
