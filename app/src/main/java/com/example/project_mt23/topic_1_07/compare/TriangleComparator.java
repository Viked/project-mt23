package com.example.project_mt23.topic_1_07.compare;

import java.util.Comparator;

/**
 * Created by Initb on 25.04.2016.
 */
public class TriangleComparator implements Comparator<Triangle> {
    @Override
    public int compare(Triangle lhs, Triangle rhs) {
        return Double.compare(rhs.getS(), lhs.getS());
    }
}
