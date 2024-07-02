package org.example.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Júlia Mendes", 1456);
        agendaContatos.adicionarContato("Marcos Loures", 7896);
        agendaContatos.adicionarContato("Emanuelly", 7741);
        agendaContatos.adicionarContato("Mirian Costa", 1456);
        agendaContatos.adicionarContato("Jorge da Silva", 631);
        agendaContatos.adicionarContato("Jorge da Silva", 741);
        agendaContatos.exibirContatos();
        Set<Contato> pesquisa = agendaContatos.pesquisarPorNome("Marcos");
        System.out.println(pesquisa);
        pesquisa = agendaContatos.pesquisarPorNome("Jorge da Silva");
        System.out.println(pesquisa);
        agendaContatos.atualizarNumeroContato("Emanuelly", 4545);
        agendaContatos.exibirContatos();
    }
}
