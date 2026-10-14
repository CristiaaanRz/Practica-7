package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaMonitoreoTest {

    private SensorTemperatura tempSensor;
    private SensorPresion presionSensor;
    private SensorAceleracion acelSensor;

    @BeforeEach
    void setUp() {
        tempSensor = new SensorTemperatura("DHT11", "Adafruit", 0.5);
        presionSensor = new SensorPresion("BMP280", "Bosch", 0.8);
        acelSensor = new SensorAceleracion("MPU6050", "InvenSense", 1.2);
    }

    @Test
    @DisplayName("Verificar encendido y apagado de DispositivoElectronico")
    void testEncenderApagar() {
        assertFalse(tempSensor.isEncendido(), "El sensor debe iniciar apagado por defecto");

        tempSensor.encender();
        assertTrue(tempSensor.isEncendido(), "El sensor debe estar encendido");

        tempSensor.apagar();
        assertFalse(tempSensor.isEncendido(), "El sensor debe estar apagado");
    }

    @Test
    @DisplayName("Verificar proceso de calibración en Sensor")
    void testCalibrar() {
        assertFalse(presionSensor.isEstaCalibrado(), "El sensor no debe estar calibrado inicialmente");

        presionSensor.calibrar();
        assertTrue(presionSensor.isEstaCalibrado(), "El sensor debe quedar en estado calibrado");
    }

    @Test
    @DisplayName("Verificar que la lectura de temperatura se encuentra en el rango de 20.0 a 35.0 °C")
    void testLecturaTemperaturaRango() {
        double valor = tempSensor.leerValor();
        assertTrue(valor >= 20.0 && valor <= 35.0,
                "La lectura de temperatura debe estar dentro del rango [20.0, 35.0]");
        assertEquals("°C", tempSensor.getUnidadMedida(), "La unidad debe ser °C");
    }

    @Test
    @DisplayName("Verificar que la lectura de presión se encuentra en el rango de 900.0 a 1100.0 hPa")
    void testLecturaPresionRango() {
        double valor = presionSensor.leerValor();
        assertTrue(valor >= 900.0 && valor <= 1100.0,
                "La lectura de presión debe estar dentro del rango [900.0, 1100.0]");
        assertEquals("hPa", presionSensor.getUnidadMedida(), "La unidad debe ser hPa");
    }

    @Test
    @DisplayName("Verificar cálculo de magnitud vectorial en SensorAceleracion")
    void testLecturaAceleracionMagnitud() {
        double magnitud = acelSensor.leerValor();

        double x = acelSensor.getValorEjeX();
        double y = acelSensor.getValorEjeY();
        double z = acelSensor.getValorEjeZ();

        double magnitudEsperada = Math.sqrt(x * x + y * y + z * z);

        assertEquals(magnitudEsperada, magnitud, 0.0001,
                "La magnitud debe ser igual a la raíz cuadrada de la suma de los ejes al cuadrado");
    }
}