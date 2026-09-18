package padroesestruturais.bridge;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testando Notificações ---\n");


        CanalEnvio email = new CanalEmail();
        Notificacao alertaUrgente = new NotificacaoUrgente(email);
        System.out.println(alertaUrgente.enviar("Servidor fora do ar!"));


        CanalEnvio sms = new CanalSMS();
        Notificacao promoNormal = new NotificacaoNormal(sms);
        System.out.println(promoNormal.enviar("Sua fatura está disponível."));


        CanalEnvio push = new CanalPush();
        Notificacao alertaPush = new NotificacaoUrgente(push);
        System.out.println(alertaPush.enviar("Atualização de segurança necessária."));
    }
}
