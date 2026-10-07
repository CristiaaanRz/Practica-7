package org.example;

public abstract class Sensor extends DispositivoElectronico {
    private String unidadMedida;
    private boolean estaCalibrado;

    public Sensor(String modelo, String fabricante, double consumoEnergia, String unidadMedida){
        super(modelo, fabricante, consumoEnergia);
        this.unidadMedida = unidadMedida;
        this.estaCalibrado = false;
    }

    public void calibrar(){
        this.estaCalibrado = true;
        System.out.println("Calibrando...");
        System.out.println("Sensor " + getModelo() + " calibrado");
    }

    public abstract double leerValor();

    public String getUnidadMedida(){
        return unidadMedida;
    }

    public boolean isEstaCalibrado(){
        return estaCalibrado;
    }
}
