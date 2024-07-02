package org.example.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao, false));

    }
    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover = t;
                break;
            }
        }
        tarefaSet.remove(tarefaParaRemover);
    }
    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }
    public void contarTarefas(){
        int quantidadeTarefas = tarefaSet.size();
        System.out.println("A quantidade de tarefas é: " + quantidadeTarefas);
    }
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefaConcluida = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(t.isConcluida()){
                tarefaConcluida.add(t);
            }
        }
        return tarefaConcluida;
    }
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefaPendente = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(!t.isConcluida()){
                tarefaPendente.add(t);
            }
        }
        return tarefaPendente;

    }
    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
               t.setConcluida(true);
                break;
            }
        }
        System.out.println("Tarefa: " + descricao + " foi concluída!!");
    }
    public void marcarTarefaPendente(String descricao){
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
                break;
            }
        }
        System.out.println("Tarefa: " + descricao + " ainda está pendente!!");
    }
    public void limparListaTarefas(){
        Set<Tarefa> todasTarefas = tarefaSet;
        tarefaSet.removeAll(todasTarefas);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        listaTarefas.contarTarefas();

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
