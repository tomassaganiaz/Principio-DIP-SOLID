// Parte 1: NotificacionService acoplado a EmailService.
public class NotificacionService {
    private final EmailService emailService = new EmailService();

    public void notificar(String mensaje) {
        emailService.enviar(mensaje);
    }
}