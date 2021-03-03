package com.example.arz;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DigitalCurrencyActivity extends AppCompatActivity {

    private DigitalCurrencyRecyclerAdapter adapter;
    private List<DigitalCurrencyModel> digitalCurrencyModels = getItems();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.digital_currency_layout);

        Bundle bundle = getIntent().getExtras();
        String result = bundle.getString("toolbar");

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("نرخ "+result);


        RecyclerView recyclerView = findViewById(R.id.digital_currency_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new DigitalCurrencyRecyclerAdapter(getApplicationContext(),digitalCurrencyModels);
        recyclerView.setAdapter(adapter);

    }


    private List<DigitalCurrencyModel> getItems() {

            ArrayList<DigitalCurrencyModel> recyclerItems = new ArrayList<>();

            recyclerItems.add(new DigitalCurrencyModel(R.drawable.ic_coins,"Bitcoin","245000","1.345"));
            recyclerItems.add(new DigitalCurrencyModel(R.drawable.ic_coins,"atrium","254000","1.345"));
            recyclerItems.add(new DigitalCurrencyModel(R.drawable.ic_coins,"nothing","433222","1.345"));

            return recyclerItems;
        }

}
