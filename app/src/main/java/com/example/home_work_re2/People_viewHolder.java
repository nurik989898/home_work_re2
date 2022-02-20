package com.example.home_work_re2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class People_viewHolder extends RecyclerView.ViewHolder {
    private TextView text;
    public People_viewHolder(@NonNull View itemView) {
        super(itemView);
        text=itemView.findViewById(R.id.people_textview);
    }

    public void bind(String s) {
        text.setText(s);
    }
}
