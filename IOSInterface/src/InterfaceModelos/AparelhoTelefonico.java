package InterfaceModelos;

public interface AparelhoTelefonico {
    void receberLigacao(int numeroTelefone);
    void fazerLigacao(int numeroTelefone);
    void encerrarLigacao(int numeroTelefone);
    void salvarContato(String nomeTelefone, int numeroTelefone);
    void deletarContato(String nomeTelefone);
    void buscarContato(String nomeTelefone);
    void iniciarCorreio();
}
