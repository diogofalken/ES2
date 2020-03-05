package com.es2.memento;

import java.util.ArrayList;

public class Server {
    private ArrayList<String> studentNames = new ArrayList<String>();

    public Server() {}

    public void addStudent(String studentName) throws ExistingStudentException{
        if(this.studentNames.contains(studentName)) {
            throw new ExistingStudentException();
        }

        this.studentNames.add(studentName);
    }


    public Memento backup() {
        return new Memento(this.studentNames);
    }

    public void restore(Memento state) {
        this.studentNames = state.getState();
    }

    public ArrayList<String> getStudentNames() {
        return this.studentNames;
    }

}
