package padroesestruturais.bridge;

public abstract class Notificacao {
    protected CanalEnvio canal;

    protected Notificacao(CanalEnvio canal) {
        this.canal = canal;
    }

    public abstract String enviar(String mensagem);
}
