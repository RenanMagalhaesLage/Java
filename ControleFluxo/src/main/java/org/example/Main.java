package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Digite os números desejados para a quantidade de interações! ");
        System.out.println("Primeiro Número: ");
        Scanner scanner = new Scanner(System.in);
        int parametroUm = scanner.nextInt();
        System.out.println("Segundo Número: ");
        int parametroDois = scanner.nextInt();
        try{
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {

            System.out.println("Imprimindo o número " + i);
        }
    }
}