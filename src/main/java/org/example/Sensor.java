package org.example;
/**
 * Clase abstracta que extiende {@link DispositivoElectronico} y define la
 * estructura base para cualquier tipo de sensor en el sistema.
 *
 * @author Cristian Ivan Martinez Ruiz
 * @version 1.0
 */
public abstract class Sensor extends DispositivoElectronico {
    private String unidadMedida;
    private boolean estaCalibrado;

    /**
     * Constructor de la clase abstracta Sensor.
     *
     * @param modelo Identificador del modelo del sensor.
     * @param fabricante Fabricante del sensor.
     * @param consumoEnergia Consumo en vatios (W).
     * @param unidadMedida Unidad física de la medición (ej: °C, hPa, m/s^2).
     */
    public Sensor(String modelo, String fabricante, double consumoEnergia, String unidadMedida) {
        super(modelo, fabricante, consumoEnergia);
        this.unidadMedida = unidadMedida;
        this.estaCalibrado = false;
    }

    /**
     * Simula el proceso de calibración del sensor y actualiza su estado.
     */
    public void calibrar() {
        this.estaCalibrado = true;
        System.out.println("El sensor " + getModelo() + " ha sido calibrado correctamente.");
    }

    /**
     * Método abstracto que debe ser implementado por las subclases concretas
     * para realizar la lectura específica del sensor.
     *
     * @return Valor numérico de la medición realizada.
     */
    public abstract double leerValor();

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public boolean isEstaCalibrado() {
        return estaCalibrado;
    }

    public void setEstaCalibrado(boolean estaCalibrado) {
        this.estaCalibrado = estaCalibrado;
    }
}