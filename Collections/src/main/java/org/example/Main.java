package org.example;
import org.example.list.operacoesBasicas.ListaTarefas;
import org.example.list.operacoesBasicas.CarrinhoDeCompras;
import org.example.list.ordenacao.OrdenacaoPessoas;
import org.example.list.pesquisa.CatalogoLivros;
import org.example.list.pesquisa.SomaNumeros;


public class Main {
    public static void main(String[] args) {
        /* ================= LISTA DE TAREFAS ================= */
        ListaTarefas listaTarefa = new ListaTarefas();
        System.out.println("O número total de elementos na lista é: "+listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é: "+listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: "+listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

        /* ================= CARRINHO DE COMPRAS ================= */
        System.out.println("\n\n=================== CARRINHO DE COMPRAS ==============");
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Banana", 3.74, 2);
        carrinho.adicionarItem("Leite", 4.79, 3);
        carrinho.adicionarItem("Pão", 1.02, 5);
        carrinho.adicionarItem("Chocolate", 6.78, 1);
        carrinho.exibirItens();
        System.out.println("Valor Total da compra: "+ carrinho.calcularValorTotal());
        carrinho.removerItem("Chocolate");
        carrinho.exibirItens();

        /* ================= CATÁLOGO DE LIVROS ================= */
        System.out.println("\n\n=================== CATÁLOGO DE LIVROS ==============");
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Diário de um Banana", "João Martins", 2012);
        catalogoLivros.adicionarLivro("Guerra dos tronos", "Brian Cersei", 2011);
        catalogoLivros.adicionarLivro("Arquitetura de Computadores", "Elision Braga", 2008);
        catalogoLivros.adicionarLivro("HTML", "Mary Stuards", 2017);
        catalogoLivros.adicionarLivro("Lady Love", "Joanne Neris", 2015);
        catalogoLivros.adicionarLivro("Lady Hate", "Joanne Neris", 2015);
        catalogoLivros.adicionarLivro("HTML", "Perri Katlord", 2022);

        System.out.println(catalogoLivros.pesquisarPorAutor("Joanne Neris"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000, 2012));
        System.out.println(catalogoLivros.pesquisarPorTitulo("HTML"));

        /* ================= SOMA NÚMEROS ================= */
        System.out.println("\n\n=================== SOMA NÚMEROS ==============");
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(78);
        somaNumeros.adicionarNumero(96);
        somaNumeros.adicionarNumero(41);
        somaNumeros.adicionarNumero(25);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(114);
        somaNumeros.adicionarNumero(2020);
        somaNumeros.exibirNumeros();
        System.out.println("Soma: "+somaNumeros.calcularSoma());
        System.out.println("Maior: "+somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor: "+somaNumeros.encontrarMenorNumero());
        somaNumeros.adicionarNumero(-1);
        somaNumeros.adicionarNumero(-123);
        System.out.println("Menor: "+somaNumeros.encontrarMenorNumero());


        /* ================= ORDENAÇÕES DE PESSOAS ================= */
        System.out.println("\n\n=================== ORDENAÇÕES DE PESSOAS ==============");
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("João", 20, 1.64);
        ordenacaoPessoas.adicionarPessoa("Maria", 28, 1.64);
        ordenacaoPessoas.adicionarPessoa("Bruno", 13, 1.45);
        ordenacaoPessoas.adicionarPessoa("Marcos", 41, 1.78);
        ordenacaoPessoas.adicionarPessoa("Joanne", 34, 1.69);
        ordenacaoPessoas.adicionarPessoa("Laury", 19, 1.58);
        ordenacaoPessoas.adicionarPessoa("Vânia", 26, 1.84);
        ordenacaoPessoas.adicionarPessoa("Tierlly", 53, 1.87);

        System.out.println("Idade ordenada: \n" + ordenacaoPessoas.ordenarPorIdade());
        System.out.println("Altura ordenada: \n"+ ordenacaoPessoas.ordenarPorAltura());


    }
}