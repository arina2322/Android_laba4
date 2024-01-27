package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ListActivity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TabHost;
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources resources = getResources();

        String tab1Indicator = resources.getString(R.string.tab1_indicator);
        String tab2Indicator = resources.getString(R.string.tab2_indicator);

        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        intent = new Intent().setClass(this, StudentsActivity.class);
        spec = tabHost
                .newTabSpec("students")
                .setIndicator(tab1Indicator)
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, TeacherActivity.class);
        spec = tabHost.newTabSpec("class")
                .setIndicator(tab2Indicator)
                .setContent(intent);
        tabHost.addTab(spec);

        tabHost.setCurrentTab(1);
    }

}