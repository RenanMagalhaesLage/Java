package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ContaTerminal novaConta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        novaConta.setNumero(scanner.nextInt());

        System.out.println("Por favor, digite o nome da Agência !");
        novaConta.setAgencia(scanner.next());
        scanner.nextLine();
        System.out.println("Por favor, digite o nome do Cliente !");
        novaConta.setNomeCliente(scanner.nextLine());

        System.out.println("Por favor, digite o saldo da conta !");
        novaConta.setSaldo(scanner.nextDouble());
        scanner.close();
        System.out.println("Olá " + novaConta.getNomeCliente() +  ", obrigado por criar uma conta em nosso banco, sua agência é " + novaConta.getAgencia() + ", conta "+ novaConta.getNumero() + " e seu saldo " + novaConta.getSaldo() + " já está disponível para saque.");

    }
}