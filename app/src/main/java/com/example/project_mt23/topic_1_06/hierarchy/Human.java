package com.example.project_mt23.topic_1_06.hierarchy;

/**
 * Created by Initb on 23.04.2016.
 */
public class Human {

    private int yearOfBirth;

    private String name;

    private String surname;

    public Human(int yearOfBirth, String name, String surname) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return yearOfBirth +
                ", name = " + name +
                ", surname = " + surname;
    }
}
