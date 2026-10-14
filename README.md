# Práctica 7: Sistema de Monitoreo de Hardware Distribuido (SMHD)

Proyecto en Java que implementa la lógica de un sistema de monitoreo de sensores utilizando los principios de Programación Orientada a Objetos: **Herencia**, **Clases Abstractas** y **Polimorfismo**.

##  Estructura del Proyecto

- **`DispositivoElectronico.java`**: Clase base con la información general del dispositivo (`modelo`, `fabricante`, `consumoEnergia`) y métodos de control (`encender()`, `apagar()`).
- **`Sensor.java`**: Clase abstracta que hereda de `DispositivoElectronico`. Define el método abstracto `leerValor()` y el comportamiento de calibración.
- **`SensorTemperatura.java`**: Subclase para medir temperatura en °C (rango de 20.0 a 35.0).
- **`SensorPresion.java`**: Subclase para medir presión atmosférica en hPa (rango de 900.0 a 1100.0).
- **`SensorAceleracion.java`**: Subclase para medir aceleración en 3 ejes (X, Y, Z) y calcular la magnitud del vector.
- **`SistemaMonitoreo.java`**: Clase principal (`main`) que almacena los sensores en un `ArrayList<Sensor>` y demuestra el polimorfismo.
- **`SistemaMonitoreoTest.java`**: Pruebas unitarias con JUnit 5 para validar el funcionamiento del sistema.

##  Cómo ejecutar

1. Clona o abre el proyecto en tu IDE (IntelliJ IDEA, Eclipse, VS Code).
2. Ejecuta la clase `SistemaMonitoreo.java` para ver la salida en consola.
3. Para correr las pruebas unitarias, ejecuta la clase `SistemaMonitoreoTest.java`.

##  Autor

- **Cristian Ivan Martinez Ruiz**