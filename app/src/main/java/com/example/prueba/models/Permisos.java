package com.example.prueba.models;

public class Permisos {
    public String nombre;
    public int num;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Permisos(String nombre, int num) {
        this.nombre = nombre;
        this.num = num;
    }
}
