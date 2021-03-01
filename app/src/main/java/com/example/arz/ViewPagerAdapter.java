package com.example.arz;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList;
    private List<String> titles;

    public ViewPagerAdapter(@NonNull FragmentManager fm,List<Fragment> fragmentList,List<String> titles) {
        super(fm);
        this.fragmentList = fragmentList;
        this.titles = titles;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }


    @Override
    public CharSequence getPageTitle(int position)
    {
        return titles.get(position);
    }


}
