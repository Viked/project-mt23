package com.example.project_mt23.topic_1_06.hierarchy;

/**
 * Created by Initb on 23.04.2016.
 */
public class Citizen extends Human {

    private String country;

    public Citizen(int yearOfBirth, String name, String surname, String country) {
        super(yearOfBirth, name, surname);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + country;
    }
}
