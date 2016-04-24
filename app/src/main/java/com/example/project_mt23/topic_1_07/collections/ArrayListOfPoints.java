package com.example.project_mt23.topic_1_07.collections;

import com.example.project_mt23.topic_1_06.arrays.AbstractArrayOfPoints;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Initb on 25.04.2016.
 */
public class ArrayListOfPoints extends AbstractArrayOfPoints{

    private List<Double> points = new ArrayList<>();

    private int getXIndex(int i){
        return i * 2;
    }

    private int getYIndex(int i){
        return i * 2 + 1;
    }

    @Override
    public void setPoint(int i, double x, double y) {
        if(i<count()) {
            points.set(getXIndex(i), x);
            points.set(getYIndex(i), y);
        }
    }

    @Override
    public double getX(int i) {
        return points.get(getXIndex(i));
    }

    @Override
    public double getY(int i) {
        return points.get(getYIndex(i));
    }

    @Override
    public int count() {
        return points.size()/2;
    }

    @Override
    public void addPoint(double x, double y) {
        points.add(x);
        points.add(y);
    }

    @Override
    public void removeLast() {
        points.remove(points.size()-1);
        points.remove(points.size()-1);
    }
}
