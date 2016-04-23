package com.example.project_mt23.topic_1_06.hierarchy;

/**
 * Created by Initb on 23.04.2016.
 */
public class Hierarchy {

    static private Human[] people;

    static public void initial(){
        people = new Human[4];
        people[0] = new Human(30, "Васян");
        people[1] = new Citizen(34, "Степан", "Новая бавария" );
        people[2] = new Employee(21, "Антон", "Харьков" ,2000, "x747");
        people[3] = new Student(18, "Scar", "Ishwar", "Monastery" , (byte)2 );
    }

    static public void getText(StringBuffer out){
        if(people==null){
            initial();
        }
        for (Human human: people) {
            out.append(human.toString()).append("\n");
        }
    }

}
