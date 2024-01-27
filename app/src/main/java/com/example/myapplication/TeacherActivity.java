package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabWidget;
import android.widget.TextView;
import android.widget.Toast;

public class TeacherActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Resources resources = getResources();
        String[] stations = resources.getStringArray(R.array.stations);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.list_item, stations);
        setListAdapter(arrayAdapter);
        ListView listView = getListView();

        listView.setOnItemClickListener((parent, view, position, id) -> {
            CharSequence text = ((TextView) view).getText();
            int duration = Toast.LENGTH_LONG;
            Context context = getApplicationContext();
            Toast.makeText(context, text, duration).show();
        });

        String contentText = resources.getString(R.string.tab2_content);

        TextView textView = new TextView(this);
        textView.setText(contentText);

        setContentView(R.layout.activity_teacher);
    }
}