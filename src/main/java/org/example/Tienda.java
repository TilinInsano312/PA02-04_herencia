package org.example;

import java.util.List;

public class Tienda {
    private String direccion;
    private List<Dispositivo> catalogo;

    public Tienda(String direccion, List<Dispositivo> catalogo) {
        this.direccion = direccion;
        this.catalogo = catalogo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Dispositivo> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(List<Dispositivo> catalogo) {
        this.catalogo = catalogo;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "direccion='" + direccion + '\'' +
                ", catalogo=" + catalogo +
                '}';
    }
}
