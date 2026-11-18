// Canal de notificación por SMS.
public class SMSService implements Mensajeria {
    public void enviar(String mensaje) {
        System.out.println("[SMS] Enviando: " + mensaje);
    }
}