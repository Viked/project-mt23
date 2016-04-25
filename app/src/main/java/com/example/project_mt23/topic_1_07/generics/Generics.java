package com.example.project_mt23.topic_1_07.generics;

import android.util.Pair;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Initb on 24.04.2016.
 */
public class Generics {

    public static void testGenerics(StringBuffer out) {
        testGenericArray(out,new GenericArray<>(new String[]{"1", "2", "Zzzz.."}), new GenericArray<>(new String[]{"A", "B", "C"}) );
        testGenericArray(out,new GenericArray<>(new Double[]{1.0,5.0, 80.0}), new GenericArray<>(new Double[]{7.0, 42.0, 3.0}) );
    }


    public static<T> void testGenericArray(StringBuffer out, GenericArray<T> first, GenericArray<T> second ) {
        first.printAll(out.append("Обобщенный массив: "));
        out.append("\nПоследний элемент: ").append(first.get(first.size() - 1));
        first.set(1, second.get(0));
        first.printAll(out.append("\nИзменен второй элемент: "));

        first.addAll(new Object[]{second.get(1),second.get(2)});
        first.printAll(out.append("\nДобавить массив в массив: "));

        first.removeLast();
        first.printAll(out.append("\nУдален последний элемент: "));

        second.printAll(out.append("\nТестовый массив: "));
        out.append("\nПоменять местами элементы 0 и 2 двух массивов: ");
        swapItemsInArray(first, second, new int[]{0,2});
        first.printAll(out.append("\nПервый массив: "));
        second.printAll(out.append("\nТестовый массив: "));
        turnItemsInArray(first);
        first.printAll(out.append("\nМассив с обратным порядком: "));

        out.append("\nКолличество раз вхождения определенного элемента в массив:\n");
        Map<T, Integer> elements = repeatingElementsInArray(first);
        for (T e: elements.keySet()){
            out.append(e).append(" - ").append(elements.get(e)).append("\n");
        }
        out.append("\n");
    }



    public static<T> void swapItemsInArray(GenericArray<T> first, GenericArray<T> second, int[] indexes ) {
        for(int i : indexes){
            if(i>=0 && i<first.count() && i<second.count()) {
                T temp = first.get(i);
                first.set(i, second.get(i));
                second.set(i, temp);
            }
        }
    }

    public static<T> void turnItemsInArray(GenericArray<T> array ) {
        int lastItemIndex = array.count() - 1;
        for (int i = 0; i < array.count()/2; i++){
            int swapIndex = lastItemIndex - i;
            T temp = array.get(i);
            array.set(i, array.get(swapIndex));
            array.set(swapIndex, temp);
        }
    }

    public static<T> Map<T, Integer> repeatingElementsInArray(GenericArray<T> array ) {
        Map<T, Integer> out = new HashMap<>();
        for (int i = 0; i < array.count(); i++){
            T temp = array.get(i);
            int count = 1;
            if (out.containsKey(temp)){
                count = out.get(temp) + 1;
            }
            out.put(temp, count);
        }
        return out;
    }

}
