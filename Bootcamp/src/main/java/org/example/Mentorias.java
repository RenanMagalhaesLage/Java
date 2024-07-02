package org.example;

import java.time.LocalDate;

public class Mentorias extends Conteudo{
    private LocalDate data;

    public Mentorias(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }


    public LocalDate getData() {
        return data;
    }

    @Override
    public double calcularXP(){
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "\n" + "\033[33m" +"Mentorias{ " +
                super.toString() +
                " data=" + data +
                " }" + "\033[0m";
    }
}
