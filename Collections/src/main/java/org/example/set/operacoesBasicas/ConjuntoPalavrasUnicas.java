package org.example.set.operacoesBasicas;

import java.util.*;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoSet;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        conjuntoSet.add(palavra);
    }
    public void removerPalavra(String palavra){
        if (!conjuntoSet.isEmpty()) {
            if (conjuntoSet.contains(palavra)) {
                conjuntoSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }
    public boolean verificarPalavra(String palavra){
        for(String s : conjuntoSet){
            if(Objects.equals(s, palavra)){
                return true;
            }
        }
        return false;
    }
    public void exibirPalavrasUnicas(){
        if(!conjuntoSet.isEmpty()) {
            System.out.println(conjuntoSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();
        palavrasUnicas.adicionarPalavra("Primeira");
        palavrasUnicas.adicionarPalavra("Segunda");
        palavrasUnicas.adicionarPalavra("Terceira");
        palavrasUnicas.adicionarPalavra("Quarta");
        palavrasUnicas.exibirPalavrasUnicas();
        System.out.println(palavrasUnicas.verificarPalavra("Segunda"));
    }

}
