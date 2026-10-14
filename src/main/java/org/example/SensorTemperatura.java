package org.example;

import java.util.Random;

/**
 * Representa un sensor especializado en la medición de temperatura ambiental.
 * Hereda de la clase {@link Sensor}.
 *
 * @author Cristian Ivan Martinez Ruiz
 * @version 1.0
 */
public class SensorTemperatura extends Sensor {
    private double valorActual;

    /**
     * Construye un sensor de temperatura con la unidad por defecto (°C).
     *
     * @param modelo Nombre del modelo.
     * @param fabricante Fabricante.
     * @param consumoEnergia Consumo eléctrico en Vatios.
     */
    public SensorTemperatura(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "°C");
    }

    /**
     * Simula la lectura de la temperatura generando un valor aleatorio entre 20.0 y 35.0 °C.
     *
     * @return Temperatura simulada en grados Celsius (°C).
     */
    @Override
    public double leerValor() {
        System.out.println("[" + getModelo() + "] Leyendo temperatura...");
        Random r = new Random();
        this.valorActual = 20.0 + (35.0 - 20.0) * r.nextDouble();
        return this.valorActual;
    }

    public double getValorActual() {
        return valorActual;
    }

    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }
}