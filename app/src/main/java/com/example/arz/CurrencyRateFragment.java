package com.example.arz;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CurrencyRateFragment extends Fragment implements ItemClickListener {

    private final String TAG = CurrencyRateFragment.class.getSimpleName();
    private RecyclerView mRecyclerView;
    private MainRecyclerAdapter mAdapter;
    private List<RecyclerItem> data = getItems();


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.currency_rate_layout,null,false);

        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        mAdapter = new MainRecyclerAdapter(getContext(),data,this);
        mRecyclerView.setAdapter(mAdapter);


        return view;

    }



    private List<RecyclerItem> getItems() {

        ArrayList<RecyclerItem> recyclerItems = new ArrayList<>();

        recyclerItems.add(new RecyclerItem(R.drawable.ic_coins,"دلار امریکا","بدون تغییر",23540));
        recyclerItems.add(new RecyclerItem(R.drawable.ic_coins,"یورو","بدون تغییر",13000));
        recyclerItems.add(new RecyclerItem(R.drawable.ic_coins,"پوند انگلیس","بدون تغییر",12000));

        return recyclerItems;
    }

    @Override
    public void onClick(RecyclerItem item) {



        String result = item.getTitle() + " : " + item.getPrice();
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, result);
        startActivity(Intent.createChooser(intent, "Share"));



    }
}
