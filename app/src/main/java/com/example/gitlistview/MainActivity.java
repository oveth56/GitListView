package com.example.gitlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listview;
    private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView) findViewById(R.id.listview);

        names = new ArrayList<String>();
        names.add("Pera");
        names.add("Manzana");
        names.add("Uva");
        names.add("Fresa");
        names.add("Piña");

        /*
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        listview.setAdapter(adapter);
        */

        MyAdapter myAdapter = new MyAdapter(this, R.layout.list_item, names);
        listview.setAdapter(myAdapter);}
     }

