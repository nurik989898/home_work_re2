package com.example.home_work_re2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PeopleAdapter extends RecyclerView.Adapter<People_viewHolder> {
    public ArrayList<String>info = new ArrayList<>();
    public PeopleAdapter(ArrayList<String>info){
        this.info = info;
    }
    @NonNull
    @Override
    public People_viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new People_viewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_people,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull People_viewHolder holder, int position) {
        holder.bind(info.get(position));

    }

    @Override
    public int getItemCount() {
        return info.size();
    }
}
