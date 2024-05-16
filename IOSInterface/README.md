
# Projeto Interface de iPhone

## Descrição

Este projeto implementa as funcionalidades básicas de um iPhone em Java usando interfaces, incluindo reprodução de música, navegação na internet e operações telefônicas.

## Funcionalidades

### Interface Reprodutor Musical
- **reproduzirMusica(nomeMusica):** Reproduz uma música específica.
- **pausarMusica():** Pausa a reprodução da música atual.
- **selecionarMusica(nomeMusica):** Seleciona uma música para reprodução.
- **avancarMusica():** Avança para a próxima música na lista de reprodução.
- **retrocederMusica():** Retrocede para a música anterior na lista de reprodução.

### Interface Navegador de Internet
- **adicionarPagina(url):** Adiciona uma nova página ao histórico de navegação.
- **atualizarPagina():** Atualiza a página atualmente exibida.
- **fecharPagina(url):** Fecha a página especificada.
- **exibirPagina(url):** Exibe a página especificada.

### Interface Aparelho Telefônico
- **receberLigacao(numeroTelefone):** Recebe uma ligação do número especificado.
- **fazerLigacao(numeroTelefone):** Realiza uma ligação para o número especificado.
- **encerrarLigacao(numeroTelefone):** Encerra uma ligação com o número especificado.
- **salvarContato(nomeTelefone, numeroTelefone):** Salva um contato com o nome e número especificados.
- **deletarContato(nomeTelefone):** Deleta o contato com o nome especificado.
- **buscarContato(nomeTelefone):** Busca pelo contato com o nome especificado.
- **iniciarCorreio():** Inicia o correio de voz.

## Utilização

Para utilizar este projeto, basta criar uma instância da classe `Iphone` e chamar os métodos correspondentes às funcionalidades desejadas.

```java
public class Main {
    public static void main(String[] args) {
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
}
```



## Saida no terminal 

- Reproduzindo música: Nome da Música
- Pausando música
- Selecionando música: Outra Música
- Avançando para a próxima música
- Retrocedendo para a música anterior
- Adicionando página: www.example.com
- Atualizando página www.example.com
- Fechando página: www.example.com
- Exibindo página: www.example.com
- Recebendo ligação do número: 123456789
- Fazendo ligação para o número: 987654321
- Encerrando ligação com o número: 123456789
- Salvando contato: João - 987654321
- Deletando contato: João
- Buscando contato: João
- Iniciando correio de voz


## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request com melhorias.
