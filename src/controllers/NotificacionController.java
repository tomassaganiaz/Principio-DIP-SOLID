// Controller: orquesta el caso de uso (KISS).
public class NotificacionController {
    private final NotificacionService service;
    private final NotificacionDAO dao;

    public NotificacionController(NotificacionService service, NotificacionDAO dao) {
        this.service = service;
        this.dao = dao;
    }

    public void enviar(String mensaje, String canal) {
        service.notificar(mensaje); // delega en el servicio
        dao.guardar(canal, mensaje); // persiste en DAO
    }
}