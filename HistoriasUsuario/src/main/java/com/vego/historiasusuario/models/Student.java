package com.vego.historiasusuario.models;

public class Student {
    private int matricula;
    private String nombre;
    private int edad;

    public Student(int matricula, String nombre, int edad) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
    }



    public int getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}