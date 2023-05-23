package com.dsa.generics.school;

public class Student {

    private int studentID;

    private String name;

    private String type;

    public Student(int studentID, String name, String type) {
        this.studentID = studentID;
        this.name = name;
        this.type = type;
    }


    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
