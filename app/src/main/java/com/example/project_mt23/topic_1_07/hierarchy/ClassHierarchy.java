package com.example.project_mt23.topic_1_07.hierarchy;

/**
 * Created by Initb on 25.04.2016.
 */
public class ClassHierarchy {

    static public void testClassHierarchy(StringBuffer out){
        new GroupArray().test(out);
        out.append("\n");
        new GroupCollection().test(out);
    }
}
