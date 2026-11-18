import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NotificacionServiceTest {

    static class FakeMensajeria implements Mensajeria {
        final List<String> enviados = new ArrayList<>();
        public void enviar(String mensaje) { enviados.add(mensaje); }
    }

    @Test
    void notificarDelegaEnLaAbstraccion() {
        FakeMensajeria fake = new FakeMensajeria();
        NotificacionService service = new NotificacionService(fake);
        service.notificar("hola");
        assertEquals(Arrays.asList("hola"), fake.enviados);
    }

    @Test
    void multiplesMensajes() {
        FakeMensajeria fake = new FakeMensajeria();
        NotificacionService service = new NotificacionService(fake);
        for (String m : new String[]{"a", "b", "c"}) service.notificar(m);
        assertEquals(Arrays.asList("a", "b", "c"), fake.enviados);
    }
}