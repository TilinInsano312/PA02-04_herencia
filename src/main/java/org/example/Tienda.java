package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String direccion;
    private List<Dispositivo> catalogo = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public Tienda(String direccion, List<Dispositivo> catalogo, List<Cliente> clientes) {
        this.direccion = direccion;
        this.catalogo = catalogo;
        this.clientes = clientes;
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

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "direccion='" + direccion + '\'' +
                ", catalogo=" + catalogo +
                ", clientes=" + clientes +
                '}';
    }
}
