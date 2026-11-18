import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DaoTest {
    @Test
    void guardarYListar() {
        NotificacionDAO dao = new NotificacionDAO();
        dao.guardar("Email", "hola");
        assertEquals(1, dao.listar().size());
        assertEquals("Email", dao.listar().get(0).getCanal());
        assertEquals("hola", dao.listar().get(0).getMensaje());
    }

    @Test
    void limpiar() {
        NotificacionDAO dao = new NotificacionDAO();
        dao.guardar("SMS", "x");
        dao.limpiar();
        assertTrue(dao.listar().isEmpty());
    }
}