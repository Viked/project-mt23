package com.example.project_mt23.topic_1_06.equation;

/**
 * Created by Initb on 23.04.2016.
 */
public abstract class AbstractEquation {

    abstract double f(double x);

    double solve(double a, double b, double step) {
        double min =f(a);
        for (double x = a + step; x <= b; x+=step){
            double f = f(x);
            if(f < min){
                min = f;
            }
        }
        return min;
    }

}
