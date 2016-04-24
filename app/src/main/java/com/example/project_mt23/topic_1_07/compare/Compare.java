package com.example.project_mt23.topic_1_07.compare;

import com.example.project_mt23.topic_1_06.arrays.Arrays;
import com.example.project_mt23.topic_1_07.collections.Collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Initb on 24.04.2016.
 */
public class Compare {

    static public void testComparable(StringBuffer out){
        Circle[] circles = new Circle[]{new Circle(5.0),
                new Circle(1.5),
                new Circle(10.0),
                new Circle(1.0),
                new Circle(0.5),
                new Circle(7.0),
                new Circle(5.8) };
        out.append("\nМассив перед сортировкой: ").append(java.util.Arrays.toString(circles)).append("\n");
        java.util.Arrays.sort(circles);
        out.append("Массив после сортировкой: ").append(java.util.Arrays.toString(circles)).append("\n");
    }

    static public void testComparator(StringBuffer out){
        List<Triangle> list = new ArrayList<>();
        list.add(new Triangle(1.2,2.0,2.5));
        list.add(new Triangle(3.2,3.0,4.5));
        list.add(new Triangle(2.0,1.0,2.0));
        list.add(new Triangle(1.7,2.0,2.9));
        list.add(new Triangle(1.5,2.5,2.5));
        out.append("\nСписок перед сортировкой: ").append(list).append("\n");
        java.util.Collections.sort(list, new TriangleComparator());
        out.append("\nСписок после сортировки: ").append(list).append("\n");
    }
}
