// src/test/java/padroesestruturais/bridge/NotificacaoTest.java
package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotificacaoTest {

    @Test
    public void testarNotificacaoUrgentePorEmail() {
        CanalEnvio canal = new CanalEmail();
        Notificacao notificacao = new NotificacaoUrgente(canal);

        String resultado = notificacao.enviar("Erro no banco de dados");

        assertTrue(resultado.contains("🚨 URGENTE"));
        assertTrue(resultado.contains("[E-MAIL]"));
        assertTrue(resultado.contains("Erro no banco de dados"));
    }

    @Test
    public void testarNotificacaoNormalPorSMS() {
        CanalEnvio canal = new CanalSMS();
        Notificacao notificacao = new NotificacaoNormal(canal);

        String resultado = notificacao.enviar("Boas-vindas ao sistema");

        assertTrue(resultado.contains("ℹ️ Info"));
        assertTrue(resultado.contains("[SMS]"));
        assertTrue(resultado.contains("Boas-vindas ao sistema"));
    }

    @Test
    public void testarIndependenciaDasDimensoes() {
        // Prova que podemos trocar o canal sem mudar a classe de notificação
        CanalEnvio canalPush = new CanalPush();
        Notificacao notificacao = new NotificacaoUrgente(canalPush);

        String resultado = notificacao.enviar("Teste de flexibilidade");

        assertTrue(resultado.contains("[PUSH]")); // Prova que usou o canal novo
        assertTrue(resultado.contains("🚨 URGENTE")); // Prova que manteve a abstração
    }
}
