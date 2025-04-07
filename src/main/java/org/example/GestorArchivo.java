package org.example;
import java.io.File;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GestorArchivo {

    private static final ObjectMapper mapper = new ObjectMapper();

    public GestorArchivo() {
    }

    // Opción Uno: Utilización de Genéricos

    // Método genérico para guardar un solo personaje en un archivo JSON
    public <T> void guardarUno(T obj, Tienda tienda) {
        try {
            mapper.writeValue(new File("Tienda_"+tienda.getDireccion()), obj);
            System.out.println("guardado en " + tienda.getDireccion());
        } catch (Exception e) {
            System.err.println("Error al guardar el personaje en " + "Tienda_"+tienda.getDireccion() + ": " + e.getMessage());
        }
    }

    // Método genérico para guardar una lista de personajes en un archivo JSON
    public <T> void guardarLista(List<T> lista, Tienda tienda) {
        try {
            mapper.writeValue(new File("Tienda_"+tienda.getDireccion()), lista);
            System.out.println("Lista de personajes guardada en " + "Tienda_"+tienda.getDireccion());
        } catch (Exception e) {
            System.err.println("Error al guardar la lista de personajes en " + "Tienda_"+tienda.getDireccion() + ": " + e.getMessage());
        }
    }

    // Método genérico para leer un solo personaje desde un archivo JSON
    public <T> T leerUno(Tienda tienda, Class<T> claseTipo) {
        try {
            return mapper.readValue(new File("Tienda_"+tienda.getDireccion()), claseTipo);
        } catch (Exception e) {
            System.err.println("Error al leer desde " + "Tienda_"+tienda.getDireccion() + ": " + e.getMessage());
            return null;
        }
    }

    // Método genérico para leer una lista de personajes desde un archivo JSON
    public <T> List<T> leerLista(Tienda tienda, Class<T> claseTipo) {
        try {
            return mapper.readValue(new File("Tienda_"+tienda.getDireccion()),
                    mapper.getTypeFactory().constructCollectionType(List.class, claseTipo));
        } catch (Exception e) {
            System.err.println("Error al leer la lista desde " + "Tienda_"+tienda.getDireccion()+ ": " + e.getMessage());
            return null;
        }
    }
}