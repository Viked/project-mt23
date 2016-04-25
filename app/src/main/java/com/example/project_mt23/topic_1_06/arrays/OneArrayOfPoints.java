package com.example.project_mt23.topic_1_06.arrays;

/**
 * Created by Initb on 23.04.2016.
 */
public class OneArrayOfPoints extends AbstractArrayOfPoints {

    private double[] points = { };

    private int getXIndex(int i){
        return i * 2;
    }

    private int getYIndex(int i){
        return i * 2 + 1;
    }

    @Override
    public void setPoint(int i, double x, double y) {
        if(i<count()) {
            points[getXIndex(i)] = x;
            points[getYIndex(i)] = y;
        }
    }

    @Override
    public double getX(int i) {
        return points[getXIndex(i)];
    }

    @Override
    public double getY(int i) {
        return points[getYIndex(i)];
    }

    @Override
    public int count() {
        return points.length/2;
    }

    @Override
    public void addPoint(double x, double y) {
        double[] newArray = new double[points.length + 2];
        System.arraycopy(points, 0, newArray, 0, points.length);
        newArray[points.length] = x;
        newArray[points.length+1] = y;
        points = newArray;
    }

    @Override
    public void removeLast() {
        if (count() == 0)
            return;
        double[] newArray = new double[points.length - 2];
        System.arraycopy(points, 0, newArray, 0, newArray.length);
        points = newArray;
    }

    @Override
    public void sortByX() {
        int min;
        double tempX;
        double tempY;
        for (int index = 0; index < count()-1; index++){
            min = index;
            for (int scan = index+1; scan < count(); scan++)
                if (points[getXIndex(scan)] < points[getXIndex(min)])
                    min = scan;
            tempX = points[getXIndex(min)];
            tempY = points[getYIndex(min)];
            setPoint(min, points[getXIndex(index)],points[getYIndex(index)]);
            setPoint(index, tempX, tempY);
        }
    }
}
