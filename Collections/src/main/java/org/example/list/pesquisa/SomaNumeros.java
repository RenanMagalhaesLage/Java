package org.example.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer numero:numeroList) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        if(!numeroList.isEmpty()){
            for (Integer numero :numeroList) {
                if(numero > maior){
                    maior = numero;
                }
            }
            return maior;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        if(!numeroList.isEmpty()){
            for (Integer numero :numeroList) {
                if(numero < menor){
                    menor = numero;
                }
            }
            return menor;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        for (Integer numero: numeroList) {
            System.out.println(numero + " ,");
        }
    }
}
