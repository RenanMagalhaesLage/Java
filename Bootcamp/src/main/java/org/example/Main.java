package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        Bootcamp bootcamp = new Bootcamp("Desbravando a linguagem JAVA", "Nesse bootcamp vamos conhecer os conceitos de programação usando a linguagem JAVA. Além disso, vamos aprender Orientação Objetos e MUITO MAIS!");
        Atividades atividade1 = new Atividades(
                "Introdução ao Java",
                "Aprenda os conceitos básicos da linguagem Java, incluindo tipos de dados, variáveis e operadores.",
                5
        );

        Atividades atividade2 = new Atividades(
                "Estruturas de Controle",
                "Explore estruturas de controle de fluxo em Java, como if, else, switch, for, while e do-while.",
                6
        );

        Atividades atividade3 = new Atividades(
                "Orientação a Objetos",
                "Entenda os princípios de Orientação a Objetos, incluindo classes, objetos, herança, polimorfismo e encapsulamento.",
                8
        );

        Atividades atividade4 = new Atividades(
                "Tratamento de Exceções",
                "Aprenda a tratar exceções em Java com try-catch, throw, throws e finally, e entenda a hierarquia das exceções.",
                4
        );

        Mentorias mentorias1 = new Mentorias(
                "Introdução ao Java",
                "Sessão de mentoria para introdução aos conceitos básicos de Java.",
                LocalDate.of(2024, 7, 15)
        );

        Mentorias mentorias2 = new Mentorias(
                "Desenvolvimento Web com Java",
                "Mentoria focada em desenvolvimento web com Java usando Spring Boot.",
                LocalDate.of(2024, 7, 20)
        );

        Mentorias mentorias3 = new Mentorias(
                "Java Avançado",
                "Discussão de tópicos avançados em Java, como concorrência e programação reativa.",
                LocalDate.of(2024, 7, 10)
        );

        Mentorias mentorias4 = new Mentorias(
                "Boas Práticas de Programação",
                "Sessão de mentoria sobre boas práticas de programação em Java.",
                LocalDate.of(2024, 7, 5)
        );

        bootcamp.getConteudos().add(atividade1);
        bootcamp.getConteudos().add(atividade2);
        bootcamp.getConteudos().add(atividade3);
        bootcamp.getConteudos().add(atividade4);

        bootcamp.getConteudos().add(mentorias1);
        bootcamp.getConteudos().add(mentorias2);
        bootcamp.getConteudos().add(mentorias3);
        bootcamp.getConteudos().add(mentorias4);

        System.out.println(bootcamp);

        Devs devCamila = new Devs();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("===================");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudoConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXP());

        System.out.println("+--------------------------------------+\n");

        Devs devJoao = new Devs();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("===================");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudoConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXP());



    }
}