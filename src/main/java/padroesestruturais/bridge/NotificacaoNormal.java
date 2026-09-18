package padroesestruturais.bridge;

public class NotificacaoNormal extends Notificacao {
    public NotificacaoNormal(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public String enviar(String mensagem) {
        return canal.enviarMensagem("ℹ️ Info: " + mensagem);
    }
}
