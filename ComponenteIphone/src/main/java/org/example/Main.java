package org.example;


public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Testando ReprodutorMusical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Teenage Dream");

        // Testando AparelhoTelefonico
        iphone.ligar("40028922");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        iphone.exibirPagina("www.facebook.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}