package com.globant.data;

public class    FullTimeTeacher extends Teacher {
    private float yearsOfExperience;

    public FullTimeTeacher(String name, float baseSalary, float yearsOfExperience) {
        super(name, baseSalary);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public float getSalary() {
        return super.baseSalary*this.yearsOfExperience*1.10F;
    }

    public float getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(float yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String toString(){
        return "name: "+getName() +  "|| Base Salary: "+getSalary()+ "|| Years of experience: "+this.yearsOfExperience;
    }
}
