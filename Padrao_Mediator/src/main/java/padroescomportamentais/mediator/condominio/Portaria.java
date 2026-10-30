package padroescomportamentais.mediator.condominio;

public class Portaria implements SetorCondominio {

    private static Portaria instancia = new Portaria();

    private Portaria() {}

    public static Portaria getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Portaria vai verificar a falha de segurança reportada: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A Portaria agradece o reconhecimento: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A Portaria anotou no livro de ocorrências a sugestão: " + mensagem;
    }
}