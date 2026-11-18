// Canal de notificación push.
public class PushService implements Mensajeria {
    public void enviar(String mensaje) {
        System.out.println("[PUSH] Enviando: " + mensaje);
    }
}