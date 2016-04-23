package com.example.project_mt23;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.project_mt23.topic_1_06.arrays.Arrays;
import com.example.project_mt23.topic_1_06.hierarchy.Hierarchy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.text_view);
        StringBuffer out = new StringBuffer();
        Hierarchy.initial();
        Hierarchy.getText(out);
        Arrays.testArrays(out);
        textView.setText(out);
    }
}
