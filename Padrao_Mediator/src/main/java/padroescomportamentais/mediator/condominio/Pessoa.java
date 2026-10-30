package padroescomportamentais.mediator.condominio;

public class Pessoa {

    public String elogiarPortaria(String mensagem) {
        return AppCondominio.getInstancia().receberElogioPortaria(mensagem);
    }

    public String reclamarPortaria(String mensagem) {
        return AppCondominio.getInstancia().receberReclamacaoPortaria(mensagem);
    }

    public String sugerirPortaria(String mensagem) {
        return AppCondominio.getInstancia().receberSugestaoPortaria(mensagem);
    }
}