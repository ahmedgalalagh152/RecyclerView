package com.example.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {
    Item item;
    ArrayList<Item> items;
    Context context;

    public ItemAdapter(ArrayList<Item> items, Context context) {
        this.items= items;

        this.context = context;
    }

    @NonNull
    @Override
    public ItemAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_row,viewGroup,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.MyViewHolder myViewHolder, int i) {
    item=items.get(i);
    myViewHolder.text1.setText(item.getTitle());
    myViewHolder.text2.setText(item.getDesc());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
public class MyViewHolder extends RecyclerView.ViewHolder{
    TextView text1;
    TextView text2;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        text1=itemView.findViewById(R.id.title);
        text2=itemView.findViewById(R.id.desc);
    }
}
}
