package org.example;

public abstract class Conta implements IConta{

    private static int AGENCIA_PADRAO = 66;
    private static int SEQUENCIAL = 1001;
    private int agencia;
    private int numero;
    private double saldo;

    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public void sacar(double valor) {
        if(saldo >= valor){
            this.saldo -= valor;
            //System.out.println("Saque realizado com sucesso!" );
        }else{
            System.out.println("\033[31m" + "ERRO: Saldo insuficiente na conta " + this.numero +"\n" + "\033[0m");
        }

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        //System.out.println("Deposito realizado com sucesso!" );
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(saldo >= valor){
            this.sacar(valor);
            contaDestino.depositar(valor);
            imprimirTransferencia( valor, contaDestino);
        }else{
            System.out.println("\033[31m" + "ERRO na Transferência: Saldo insuficiente na conta " + this.numero + "\033[0m");
        }
    }

    protected void imprimirTransferencia(double valor, Conta contaDestino){
        System.out.println("\033[32m" + " +------------ Transferência ------------+");
        System.out.println(" A conta " + this.numero + " realizou uma transferência no valor de R$"+valor+"\n" +
                " Conta de destino: "+contaDestino.numero);
        System.out.println(" +---------------------------------------+\n" + "\033[0m");
    }
    protected void imprimirInformacoes() {
        System.out.println(" Titular: "+ this.cliente.getNome() + " " + this.cliente.getSobrenome());
        System.out.printf(" Agencia: %d%n", this.getAgencia());
        System.out.printf(" Conta: %d%n", this.getNumero());
        System.out.printf(" Saldo: %.2f%n", this.getSaldo());
    }

    @Override
    public String toString() {
        return "\nConta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente.getNome() + " " + cliente.getSobrenome() +
                "}\n";
    }
}
