package com.example.project_mt23.topic_1_07.generics;

import java.util.Objects;

/**
 * Created by Initb on 24.04.2016.
 */
public class GenericArray<T> {
    private Object[] arr;

    public GenericArray(T[] arr) {
        this.arr = arr;
    }

    public GenericArray(int size) {
        arr = new Object[size];
    }

    int size() {
        return arr.length;
    }

    T get(int i) {
        return (T)arr[i];
    }

    void set(int i, T t) {
        arr[i] = t;
    }

    public int count(){
        return arr.length;
    }

    public void add(T x) {
        Object[] newArray = new Object[arr.length + 1];
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        newArray[arr.length] = x;
        arr = newArray;
    }

    public void removeLast() {
        if (arr.length == 0)
            return;
        Object[] newArray = new Object[arr.length - 1];
        System.arraycopy(arr, 0, newArray, 0, newArray.length);
        arr = newArray;
    }


    public void addAll(Object[] newItems) {
        Object[] newArray = new Object[arr.length + newItems.length];
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        System.arraycopy(newItems, 0, newArray, arr.length, newItems.length);
        arr = newArray;
    }

    void printAll(StringBuffer out) {
        for (Object anArr : arr) {
            out.append(anArr.toString()).append(" ");
        }
    }


}
