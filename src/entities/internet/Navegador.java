package entities.internet;

public class Navegador {
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página atual...");
    }

    public void fecharAba() {
        System.out.println("Fechando a aba atual...");
    }

}
