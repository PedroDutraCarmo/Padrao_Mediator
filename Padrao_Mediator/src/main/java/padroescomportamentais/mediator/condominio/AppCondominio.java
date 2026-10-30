package padroescomportamentais.mediator.condominio;

public class AppCondominio {

    private static AppCondominio instancia = new AppCondominio();

    private AppCondominio() {}

    public static AppCondominio getInstancia() {
        return instancia;
    }

    public String receberElogioPortaria(String mensagem) {
        return "O App do Condomínio registrou seu chamado.\n"+
                "A Portaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Portaria.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoPortaria(String mensagem) {
        return "O App do Condomínio registrou seu chamado.\n"+
                "A Portaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Portaria.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoPortaria(String mensagem) {
        return "O App do Condomínio registrou seu chamado.\n"+
                "A Portaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Portaria.getInstancia().receberSugestao(mensagem);
    }
}