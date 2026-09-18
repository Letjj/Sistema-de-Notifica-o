package padroesestruturais.bridge;

public class CanalEmail implements CanalEnvio {
    @Override
    public String enviarMensagem(String mensagem) {
        return "[E-MAIL] Destinatário recebeu: " + mensagem;
    }
}