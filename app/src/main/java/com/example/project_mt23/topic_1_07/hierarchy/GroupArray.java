package com.example.project_mt23.topic_1_07.hierarchy;

import com.example.project_mt23.topic_1_06.hierarchy.Student;

import java.util.Arrays;

/**
 * Created by Initb on 25.04.2016.
 */
public class GroupArray extends AbstractGroup {

    private Student[] students = new Student[]{};

    @Override
    public Student getStudent(int i) {
        if(i<studentCount()){
            return students[i];
        }else {
            return null;
        }
    }

    @Override
    public void setStudent(int i, Student student) {
        if(i<studentCount()){
            students[i] = student;
        }
    }

    @Override
    public int studentCount() {
        return students.length;
    }

    @Override
    public void addStudent(Student student) {
        Student[] newArray = new Student[students.length + 1];
        System.arraycopy(students, 0, newArray, 0, students.length);
        newArray[students.length] = student;
        students = newArray;
    }

    @Override
    public void clearStudent() {
        students= new Student[]{};
    }

    @Override
    public void sortByAlphabeticalName() {
        Arrays.sort(students, new CompareAlphabeticalName());
    }

    @Override
    public void sortByAscendingNamesLength() {
        Arrays.sort(students, new CompareAscendingNamesLength());
    }
}
