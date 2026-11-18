import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CanalesTest {

    private String capturar(Runnable accion) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(baos));
        try { accion.run(); } finally { System.setOut(original); }
        return baos.toString();
    }

    @Test
    void email() {
        String out = capturar(() -> new EmailService().enviar("ping"));
        assertTrue(out.contains("[EMAIL] Enviando: ping"));
    }

    @Test
    void whatsapp() {
        String out = capturar(() -> new WhatsAppService().enviar("ping"));
        assertTrue(out.contains("[WHATSAPP] Enviando: ping"));
    }

    @Test
    void sms() {
        String out = capturar(() -> new SMSService().enviar("ping"));
        assertTrue(out.contains("[SMS] Enviando: ping"));
    }

    @Test
    void push() {
        String out = capturar(() -> new PushService().enviar("ping"));
        assertTrue(out.contains("[PUSH] Enviando: ping"));
    }
}