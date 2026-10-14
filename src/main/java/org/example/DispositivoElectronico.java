package org.example;
/**
 * Representa un dispositivo electrónico genérico dentro del sistema de monitoreo.
 * Sirve como la clase base para todos los componentes de hardware.
 *
 * @author Cristian Ivan Martinez Ruiz
 * @version 1.0
 */
public class DispositivoElectronico {
    private String modelo;
    private String fabricante;
    private double consumoEnergia;
    private boolean encendido;

    /**
     * Constructor para inicializar los atributos principales del dispositivo electrónico.
     *
     * @param modelo Identificador o nombre del modelo del dispositivo.
     * @param fabricante Empresa o entidad fabricante.
     * @param consumoEnergia Consumo energético en Vatios (W).
     */
    public DispositivoElectronico(String modelo, String fabricante, double consumoEnergia) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.consumoEnergia = consumoEnergia;
        this.encendido = false;
    }

    /**
     * Enciende el dispositivo electrónico y cambia su estado a activo.
     */
    public void encender() {
        this.encendido = true;
        System.out.println("Dispositivo [" + modelo + "] ENCENDIDO.");
    }

    /**
     * Apaga el dispositivo electrónico y cambia su estado a inactivo.
     */
    public void apagar() {
        this.encendido = false;
        System.out.println("Dispositivo [" + modelo + "] APAGADO.");
    }

    /**
     * Obtiene una representación textual con el estado general del dispositivo.
     *
     * @return String con la información del modelo, fabricante, consumo y estado.
     */
    public String obtenerEstado() {
        String estadoStr = encendido ? "Encendido" : "Apagado";
        return "Modelo: " + modelo + " | Fabricante: " + fabricante +
                " | Consumo: " + consumoEnergia + "W | Estado: " + estadoStr;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
}