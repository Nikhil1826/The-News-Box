package com.fasttech.thenewsbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapterCountryActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;
    ArrayList<Country> countryArrayList;
    CountryAdapter adapter;

    void initList(){
        listView = (ListView)findViewById(R.id.listcountry);

        Country c1 = new Country(R.drawable.india,"India");
        Country c2 = new Country(R.drawable.america,"America");
        Country c3 = new Country(R.drawable.england,"England");
        Country c4 = new Country(R.drawable.australia,"Australia");

        countryArrayList =new ArrayList<>();
        countryArrayList.add(c1);
        countryArrayList.add(c2);
        countryArrayList.add(c3);
        countryArrayList.add(c4);

        adapter = new CountryAdapter(this,R.layout.item_country,countryArrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter_country);
        initList();
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(CustomAdapterCountryActivity.this,CustomAdapterChannelsActivity.class);
        switch (i){
            case 0:
                intent.putExtra("KeyN","India");
                break;
            case 1:
                intent.putExtra("KeyN","America");
                break;
            case 2:
                intent.putExtra("KeyN","England");
                break;
            case 3:
                intent.putExtra("KeyN","Australia");
                break;
        }
        startActivity(intent);
    }
}
