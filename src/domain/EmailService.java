// Canal de notificación por correo electrónico.
public class EmailService implements Mensajeria {
    public void enviar(String mensaje) {
        System.out.println("[EMAIL] Enviando: " + mensaje);
    }
}