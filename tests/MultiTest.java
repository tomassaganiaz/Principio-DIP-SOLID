import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiTest {
    static class FakeCanal implements Mensajeria {
        final List<String> enviados = new ArrayList<>();
        public void enviar(String mensaje) { enviados.add(mensaje); }
    }

    @Test
    void multiEnviaATodosLosCanales() {
        FakeCanal c1 = new FakeCanal();
        FakeCanal c2 = new FakeCanal();
        MultiMensajeria multi = new MultiMensajeria(Arrays.asList(c1, c2));

        multi.enviar("broadcast");

        assertEquals(Arrays.asList("broadcast"), c1.enviados);
        assertEquals(Arrays.asList("broadcast"), c2.enviados);
    }
}