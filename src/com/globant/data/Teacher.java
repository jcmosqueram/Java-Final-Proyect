package com.globant.data;

public abstract class Teacher {
    protected String name;
    protected float baseSalary;

    public Teacher(String name, float baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public  abstract float getSalary ();

    public float getBaseSalary() {
        return baseSalary;
    }

    public String getTeacherName() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }
}
