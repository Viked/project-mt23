package com.example.project_mt23.topic_1_06.hierarchy;

/**
 * Created by Initb on 23.04.2016.
 */
public class Citizen extends Human {

    private String country;

    public Citizen(int age, String name, String country) {
        super(age, name);
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
