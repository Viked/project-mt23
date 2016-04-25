package com.example.project_mt23.topic_1_06.equation;

/**
 * Created by Initb on 24.04.2016.
 */
public class EquationImpl extends AbstractEquation {
    @Override
    double f(double x) {
        return Math.pow(x, 2)+3.1*x +5;
    }
}
