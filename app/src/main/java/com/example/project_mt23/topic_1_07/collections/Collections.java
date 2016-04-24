package com.example.project_mt23.topic_1_07.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Initb on 24.04.2016.
 */
public class Collections {

    static public void testCollections(StringBuffer out){
        List<Double> list = new ArrayList<>(Arrays.asList(new Double[]{1.0,0.6,-1.0,10.0,-50.0, 0.0}));
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

    static public double sumOfPositiveElements(List<Double> list){
        double out = 0;
        for(Double d : list){
            if (d>0.0){
                out+=d;
            }
        }
        return out;
    }

    static public int first0Element(List<Double> list){
        for(int i = 0; i< list.size(); i++){
            if (list.get(i).equals(0.0)){
                return i;
            }
        }
        return -1;
    }

    static public List<Double> listOfPositiveElements(List<Double> list){
        List<Double> out = new ArrayList<>();
        for(Double d : list){
            if (d>0.0){
                out.add(d);
            }
        }
        return out;
    }

    static public double sumOfMinAndMax(List<Double> list){
        return java.util.Collections.min(list) + java.util.Collections.max(list);
    }

    static public void reverse(List<Double> list){
        java.util.Collections.reverse(list);
    }




}
