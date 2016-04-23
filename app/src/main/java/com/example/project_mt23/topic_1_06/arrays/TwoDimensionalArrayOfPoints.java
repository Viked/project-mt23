package com.example.project_mt23.topic_1_06.arrays;

/**
 * Created by Initb on 23.04.2016.
 */
public class TwoDimensionalArrayOfPoints extends AbstractArrayOfPoints {

    private double[][] points = { };
    private final int X = 0;
    private final int Y = 1;

    @Override
    public void setPoint(int i, double x, double y) {
        if(i<count()){
            points[i][X] = x;
            points[i][Y] = y;
        }
    }

    @Override
    public double getX(int i) {
        return points[i][X];
    }

    @Override
    public double getY(int i) {
        return points[i][Y];
    }

    @Override
    public int count() {
        return points.length;
    }

    @Override
    public void addPoint(double x, double y) {
        double[][] newArray = new double[points.length + 1][2];
        System.arraycopy(points, 0, newArray, 0, points.length);
        newArray[points.length][X] = x;
        newArray[points.length][Y] = y;
        points = newArray;
    }

    @Override
    public void removeLast() {
        if (count() == 0)
            return;
        double[][] newArray = new double[points.length - 1][2];
        System.arraycopy(points, 0, newArray, 0, newArray.length);
        points = newArray;
    }
}
