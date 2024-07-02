package org.example;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /*

        Desafio: Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java.
        Para isso, vamos interpretar o seguinte cenário: “Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança),
        as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).

        */
        Banco banco = new Banco("BlueBanker");
        Cliente cliente1 = new Cliente(
                "Ana",
                "Silva",
                "Feminino",
                LocalDate.of(1990, 5, 15),
                "ana.silva@example.com",
                "(11) 98765-4321"
        );

        Cliente cliente2 = new Cliente(
                "Pedro",
                "Oliveira",
                "Masculino",
                LocalDate.of(1985, 8, 22),
                "pedro.oliveira@example.com",
                "(21) 12345-6789"
        );

        Cliente cliente3 = new Cliente(
                "Julia",
                "Costa",
                "Feminino",
                LocalDate.of(1992, 12, 1),
                "julia.costa@example.com",
                "(31) 23456-7890"
        );
        Cliente cliente4 = new Cliente(
                "Lucas",
                "Pereira",
                "Masculino",
                LocalDate.of(1993, 7, 30),
                "lucas.pereira@example.com",
                "(41) 34567-8901"
        );

        Conta corrente1 = new ContaCorrente(cliente1);
        Conta corrente2 = new ContaCorrente(cliente2);
        Conta poupanca1 = new ContaPoupanca(cliente3);
        Conta poupanca2 = new ContaPoupanca(cliente4);

        banco.adicionarConta(corrente1);
        banco.adicionarConta(corrente2);
        banco.adicionarConta(poupanca1);
        banco.adicionarConta(poupanca2);
        banco.imprimirListaContas();


        corrente1.depositar(100);
        corrente1.transferir(41, corrente2);
        poupanca1.sacar(87);

        corrente1.imprimirExtrato();
        corrente2.imprimirExtrato();
        poupanca2.imprimirExtrato();
    }
}