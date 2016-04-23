package com.example.project_mt23.topic_1_06.equation;

/**
 * Created by Initb on 23.04.2016.
 */
public class Equation {

    public static void testEquation(StringBuffer out){
        double minX = -10;
        double maxX = 10;
        double step = 1;
        Function func = new Function() {
            @Override
            public double f(double x) {
                return Math.pow(x, 2)+3.1*x +5;
            }
        };

        out.append("Минимум функции:")
                .append("\n")
                .append("Интерфейс: ")
                .append(solve(minX, maxX,step,func))
                .append("\n")
                .append("Абстрактный класс: ")
                .append(new EquationImpl().solve(minX,maxX,step))
                .append("\n");

    }

    static double solve(double a, double b, double step, Function func) {
        double min =func.f(a);
        for (double x = a + step; x <= b; x+=step){
            double f = func.f(x);
            if(f < min){
                min = f;
            }
        }
        return min;
    }
}
