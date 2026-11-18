// Clase de alto nivel: depende de la abstracción Mensajeria (DIP).
public class NotificacionService {
    private final Mensajeria mensajeria; // inyectada por constructor

    public NotificacionService(Mensajeria mensajeria) {
        this.mensajeria = mensajeria;
    }

    public void notificar(String mensaje) {
        mensajeria.enviar(mensaje); // delega en el canal
    }
}