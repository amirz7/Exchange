package com.example.arz;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.List;

public abstract class SingleFragmentActivity extends AppCompatActivity {

    private final String TAG = SecondActivity.class.getSimpleName();
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    public abstract List<Fragment> getFragmentList();
    public abstract List<String> getTitles();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dollar_layout);

        Bundle bundle = getIntent().getExtras();
        String result = bundle.getString("toolbar");

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("نرخ "+result);

        viewPager = findViewById(R.id.viewpager);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),getFragmentList(),getTitles());

        viewPager.setAdapter(viewPagerAdapter);

        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);


    }

    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }

}
