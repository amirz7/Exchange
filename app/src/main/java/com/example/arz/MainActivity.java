package com.example.arz;

import android.annotation.SuppressLint;
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
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    private GridView gridView;
    private List<GridItem> items = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        gridView = findViewById(R.id.simpleGridView);
        items.add(new GridItem("Gold",R.drawable.bitcoin_icon));
        items.add(new GridItem("price",R.drawable.bitcoin_icon));
        items.add(new GridItem("dollar",R.drawable.bitcoin_icon));
        items.add(new GridItem("apple",R.drawable.bitcoin_icon));
        items.add(new GridItem("android",R.drawable.bitcoin_icon));
        items.add(new GridItem("bye",R.drawable.bitcoin_icon));

        MyAdapter myAdapter = new MyAdapter(this,R.layout.main_gride_view_items,items);
        gridView.setAdapter(myAdapter);
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