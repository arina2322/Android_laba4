package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class StudentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Resources resources = getResources();
        String contentText = resources.getString(R.string.tab1_content);

        TextView textView = new TextView(this);
        textView.setText(contentText);

        setContentView(R.layout.activity_students);
    }
}