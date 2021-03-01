package com.example.arz;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class View_Holder extends RecyclerView.ViewHolder {

    public TextView textView;
    public TextView statusView;
    public TextView priceView;
    public ImageView imageView;

    public View_Holder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.titleView);
        statusView = itemView.findViewById(R.id.statusView);
        priceView = itemView.findViewById(R.id.priceView);
       // imageView = itemView.findViewById(R.id.titleView);
    }

    public void bind(RecyclerItem data, Context context, ItemClickListener clickListener) {
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Animation animShake = AnimationUtils.loadAnimation(context, R.anim.shake);
                v.startAnimation(animShake);
                clickListener.onClick(data);
            }
        });
    }
}
