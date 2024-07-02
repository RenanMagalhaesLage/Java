package org.example;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Devs {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsSet().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo =  this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteúdo!!");
        }

    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }

    public double calcularTotalXP(){
        return this.conteudoConcluidos.stream().mapToDouble(Conteudo::calcularXP).sum();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "\033[31m" +"{" +
                "nome='" + nome + '\'' +
                ", conteudosInscritos=" + conteudosInscritos +
                ", conteudoConcluidos=" + conteudoConcluidos +
                '}' + "\033[0m";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Devs devs)) return false;
        return Objects.equals(getNome(), devs.getNome()) && Objects.equals(conteudosInscritos, devs.conteudosInscritos) && Objects.equals(conteudoConcluidos, devs.conteudoConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), conteudosInscritos, conteudoConcluidos);
    }
}
