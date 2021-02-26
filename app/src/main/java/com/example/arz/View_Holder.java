package com.example.arz;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class View_Holder extends RecyclerView.ViewHolder {

    public TextView textView;

    public View_Holder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.titleview);
    }

    public void bind(String data,ItemClickListener clickListener) {
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onClick(data);
            }
        });
    }
}
