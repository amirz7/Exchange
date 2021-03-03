package com.example.arz;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class GoldActivity extends SingleFragmentActivity {


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
        titleList.add("طلا");
        titleList.add("سکه");
        titleList.add("انس جهانی");
        return titleList;
    }
}
