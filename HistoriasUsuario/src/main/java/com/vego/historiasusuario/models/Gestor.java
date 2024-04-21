package com.vego.historiasusuario.models;

import java.util.ArrayList;

public interface Gestor {

    boolean save(Student student);

    void update(Student student);

    ArrayList<Student> getAllStudents();
}