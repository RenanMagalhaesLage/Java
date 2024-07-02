package org.example;

public class Atividades extends Conteudo{
    private int cargaHoraria;

    public Atividades(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public double calcularXP(){
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "\n"+ "\033[35m" +"Atividade: { " +
                super.toString() +
                " cargaHoraria=" + cargaHoraria +
                " }" + "\033[0m";
    }
}
