package com.example.uides;

import android.support.v4.view.ViewCompat;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    RecyclerView listView;
    private Adapter adapter;
    Spinner spinner;
    ArrayList<Item> items  = DataProvider.items;
    String selectedCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         spinner = findViewById(R.id.spinner);

        listView = findViewById(R.id.listview1);
        adapter = new Adapter(this,items );
        listView.setAdapter(adapter);

        NestedScrollView nestedScrollView = findViewById(R.id.nestedview);
        nestedScrollView.setOverScrollMode(View.OVER_SCROLL_NEVER);
        ViewCompat.setNestedScrollingEnabled(listView, false);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.cities, android.R.layout.simple_spinner_item);
        ArrayList<CharSequence> newList = new ArrayList<CharSequence>();

        newList.add(adapter2.getItem(0));
        newList.add(adapter2.getItem(1));
        newList.add(adapter2.getItem(2));

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter2);
        spinner.setSelection(0);
        spinner.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
         selectedCity = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
