import java.time.LocalDateTime;

// Registro de una notificación enviada.
public class NotificacionRecord {
    private final String canal;
    private final String mensaje;
    private final LocalDateTime fecha;

    public NotificacionRecord(String canal, String mensaje) {
        this.canal = canal;
        this.mensaje = mensaje;
        this.fecha = LocalDateTime.now();
    }

    public String getCanal() { return canal; }
    public String getMensaje() { return mensaje; }
    public LocalDateTime getFecha() { return fecha; }
}