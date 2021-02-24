package com.example.arz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends ArrayAdapter {

    private List<GridItem> itemList = new ArrayList();

    public MyAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        itemList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.main_gride_view_items, null);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        textView.setText(itemList.get(position).getItemTitle());
        imageView.setImageResource(itemList.get(position).getItemImage());
        return view;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }
}
