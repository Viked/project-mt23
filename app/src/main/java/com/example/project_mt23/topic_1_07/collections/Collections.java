package com.example.project_mt23.topic_1_07.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Initb on 24.04.2016.
 */
public class Collections {

    static public void testCollections(StringBuffer out){
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{1,6,-1,10,-50, 0}));
        out.append("Начальный массив: ")
                .append(list)
                .append("\nСумма положительных элементов: ")
                .append(sumOfPositiveElements(list))
                .append("\nИндекс первого нулевого элемента  ")
                .append(first0Element(list))
                .append("\nПоложительные элементы: ")
                .append(listOfPositiveElements(list))
                .append("\nСумма максимального и минимального: ")
                .append(sumOfMinAndMax(list))
                .append("\nОбратный порядо: ");
        reverse(list);
                out.append(list);
    }

    static public double sumOfPositiveElements(List<Integer> list){
        int out = 0;
        for(Integer d : list){
            if (d>0.0){
                out+=d;
            }
        }
        return out;
    }

    static public int first0Element(List<Integer> list){
        for(int i = 0; i< list.size(); i++){
            if (list.get(i).equals(0)){
                return i;
            }
        }
        return -1;
    }

    static public List<Integer> listOfPositiveElements(List<Integer> list){
        List<Integer> out = new ArrayList<>();
        for(Integer d : list){
            if (d>0){
                out.add(d);
            }
        }
        return out;
    }

    static public double sumOfMinAndMax(List<Integer> list){
        return java.util.Collections.min(list) + java.util.Collections.max(list);
    }

    static public void reverse(List<Integer> list){
        java.util.Collections.reverse(list);
    }




}
