package com.example.arz;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends SingleFragmentActivity {

    private List<Fragment> fragmentList = getItems();
    private List<String> titles = getItemTitles();

    @Override
    public List<Fragment> getFragmentList() {
        return fragmentList;
    }

    @Override
    public List<String> getTitles() {
        return titles;
    }


    @Override
    public List<Integer> getIcons() {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(R.drawable.ic_coins);
        items.add(R.drawable.ic_coins);
        items.add(R.drawable.ic_coins);
        return items;

    }

    private List<Fragment> getItems() {
        ArrayList<Fragment> arrayList = new ArrayList();
        arrayList.add(new CurrencyRateFragment());
        arrayList.add(new CurrencyRateFragment());
        arrayList.add(new CurrencyRateFragment());
        return arrayList;
    }


    private List<String> getItemTitles() {
        ArrayList<String> titleList = new ArrayList<>();
        titleList.add("صرافی ملی");
        titleList.add("بازار آزاد");
        titleList.add("بانک مرکزی");
        return titleList;

    }


}
