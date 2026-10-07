package org.example;

public class DispositivoElectronico {
    private  String modelo;
    private String fabricante;
    private double consumoEnergia;
    private boolean encendido;

    public DispositivoElectronico(String modelo, String fabricante, double consumoEnergia) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.consumoEnergia = consumoEnergia;
        this.encendido = false;                         // Por defecte lo tendremos apagado
    }

    public void encender(){
        this.encendido = true;
        System.out.println("Dispositivo [" + modelo + "] encendido");
    }

    public void apagar(){
        this.encendido = false;
        System.out.println("Dispositivo [" + modelo + "] apagado");
    }

    public String obtenerEstado(){
        String estadoStr = encendido ? "Encendido" : "Apagado";
        return "Modelo: " + modelo + "\nFabricante: " + fabricante + "\nConsumo: " + consumoEnergia + "W\nEstado: " + estadoStr;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getFabricante(){
        return fabricante;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public double getConsumoEnergia(){
        return consumoEnergia;
    }
    public void setConsumoEnergia(double consumoEnergia){
        this.consumoEnergia = consumoEnergia;
    }

    public boolean isEncendido(){
        return encendido;
    }
    public void setEncendido(boolean encendido){
        this.encendido = encendido;
    }
}
