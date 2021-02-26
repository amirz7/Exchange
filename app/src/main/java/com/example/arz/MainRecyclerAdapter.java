package com.example.arz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainRecyclerAdapter extends RecyclerView.Adapter<View_Holder> {

    private List<String> data;
    private Context context;
    private ItemClickListener clickListener;

    public MainRecyclerAdapter(Context context,List<String> data,ItemClickListener clickListener) {
        this.context = context;
        this.data = data;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public View_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.recycler_items_layout,parent,false);

        return new View_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull View_Holder holder, int position) {

        String title = data.get(position);

        holder.textView.setText(title);

        holder.bind(title,clickListener);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
