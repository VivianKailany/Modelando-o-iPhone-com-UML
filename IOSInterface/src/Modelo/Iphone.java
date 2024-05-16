package Modelo;

import InterfaceModelos.AparelhoTelefonico;
import InterfaceModelos.NavegadorInternet;
import InterfaceModelos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        // Exemplo de uso dos métodos da interface ReprodutorMusical
        iphone.reproduzirMusica("Nome da Música");
        iphone.pausarMusica();
        iphone.selecionarMusica("Outra Música");
        iphone.avancarMusica();
        iphone.retrocederMusica();

        // Exemplo de uso dos métodos da interface NavegadorInternet
        iphone.adicionarPagina("www.example.com");
        iphone.atualizarPagina("www.example.com");
        iphone.fecharPagina("www.example.com");
        iphone.exibirPagina("www.example.com");

        // Exemplo de uso dos métodos da interface AparelhoTelefonico
        iphone.receberLigacao(123456789);
        iphone.fazerLigacao(987654321);
        iphone.encerrarLigacao(123456789);
        iphone.salvarContato("João", 987654321);
        iphone.deletarContato("João");
        iphone.buscarContato("João");
        iphone.iniciarCorreio();

    }
    public void reproduzirMusica(String nomeMusica) {
        System.out.println("Reproduzindo música: " + nomeMusica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("Selecionando música: " + nomeMusica);
    }

    @Override
    public void avancarMusica() {
        System.out.println("Avançando para a próxima música");
    }

    @Override
    public void retrocederMusica() {
        System.out.println("Retrocedendo para a música anterior");
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void adicionarPagina(String nomePagina) {
        System.out.println("Adicionando página: " + nomePagina);
    }

    @Override
    public void atualizarPagina(String nomePagina) {
        System.out.println("Atualizando página " + nomePagina);
    }

    @Override
    public void fecharPagina(String nomePagina) {
        System.out.println("Fechando página: " + nomePagina);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    // Métodos da interface AparelhoTelefonico
    @Override
    public void receberLigacao(int numeroTelefone) {
        System.out.println("Recebendo ligação do número: " + numeroTelefone);
    }

    @Override
    public void fazerLigacao(int numeroTelefone) {
        System.out.println("Fazendo ligação para o número: " + numeroTelefone);
    }

    @Override
    public void encerrarLigacao(int numeroTelefone) {
        System.out.println("Encerrando ligação com o número: " + numeroTelefone);
    }

    @Override
    public void salvarContato(String nomeTelefone, int numeroTelefone) {
        System.out.println("Salvando contato: " + nomeTelefone + " - " + numeroTelefone);
    }

    @Override
    public void deletarContato(String nomeTelefone) {
        System.out.println("Deletando contato: " + nomeTelefone);
    }

    @Override
    public void buscarContato(String nomeTelefone) {
        System.out.println("Buscando contato: " + nomeTelefone);
    }

    @Override
    public void iniciarCorreio() {
        System.out.println("Iniciando correio de voz");
    }
}