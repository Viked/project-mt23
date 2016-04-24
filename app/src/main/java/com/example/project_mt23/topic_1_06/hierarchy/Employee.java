package com.example.project_mt23.topic_1_06.hierarchy;

import com.example.project_mt23.topic_1_06.hierarchy.Citizen;

/**
 * Created by Initb on 23.04.2016.
 */
public class Employee extends Citizen {

    private int salary;

    private String companyName;

    public Employee(int yearOfBirth, String name, String surname, String country, int salary, String companyName) {
        super(yearOfBirth, name, surname, country);
        this.salary = salary;
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + companyName + ", " + salary + "$";
    }
}
