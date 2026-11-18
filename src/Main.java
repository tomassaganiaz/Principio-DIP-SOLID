// Composition root (KISS): instancia los canales e inyecta cada uno.
public class Main {
    public static void main(String[] args) {
        NotificacionDAO dao = new NotificacionDAO(); // DAO para historial

        Mensajeria[] canales = { // los cuatro canales requeridos
            new EmailService(),
            new WhatsAppService(),
            new SMSService(),
            new PushService()
        };

        String[] nombres = {"Email", "WhatsApp", "SMS", "Push"};
        for (int i = 0; i < canales.length; i++) {
            NotificacionService service = new NotificacionService(canales[i]);
            NotificacionController controller = new NotificacionController(service, dao);
            controller.enviar("Hola desde " + nombres[i], nombres[i]);
        }

        // Desafío opcional: enviar por múltiples canales a la vez.
        java.util.List<Mensajeria> lista = new java.util.ArrayList<>();
        lista.add(new EmailService());
        lista.add(new SMSService());
        Mensajeria multi = new MultiMensajeria(lista);
        NotificacionService serviceMulti = new NotificacionService(multi);
        NotificacionController controllerMulti = new NotificacionController(serviceMulti, dao);
        controllerMulti.enviar("Notificación multi-canal", "Multi");
    }
}