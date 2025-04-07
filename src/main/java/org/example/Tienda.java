package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String direccion;
    private List<Dispositivo> catalogo = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    GestorArchivo gestorArchivo = new GestorArchivo();

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
    public void crearCliente(String nombre, String apellido, String correo, int numero, String estadoCivil, String ciudad){
        try{
            Cliente cliente = new Cliente(nombre, apellido, correo, numero, ciudad, estadoCivil);
            clientes.add(cliente);
            System.out.println("Cliente creado exitosamente");
        }catch (Exception e){
            System.out.println("Error al crear el cliente: " + e.getMessage());
        }
    }
    public void crearComputadorEscritorio(String marca, String modelo, String procesador, String ram, String almacenamiento, int precio, int anio, int stock, String gpu, String psu, String gabinete, String marcaPantalla, String modeloPantalla, String anioPantalla){
        try{
            ComputadorEscritorio computadorEscritorio = new ComputadorEscritorio(marca, modelo, procesador, ram, almacenamiento, precio, anio, stock, gpu, psu, gabinete, marcaPantalla, modeloPantalla, anioPantalla);
            catalogo.add(computadorEscritorio);
            System.out.println("Computador de escritorio creado exitosamente");
        }catch (Exception e){
            System.out.println("Error al crear el computador de escritorio: " + e.getMessage());
        }
    }
    public void crearNotebook(String marca, String modelo, String procesador, String ram, String almacenamiento, int precio, int anio, int stock, String resolucion, String tipoTeclado, String bateria){
        try{
            Notebook notebook = new Notebook(marca, modelo, procesador, ram, almacenamiento, precio, anio, stock, resolucion, tipoTeclado, bateria);
            catalogo.add(notebook);

            System.out.println("Notebook creada exitosamente");
        }catch (Exception e){
            System.out.println("Error al crear la notebook: " + e.getMessage());
        }
    }
    public void crearTablet(String marca, String modelo, String procesador, String ram, String almacenamiento, int precio, int anio, int stock, String resolucion, List<String> acesorios){
        try{
            Tablet tablet = new Tablet(marca, modelo, procesador, ram, almacenamiento, precio, anio, stock, resolucion, acesorios);
            catalogo.add(tablet);
            System.out.println("Tablet creada exitosamente");
        }catch (Exception e){
            System.out.println("Error al crear la tablet: " + e.getMessage());
        }
    }
    public void agregarCatalogo(Tienda tienda){
        try{
            gestorArchivo.guardarLista(catalogo,tienda);
            System.out.println("Catalogo guardado exitosamente");
        }catch (Exception e){
            System.out.println("Error al guardar el catalogo: " + e.getMessage());
        }
    }
    public void modificarDireccion(String direccion){
        setDireccion(direccion);
        System.out.println("Direccion modificada a " + direccion);
    }
}
