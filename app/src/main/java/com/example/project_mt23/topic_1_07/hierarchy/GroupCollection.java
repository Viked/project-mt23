package com.example.project_mt23.topic_1_07.hierarchy;

import com.example.project_mt23.topic_1_06.hierarchy.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Initb on 25.04.2016.
 */
public class GroupCollection extends AbstractGroup {

    List<Student> students = new ArrayList<>();

    @Override
    public Student getStudent(int i) {
        return students.get(i);
    }

    @Override
    public void setStudent(int i, Student student) {
        students.set(i, student);
    }

    @Override
    public int studentCount() {
        return students.size();
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void clearStudent() {
        students.clear();
    }

    @Override
    public void sortByAlphabeticalName() {
        Collections.sort(students, new CompareAlphabeticalName());
    }

    @Override
    public void sortByAscendingNamesLength() {
        Collections.sort(students, new CompareAscendingNamesLength());
    }
}
