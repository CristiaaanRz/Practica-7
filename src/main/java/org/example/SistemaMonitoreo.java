package org.example;
import java.util.ArrayList;

/**
 * Clase principal que ejecuta el Sistema de Monitoreo de Hardware Distribuido.
 * Demuestra el uso del polimorfismo sobre la jerarquía de sensores.
 *
 * @author Cristian Ivan Martinez Ruiz
 * @version 1.0
 */
public class SistemaMonitoreo {

    /**
     * Punto de entrada principal del programa.
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        ArrayList<Sensor> listaSensores = new ArrayList<>();

        listaSensores.add(new SensorTemperatura("DHT11", "Adafruit", 0.5));
        listaSensores.add(new SensorTemperatura("LM35", "Texas Instruments", 0.2));

        listaSensores.add(new SensorPresion("BMP280", "Bosch", 0.8));
        listaSensores.add(new SensorPresion("FPS100", "Sensirion", 1.0));

        listaSensores.add(new SensorAceleracion("MPU6050", "InvenSense", 1.2));
        listaSensores.add(new SensorAceleracion("ADXL345", "Analog Devices", 0.9));

        System.out.println("=== SISTEMA DE MONITOREO DE HARDWARE DISTRIBUIDO ===\n");

        for (Sensor sensor : listaSensores) {
            sensor.encender();
            sensor.calibrar();

            double lectura = sensor.leerValor();

            System.out.printf("--> Magnitud/Valor leído: %.2f %s%n", lectura, sensor.getUnidadMedida());
            System.out.println("--------------------------------------------------");
        }
    }
}