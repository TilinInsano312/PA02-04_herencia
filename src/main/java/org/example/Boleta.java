package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Boleta {
    private List<Dispositivo> compras = new ArrayList<>();
    private Tienda tienda;
    private Cliente cliente;
    private Date fecha;

    public Boleta(List<Dispositivo> compras, Tienda tienda, Cliente cliente, Date fecha) {
        this.compras = compras;
        this.tienda = tienda;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public List<Dispositivo> getCompras() {
        return compras;
    }

    public void setCompras(List<Dispositivo> compras) {
        this.compras = compras;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Boleta{" +
                "Listado de compras: " + compras +"\n"+
                "Tienda: " + tienda +"\n"+
                "Cliente: " + cliente +"\n"+
                "Fecha:" + fecha +"\n"+
                '}';
    }
    public void eliminarDelStock(){
        
    }

}
