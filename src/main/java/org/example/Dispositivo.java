package org.example;

public class Dispositivo {
    private String marca;
    private String modelo;
    private String procesador;
    private String ram;
    private String almacenamiento;
    private int precio;
    private int anio;
    private int stock;

    public Dispositivo(String marca, String modelo, String procesador, String ram, String almacenamiento, int precio, int anio, int stock) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
        this.anio = anio;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", procesador='" + procesador + '\'' +
                ", ram='" + ram + '\'' +
                ", almacenamiento='" + almacenamiento + '\'' +
                ", precio=" + precio +
                ", anio=" + anio +
                ", stock=" + stock +
                '}';
    }
}
