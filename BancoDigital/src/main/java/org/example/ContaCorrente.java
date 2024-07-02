package org.example;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\033[33m" + " +-------- Extrato Conta Corrente --------+");
        super.imprimirInformacoes();
        System.out.println(" +----------------------------------------+\n" + "\033[0m");
    }
}
