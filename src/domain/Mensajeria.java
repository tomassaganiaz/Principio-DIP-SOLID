// Abstracción (DIP): todo canal de notificación debe implementar este contrato.
public interface Mensajeria {
    // Envía un mensaje por el canal correspondiente.
    void enviar(String mensaje);
}