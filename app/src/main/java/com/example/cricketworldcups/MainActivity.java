package com.example.cricketworldcups;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Country> a=new ArrayList<>();
        ListView listView=findViewById(R.id.listview);
        a.add(new Country(R.drawable.india,"India",2));
        a.add(new Country(R.drawable.sri,"Sri Lanka",1));
        a.add(new Country(R.drawable.eng,"England",1));
        a.add(new Country(R.drawable.aus,"Australia",5));
        a.add(new Country(R.drawable.west,"West Indies",2));
        CustomAdapter customAdapter=new CustomAdapter(a,getApplicationContext());
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("info",a.get(i).getCountryName());
                Toast.makeText(getApplicationContext(),a.get(i).getCountryName()+" -> "+a.get(i).getNumberOfWorldCups(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}