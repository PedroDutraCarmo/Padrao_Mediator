package padroescomportamentais.mediator.condominio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoradorTest {

    @Test
    void deveElogiarPortaria() {
        Morador morador = new Morador();
        assertEquals("O App do Condomínio registrou seu chamado.\nA Portaria respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Portaria agradece o reconhecimento: Porteiro da noite foi muito educado",
                morador.elogiarPortaria("Porteiro da noite foi muito educado"));
    }

    @Test
    void deveReclamarPortaria() {
        Morador morador = new Morador();
        assertEquals("O App do Condomínio registrou seu chamado.\nA Portaria respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Portaria vai verificar a falha de segurança reportada: Portão da garagem quebrado",
                morador.reclamarPortaria("Portão da garagem quebrado"));
    }

    @Test
    void deveSugerirPortaria() {
        Morador morador = new Morador();
        assertEquals("O App do Condomínio registrou seu chamado.\nA Portaria respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Portaria anotou no livro de ocorrências a sugestão: Criar grupo de WhatsApp para encomendas",
                morador.sugerirPortaria("Criar grupo de WhatsApp para encomendas"));
    }
}