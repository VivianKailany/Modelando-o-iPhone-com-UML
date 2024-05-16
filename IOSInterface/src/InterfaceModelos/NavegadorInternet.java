package InterfaceModelos;

public interface NavegadorInternet {
    void adicionarPagina(String nomePagina);
    void atualizarPagina(String nomePagina);
    void fecharPagina(String nomePagina);
    void exibirPagina(String url);
}
