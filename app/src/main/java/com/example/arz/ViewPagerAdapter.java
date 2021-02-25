package com.example.arz;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private List<String> items = getItems();



    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new CurrencyRateFragment();
                break;
            case 1:
                fragment = new CurrencyRateFragment();
                break;
            case 2:
                fragment = new CurrencyRateFragment();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    public ArrayList<String> getItems() {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("apple");
        arrayList.add("google");
        arrayList.add("microsoft");
        return arrayList;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        String title = null;
        if (position == 0)
            title = "صرافی ملی";
        else if (position == 1)
            title = "بازار آزاد";
        else if (position == 2)
            title = "بانک مرکزی";
        return title;
    }
}
