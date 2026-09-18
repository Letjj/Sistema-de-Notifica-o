package padroesestruturais.bridge;

public class CanalSMS implements CanalEnvio {
    @Override
    public String enviarMensagem(String mensagem) {
        return "[SMS] Celular recebeu: " + mensagem;
    }
}
