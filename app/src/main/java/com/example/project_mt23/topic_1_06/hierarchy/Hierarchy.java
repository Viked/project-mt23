package com.example.project_mt23.topic_1_06.hierarchy;

/**
 * Created by Initb on 23.04.2016.
 */
public class Hierarchy {

    static public void testHierarchy(StringBuffer out){
        Human[] people = new Human[4];
        people[0] = new Human(1970, "Новый", "Человек");
        people[1] = new Citizen(1980, "Еще", "Один", "Новая бавария" );
        people[2] = new Employee(1990, "3", "Человек", "Харьков" ,2000, "x747");
        people[3] = new Student(2000, "Другой", "Человек", "Monastery" , "Учится" );
        for (Human human: people) {
            out.append(human.toString()).append("\n");
        }
    }

}
