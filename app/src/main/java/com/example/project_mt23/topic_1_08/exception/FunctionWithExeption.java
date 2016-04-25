package com.example.project_mt23.topic_1_08.exception;

/**
 * Created by Initb on 25.04.2016.
 */
public class FunctionWithExeption {

    public interface Function {
        double f(double x);
    }

    public static class EquationError extends Exception {
        public void print(StringBuffer out){
            out.append(this.getClass()).append(" Не правильные аргументы\n");
        }
    }

    static double solve(double a, double b, double step, Function func) throws EquationError {
        if (a >= b || func.f(a) == func.f(b) || step ==0.0)
            throw new EquationError();
        return new Object(){
            double findMin(double min, double a, double b, double step, Function func){
                for (double x = a + step; x <= b; x+=step){
                    double f = func.f(x);
                    if(f < min){
                        min = f;
                    }
                }
                return min;
            }
        }.findMin(func.f(a), a, b, step, func);
    }

    static public void test(StringBuffer out){
        double minX = -10;
        double maxX = 10;
        double step = 1;
        Function func = new Function() {
            @Override
            public double f(double x) {
                return Math.pow(x, 2)+3.1*x +5;
            }
        };

        try {
            out.append("\nМинимум функции c нормальными параметрами: ")
                    .append(solve(minX, maxX,step,func))
                    .append("\nC не правильным параметром: ").append(solve(minX, maxX,0,func));
        } catch (EquationError equationError) {
            equationError.printStackTrace();
            equationError.print(out);
        }


    }

}
