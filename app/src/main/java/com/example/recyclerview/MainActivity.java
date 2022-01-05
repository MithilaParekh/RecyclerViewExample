package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.invoke.LambdaConversionException;

public class MainActivity extends AppCompatActivity {
RecyclerView subject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subject=(RecyclerView) findViewById(R.id.recyclerView);

        subject.setLayoutManager(new LinearLayoutManager(this));
        String[] sub={"C","JAVA","C++","PYTHON","C","JAVA","C++","PYTHON","C","JAVA","C++","PYTHON"};
        subject.setAdapter(new adapter(sub));
    }
}