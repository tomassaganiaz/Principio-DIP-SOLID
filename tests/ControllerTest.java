import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ControllerTest {
    static class FakeMensajeria implements Mensajeria {
        final List<String> enviados = new ArrayList<>();
        public void enviar(String mensaje) { enviados.add(mensaje); }
    }

    @Test
    void controllerEnviaYPersiste() {
        FakeMensajeria fake = new FakeMensajeria();
        NotificacionService service = new NotificacionService(fake);
        NotificacionDAO dao = new NotificacionDAO();
        NotificacionController controller = new NotificacionController(service, dao);

        controller.enviar("msg", "Email");

        assertEquals(Arrays.asList("msg"), fake.enviados);
        assertEquals(1, dao.listar().size());
        assertEquals("Email", dao.listar().get(0).getCanal());
    }
}