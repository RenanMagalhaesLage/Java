package org.example;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {

    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFim = dataInicio.plusDays(45);
    private String nome;
    private String descricao;
    private Set<Devs> devsSet = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public Set<Devs> getDevsSet() {
        return devsSet;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp bootcamp)) return false;
        return Objects.equals(dataInicio, bootcamp.dataInicio) && Objects.equals(dataFim, bootcamp.dataFim) && Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(devsSet, bootcamp.devsSet) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataInicio, dataFim, nome, descricao, devsSet, conteudos);
    }

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    public void exibirParticipantes(){
        System.out.println("\033[97m" + "+------------- Participantes -------------+"
                + devsSet
                + "+-----------------------------------------+"

        );
    }

    @Override
    public String toString() {
        return "\033[36m" + "\"+------------- Bootcamp -------------+\n" +
                " nome='" + nome + '\'' +
                "\n descricao='" + descricao + '\'' +
                "\n dataInicio=" + dataInicio +
                "\n dataFim=" + dataFim +
                "\n\n Conteudos= \n" + conteudos + "\033[36m" + "\n+--------------------------------------+\n\n" +
                 "\033[0m";
    }
}
