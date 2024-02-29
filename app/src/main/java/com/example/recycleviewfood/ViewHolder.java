package com.example.recycleviewfood;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class ViewHolder extends RecyclerView.ViewHolder {

    ImageView foodIcon;
    TextView foodName,foodDescription;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        foodIcon = itemView.findViewById(R.id.Foodicon);
        foodName = itemView.findViewById(R.id.tvFoodname);
        foodDescription = itemView.findViewById(R.id.tvDescription);
    }
}
