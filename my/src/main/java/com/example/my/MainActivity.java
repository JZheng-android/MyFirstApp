package com.example.my;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.my.CustomAdapter.CustomAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.lv);
        List<String> date = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            date.add("11111"+i);
        }
        CustomAdapter adapter = new CustomAdapter(date,R.layout.activity_main2,this);
        listView.setAdapter(adapter);
    }
}
