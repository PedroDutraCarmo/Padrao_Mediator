package padroescomportamentais.mediator.condominio;

public interface SetorCondominio {
    String receberReclamacao(String mensagem);
    String receberElogio(String mensagem);
    String receberSugestao(String mensagem);
}