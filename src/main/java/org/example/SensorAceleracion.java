package org.example;
import java.util.Random;

/**
 * Representa un acelerómetro de tres ejes (X, Y, Z).
 * Hereda de la clase {@link Sensor}.
 *
 * @author Cristian Ivan Martinez Ruiz
 * @version 1.0
 */
public class SensorAceleracion extends Sensor {
    private double valorEjeX;
    private double valorEjeY;
    private double valorEjeZ;

    /**
     * Construye un sensor de aceleración con la unidad por defecto (m/s^2).
     *
     * @param modelo Nombre del modelo.
     * @param fabricante Fabricante.
     * @param consumoEnergia Consumo en Vatios.
     */
    public SensorAceleracion(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "m/s^2");
    }

    /**
     * Genera lecturas para los ejes X, Y y Z, e imprime sus valores individuales.
     *
     * @return Magnitud del vector resultante calculada como sqrt(X^2 + Y^2 + Z^2).
     */
    @Override
    public double leerValor() {
        Random r = new Random();
        this.valorEjeX = -10.0 + (20.0 * r.nextDouble());
        this.valorEjeY = -10.0 + (20.0 * r.nextDouble());
        this.valorEjeZ = -10.0 + (20.0 * r.nextDouble());

        System.out.printf("[%s] Leyendo aceleración 3D -> X: %.2f, Y: %.2f, Z: %.2f %s%n",
                getModelo(), valorEjeX, valorEjeY, valorEjeZ, getUnidadMedida());

        return Math.sqrt(Math.pow(valorEjeX, 2) + Math.pow(valorEjeY, 2) + Math.pow(valorEjeZ, 2));
    }

    public double getValorEjeX() {
        return valorEjeX;
    }

    public double getValorEjeY() {
        return valorEjeY;
    }

    public double getValorEjeZ() {
        return valorEjeZ;
    }
}