// Canal de notificación por WhatsApp.
public class WhatsAppService implements Mensajeria {
    public void enviar(String mensaje) {
        System.out.println("[WHATSAPP] Enviando: " + mensaje);
    }
}