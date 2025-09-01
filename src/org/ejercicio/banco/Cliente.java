package org.ejercicio.banco;

public class Cliente {
    String nombre;
    long dni;

    public Cliente(String str,long num) {
        this.dni = num;
        this.nombre = str;
    }
    public Cliente(){}
}
