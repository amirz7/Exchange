package com.example.arz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private String message = "okeyesh kardam :))";

    private GridView gridView;
    private List<GridItem> items = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        gridView = findViewById(R.id.simpleGridView);
        items.add(new GridItem("ارز دیجیتال",R.drawable.ic_bitcoin));
        items.add(new GridItem("سکه و طلا",R.drawable.ic_coins));
        items.add(new GridItem("ارز",R.drawable.ic_dollor));
        items.add(new GridItem("نمودار طلا",R.drawable.ic_goldchart));
        items.add(new GridItem("نمودار ارز",R.drawable.ic_currencychart));
        items.add(new GridItem("مبدل ارز",R.drawable.ic_exchangecurrency));

        MyAdapter myAdapter = new MyAdapter(this,R.layout.main_gride_view_items,items);
        gridView.setAdapter(myAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                        startActivity(intent);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.nav_send:
                //addSomething();
                Toast.makeText(this, "nav _ send", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                //startSettings();
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}