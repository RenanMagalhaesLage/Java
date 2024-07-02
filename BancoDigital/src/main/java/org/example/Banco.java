package org.example;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;

    private List<Conta> contasList;

    public Banco(String nome){
        this.contasList = new ArrayList<>();
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void imprimirListaContas(){
        System.out.println("\033[34m" +  " +----------------------- Banco "+this.nome +" -----------------------+");
        System.out.println(contasList);
        System.out.println(" +----------------------------------------------------------------+" + "\033[0m");
    }

    public void adicionarConta(Conta conta){
        contasList.add(conta);
    }
}
