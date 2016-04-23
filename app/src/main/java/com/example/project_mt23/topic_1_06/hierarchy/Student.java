package com.example.project_mt23.topic_1_06.hierarchy;

import com.example.project_mt23.topic_1_06.hierarchy.Citizen;

/**
 * Created by Initb on 23.04.2016.
 */
public class Student extends Citizen {

    private String university;

    private byte course;

    public Student(int age, String name, String country, String university, byte course) {
        super(age, name, country);
        this.university = university;
        this.course = course;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public byte getCourse() {
        return course;
    }

    public void setCourse(byte course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + university + ", " + course;
    }
}
