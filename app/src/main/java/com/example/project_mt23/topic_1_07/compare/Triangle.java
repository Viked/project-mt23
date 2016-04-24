package com.example.project_mt23.topic_1_07.compare;

/**
 * Created by Initb on 24.04.2016.
 */
public class Triangle {
    private Double a,b,c,S;

    public Triangle(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.S = (1.0/4.0)*(Math.sqrt((a+b+c)*(b+c-a)*(a+c-b)*(a+b-c)));
    }

    public Double getS() {
        return S;
    }

    @Override
    public String toString() {
        return "\nS = " + S;
    }
}
