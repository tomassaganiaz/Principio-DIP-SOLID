import java.util.ArrayList;
import java.util.List;

// Desafío opcional: envía una misma notificación por varios canales.
public class MultiMensajeria implements Mensajeria {
    private final List<Mensajeria> canales;

    public MultiMensajeria(List<Mensajeria> canales) {
        this.canales = new ArrayList<>(canales);
    }

    public void enviar(String mensaje) {
        for (Mensajeria canal : canales) {
            canal.enviar(mensaje); // delega en cada canal
        }
    }
}