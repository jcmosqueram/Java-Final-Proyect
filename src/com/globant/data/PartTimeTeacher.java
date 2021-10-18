package com.globant.data;

public class PartTimeTeacher extends Teacher {
    private float activeHoursPerWeek;

    public PartTimeTeacher(String name, Float baseSalary, float activeHoursPerWeek) {
        super(name, baseSalary);
        this.activeHoursPerWeek = activeHoursPerWeek;
    }

    @Override
    public float getSalary() {
        return super.baseSalary*this.activeHoursPerWeek;
    }

    public float getActiveHoursPerWeek() {
        return activeHoursPerWeek;
    }

    public void setActiveHoursPerWeek(float activeHoursPerWeek) {
        this.activeHoursPerWeek = activeHoursPerWeek;
    }

    public String toString(){
        return "name: "+getName() +  "|| Base Salary: "+getSalary()+ "|| Active hours per week: "+this.activeHoursPerWeek;
    }
}
