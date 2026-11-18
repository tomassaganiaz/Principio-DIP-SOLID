1. ¿Qué establece el principio DIP de SOLID?

El Principio de Inversión de Dependencias (DIP) establece que:

Los módulos de alto nivel no deben depender de módulos de bajo nivel.
Ambos deben depender de abstracciones (interfaces o clases abstractas).
Las abstracciones no deben depender de los detalles.
Los detalles deben depender de las abstracciones.

En otras palabras, el código debe apoyarse en contratos (interfaces) y no en implementaciones concretas.

2. ¿Qué diferencia existe entre depender de una clase concreta y depender de una interfaz?

Depender de una clase concreta:

El código queda fuertemente acoplado a una implementación específica.
Cambiar la implementación requiere modificar otras clases.
Reduce la flexibilidad y la reutilización.

Depender de una interfaz:

El código solo conoce el comportamiento esperado.
Se pueden intercambiar implementaciones sin modificar las clases consumidoras.
Favorece la extensibilidad, el mantenimiento y las pruebas.

3. ¿Qué es la inyección de dependencias?

La inyección de dependencias es una técnica donde las dependencias que una clase necesita son proporcionadas desde el exterior en lugar de ser creadas por la propia clase.

4. ¿Qué ventajas tiene utilizar inyección por constructor?

La inyección por constructor ofrece varias ventajas:

Garantiza que la dependencia exista al crear el objeto.
Hace explícitas las dependencias de la clase.
Facilita las pruebas unitarias usando objetos simulados (mocks).
Favorece la inmutabilidad de las dependencias.
Reduce la posibilidad de errores por referencias nulas.

5. ¿Por qué el diseño desarrollado facilita agregar nuevas funcionalidades?

Porque al depender de interfaces en lugar de implementaciones concretas:

Se pueden añadir nuevas clases que implementen la misma interfaz.
No es necesario modificar el código ya existente.
Las nuevas funcionalidades pueden integrarse simplemente creando nuevas implementaciones y configurándolas como dependencia.

6. ¿Qué relación existe entre DIP y el principio Open/Closed (OCP)?

El Principio Abierto/Cerrado (OCP) establece que las clases deben estar:

Abiertas para la extensión.
Cerradas para la modificación.

El DIP ayuda a cumplir el OCP porque, al depender de abstracciones, es posible incorporar nuevas implementaciones sin modificar el código que las utiliza.