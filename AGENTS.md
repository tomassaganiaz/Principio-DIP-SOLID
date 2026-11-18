# AGENTS.md — Guía para agentes de código

## Contexto del proyecto
Sistema de notificaciones que aplica el principio DIP (SOLID). Lenguaje: **Java 8+**. Build: compilación directa con javac (KISS, sin frameworks). Arquitectura: KISS — carpeta `src/` y `tests/`.

## Reglas de arquitectura (KISS)
- `src/domain/`: abstracción `Mensajeria` e implementaciones de canales + `MultiMensajeria`.
- `src/services/`: `NotificacionService`.
- `src/controllers/`: `Main` (composition root).
- `src/dao/`: reservado (sin uso, KISS).
- `tests/`: tests unitarios con JUnit 5.
- Sin paquetes anidados (default package).

## Restricciones del trabajo práctico
- `NotificacionService` **no** puede contener `if`/`switch` ni instanciar concretos.
- La dependencia se inyecta por constructor y se declara `final`.
- Agregar un canal nuevo no puede modificar `NotificacionService`.
- Mínimo 4 canales: Email, WhatsApp, SMS, Push.

## Regla de comentarios (KISS)
- Cada comentario ocupa **una sola línea**.

## Comandos (KISS)
- Compilar: `javac -d target src/domain/*.java src/services/*.java src/dao/*.java src/controllers/*.java`
- Ejecutar demo: `java -cp target Main`
