package com.vego.historiasusuario.models;

import java.util.ArrayList;

public class BaseDeDatosDos implements Gestor {

    private ArrayList<Student> students = new ArrayList<>();

    @Override
    public boolean save(Student student) {
        students.add(student);
        return true;
    }

    @Override
    public void update(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMatricula() == student.getMatricula()) {
                students.set(i, student);
                break;
            }
        }
    }

    @Override
    public ArrayList<Student> getAllStudents() {
        return students;
    }
}
