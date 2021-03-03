package com.example.arz;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DigitalCurrencyViewHolder extends RecyclerView.ViewHolder {

    public TextView textView,statusView,priceView;

    public DigitalCurrencyViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.titleView);
        statusView = itemView.findViewById(R.id.statusView);
        priceView = itemView.findViewById(R.id.priceView);
    }
}
