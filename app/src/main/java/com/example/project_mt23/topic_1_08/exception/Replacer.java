package com.example.project_mt23.topic_1_08.exception;

import java.util.Arrays;

/**
 * Created by Initb on 25.04.2016.
 */
public class Replacer {
    public static class IndexException extends Exception {
        private int firstIndex;
        private int secondIndex;

        public IndexException(int firstIndex, int secondIndex) {
            this.firstIndex = firstIndex;
            this.secondIndex = secondIndex;
        }

        public int getFirstIndex() {
            return firstIndex;
        }

        public int getSecondIndex() {
            return secondIndex;
        }

        public void print(StringBuffer out){
            out.append(this.getClass()).append(" С индексами: ").append(firstIndex).append(", ").append(secondIndex).append("\n");
        }
    }

    public static <T>void replace(T[] arr, int firstIndex, int secondIndex ) throws IndexException {
        if (firstIndex < 0 || firstIndex >= arr.length || secondIndex < 0 || secondIndex >= arr.length)
            throw new IndexException(firstIndex, secondIndex);
        T temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    public static <E>void testArray(E[] arr, StringBuffer out ) {
        out.append("\nИсходный массив: ")
                .append(Arrays.toString(arr))
                .append("\nРезультат с перестановкой 0 и 2 елементов: ");
        try {
            replace(arr, 0, 2);
            out.append(Arrays.toString(arr))
                    .append("\nРезультат с перестановкой 0 и 3 елементов: ");
            replace(arr, 0, 3);
        } catch (IndexException e) {
            e.printStackTrace();
            e.print(out);
        }
    }


}
