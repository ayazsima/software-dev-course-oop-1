package org.example;

public class Teacher {
    private String name;
    private String className;


    public Teacher(String name, String className) {
        this.name = name;
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return name + "(" + className + ")";

    }
}
