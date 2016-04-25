package com.example.project_mt23.topic_1_08.exception;

/**
 * Created by Initb on 25.04.2016.
 */
public class ComputeFourthDegree {

    public static double computeFourthDegree(double x) throws WrongArgumentException{
        if (x<0){
            throw new WrongArgumentException(x);
        }else {
            return Math.pow(x, (1.0/4.0));
        }
    }

    public static class WrongArgumentException extends Exception {
        private double value;

        public WrongArgumentException(double value) {
            super();
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        public void print(StringBuffer out){
            out.append(this.getClass()).append(" С аргументом: ").append(value).append("\n");
        }
    }
}
