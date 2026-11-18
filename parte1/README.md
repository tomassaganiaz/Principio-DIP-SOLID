# Parte 1 — Implementación inicial (anti-patrón)

## Preguntas y respuestas

- **¿Qué sucede si queremos enviar mensajes por WhatsApp?**
  No se puede sin modificar el código: `NotificacionService` está atado a `EmailService`.

- **¿Qué clase deberíamos modificar?**
  `NotificacionService` (y posiblemente el punto de entrada).

- **¿Qué problema presenta este diseño?**
  Alto acoplamiento: viola DIP y OCP, no es extensible sin modificar código existente y dificulta las pruebas.
