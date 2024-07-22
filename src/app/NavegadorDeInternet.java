package app;

import entities.internet.Navegador;

public class NavegadorDeInternet {
    public static void main(String[] args) {
        Navegador navegador = new Navegador();
        navegador.exibirPagina("www.exemplo.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
        navegador.fecharAba();
    }



}
