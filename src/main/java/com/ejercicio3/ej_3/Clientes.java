package com.ejercicio3.ej_3;

public class Clientes {
    private String nombre;
    private Integer edad;

    public Clientes(String nombre, Integer edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    
}
