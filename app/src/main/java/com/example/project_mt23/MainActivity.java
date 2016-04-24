package com.example.project_mt23;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.project_mt23.topic_1_06.arrays.Arrays;
import com.example.project_mt23.topic_1_06.equation.Equation;
import com.example.project_mt23.topic_1_06.hierarchy.Hierarchy;
import com.example.project_mt23.topic_1_07.collections.Collections;
import com.example.project_mt23.topic_1_07.compare.Compare;
import com.example.project_mt23.topic_1_07.generics.Generics;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.text_view);
        StringBuffer out = new StringBuffer();
        Hierarchy.testHierarchy(out);
        Arrays.testArrays(out);
        Equation.testEquation(out);
        Generics.testGenerics(out);
        Collections.testCollections(out);
        Compare.testComparable(out);
        Compare.testComparator(out);
        textView.setText(out);
    }
}
