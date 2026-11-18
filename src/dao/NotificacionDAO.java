import java.util.ArrayList;
import java.util.List;

// DAO en memoria para el historial de notificaciones.
public class NotificacionDAO {
    private final List<NotificacionRecord> registros = new ArrayList<>();

    public void guardar(String canal, String mensaje) {
        registros.add(new NotificacionRecord(canal, mensaje));
    }

    public List<NotificacionRecord> listar() {
        return new ArrayList<>(registros);
    }

    public void limpiar() {
        registros.clear();
    }
}