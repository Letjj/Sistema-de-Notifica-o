package padroesestruturais.bridge;

public class CanalPush implements CanalEnvio {
    @Override
    public String enviarMensagem(String mensagem) {
        return "[PUSH] App notificou: " + mensagem;
    }
}
