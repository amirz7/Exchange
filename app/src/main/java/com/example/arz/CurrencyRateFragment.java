package com.example.arz;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CurrencyRateFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private MainRecyclerAdapter mAdapter;
    private List<String> data = getItems();


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.currency_rate_layout,null,false);

        Log.i(SecondActivity.class.getSimpleName(),"success");

        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        mAdapter = new MainRecyclerAdapter(getContext(),data);
        mRecyclerView.setAdapter(mAdapter);

        Log.i(SecondActivity.class.getSimpleName(),"pass test");


        return view;

    }


    private List<String> getItems() {

        ArrayList<String> items = new ArrayList<>();

        items.add("Apple");
        items.add("google");
        items.add("microsoft");
        items.add("Linux");

        return items;
    }

}
