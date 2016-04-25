package com.example.project_mt23.topic_1_08.exception;

import java.util.Arrays;

/**
 * Created by Initb on 25.04.2016.
 */
public class Exceptions {

    static public void testExceptions(StringBuffer out){
        double x1 = 16;
        double x2 = -16;
        try {
            out.append("\nТестирование исключений:\nПравильный аргумент: ")
                    .append(x1)
                    .append("\nРезультат: ").append(ComputeFourthDegree.computeFourthDegree(x1))
                    .append("\nНе правильный аргумент: ")
                    .append(x2)
                    .append("\nРезультат: ");
            ComputeFourthDegree.computeFourthDegree(x2);
        } catch (ComputeFourthDegree.WrongArgumentException e) {
            e.printStackTrace();
            e.print(out);
        }
        Replacer.testArray(new Double[]{0.3,1.0,9.0}, out);
        Replacer.testArray(new String[]{"A", "B", "C"}, out);
        FunctionWithExeption.test(out);
        Triangle.testTriangre(out);
    }


}
