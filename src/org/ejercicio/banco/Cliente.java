package org.ejercicio.banco;

public class Cliente {
    private final String id;
    private String nombre;

    public Cliente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public String toString() {
        return "Cliente{id='" + id + "', nombre='" + nombre + "'}";
    }
}
