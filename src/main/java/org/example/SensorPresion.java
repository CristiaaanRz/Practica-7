package org.example;

import java.util.Random;

/**
 * Representa un sensor especializado en medir presión atmosférica.
 * Hereda de la clase {@link Sensor}.
 *
 * @author Cristian Ivan Martinez Ruiz
 * @version 1.0
 */
public class SensorPresion extends Sensor {
    private double valorActual;

    /**
     * Construye un sensor de presión con la unidad por defecto (hPa).
     *
     * @param modelo Nombre del modelo.
     * @param fabricante Fabricante.
     * @param consumoEnergia Consumo en Vatios.
     */
    public SensorPresion(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "hPa");
    }

    /**
     * Simula la lectura de la presión atmosférica generando un valor entre 900.0 y 1100.0 hPa.
     *
     * @return Presión atmosférica simulada en hectopascales (hPa).
     */
    @Override
    public double leerValor() {
        System.out.println("[" + getModelo() + "] Leyendo presión atmosférica...");
        Random r = new Random();
        this.valorActual = 900.0 + (1100.0 - 900.0) * r.nextDouble();
        return this.valorActual;
    }

    public double getValorActual() {
        return valorActual;
    }

    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }
}