package com.vego.historiasusuario.models;


import java.util.ArrayList;

public class Universidad {
    private Gestor bdd1;
    private Gestor bdd2;
    private Gestor bdd3;

    private ArrayList<Student> students = new ArrayList<>();

    public boolean save(Student student) {
        students.add(student);
        return true;
    }

    public void update(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMatricula() == student.getMatricula()) {
                students.set(i, student);
                break;
            }
        }
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }
}

