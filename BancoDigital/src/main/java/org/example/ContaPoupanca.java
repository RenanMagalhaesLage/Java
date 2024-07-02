package org.example;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\033[33m" + " +-------- Extrato Conta Poupança --------+");
        super.imprimirInformacoes();
        System.out.println(" +----------------------------------------+\n" + "\033[0m");
    }


}
