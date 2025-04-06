package org.example;

public class Notebook extends Dispositivo{
    private String resolucion;
    private String tipoTeclado;
    private String bateria;

    public Notebook(String marca, String modelo, String procesador, String ram, String almacenamiento, int precio, int anio, int stock, String resolucion, String tipoTeclado, String bateria) {
        super(marca, modelo, procesador, ram, almacenamiento, precio, anio, stock);
        this.resolucion = resolucion;
        this.tipoTeclado = tipoTeclado;
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "resolucion='" + resolucion + '\'' +
                ", tipoTeclado='" + tipoTeclado + '\'' +
                ", bateria='" + bateria + '\'' +
                "} " + super.toString();
    }
}
