package org.example;

import java.util.List;

public class Tablet extends Dispositivo{

    private String resolucion;
    private List<String> acesorios;

    public Tablet(String marca, String modelo, String procesador, String ram, String almacenamiento, int precio, int anio, int stock, String resolucion, List<String> acesorios) {
        super(marca, modelo, procesador, ram, almacenamiento, precio, anio, stock);
        this.resolucion = resolucion;
        this.acesorios = acesorios;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public List<String> getAcesorios() {
        return acesorios;
    }

    public void setAcesorios(List<String> acesorios) {
        this.acesorios = acesorios;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "resolucion='" + resolucion + '\'' +
                ", acesorios=" + acesorios +
                "} " + super.toString();
    }
}
