package com.example.arz;

import androidx.fragment.app.Fragment;

public class SecondActivity extends SingleFragmentActivity {
    @Override
    public Fragment getFragment() {
        return new CurrencyRateFragment();
    }
}
