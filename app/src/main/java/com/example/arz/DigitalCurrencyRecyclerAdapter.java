package com.example.arz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DigitalCurrencyRecyclerAdapter extends RecyclerView.Adapter<DigitalCurrencyViewHolder> {

    private List<DigitalCurrencyModel> digitalCurrencyModelList;
    private Context context;

    public DigitalCurrencyRecyclerAdapter(Context context,List<DigitalCurrencyModel> digitalCurrencyModels) {
        this.context = context;
        this.digitalCurrencyModelList = digitalCurrencyModels;
    }

    @NonNull
    @Override
    public DigitalCurrencyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.digital_currency_recycler_item,parent,false);

        return new DigitalCurrencyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DigitalCurrencyViewHolder holder, int position) {

        DigitalCurrencyModel data = digitalCurrencyModelList.get(position);

        holder.textView.setText(data.getTitle());
        holder.priceView.setText(data.getPrice());


    }


    @Override
    public int getItemCount() {
        return digitalCurrencyModelList.size();
    }
}
