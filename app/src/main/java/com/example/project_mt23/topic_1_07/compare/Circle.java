package com.example.project_mt23.topic_1_07.compare;

/**
 * Created by Initb on 24.04.2016.
 */
public class Circle implements Comparable<Circle> {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return radius.toString();
    }

    @Override
    public int compareTo(Circle another) {
        return Double.compare(radius, another.getRadius());
    }
}
