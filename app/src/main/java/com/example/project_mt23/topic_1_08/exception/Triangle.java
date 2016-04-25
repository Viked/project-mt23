package com.example.project_mt23.topic_1_08.exception;

/**
 * Created by Initb on 24.04.2016.
 */
public class Triangle {
    private Double a,b,c,S;

    public Triangle(Double a, Double b, Double c) throws TriangleError {
        this.a = a;
        this.b = b;
        this.c = c;
        this.S = (1.0/4.0)*(Math.sqrt((a+b+c)*(b+c-a)*(a+c-b)*(a+b-c)));
        if(S.equals( Double.NaN )||S.equals( 0.0 )) throw new TriangleError(a,b,c);
    }

    public Double getS() {
        return S;
    }

    @Override
    public String toString() {
        return "\nS = " + S;
    }

    public static class TriangleError extends Exception {

        private double a;
        private double b;
        private double c;

        public TriangleError(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public void print(StringBuffer out){
            out.append(this.getClass())
                    .append(" Не правильные стороны: А =")
                    .append(a)
                    .append(", B=")
                    .append(b)
                    .append(", C =")
                    .append(c)
                    .append("\n");
        }
    }

    static public void  testTriangre(StringBuffer out){
        try {
            out.append("\nНормальный треугольник: ");
            Triangle triangle = new Triangle(14.0,15.0,16.0);
            out.append(triangle).append("\nC не правильным параметром: ");
            new Triangle(1.0, 15.0, 16.0);
        } catch (TriangleError equationError) {
            equationError.printStackTrace();
            equationError.print(out);
        }
    }
}
