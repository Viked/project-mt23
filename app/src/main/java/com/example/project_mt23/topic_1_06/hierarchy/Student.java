package com.example.project_mt23.topic_1_06.hierarchy;


/**
 * Created by Initb on 23.04.2016.
 */
public class Student extends Citizen {

    private String comment;

    public Student(int yearOfBirth, String name, String surname, String country, String comment) {
        super(yearOfBirth, name, surname, country);
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + comment;
    }
}
