package com.example.recycleviewfood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    List<modelRamen> modelRamenList;
    private ItemClickListener mClickListener;
    ItemClickListener itemClickListener;

    public Adapter(Context context, List<modelRamen> modelRamen) {
        this.context = context;
        this.modelRamenList = modelRamen;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        modelRamen ramen = modelRamenList.get(position);
        holder.foodName.setText(ramen.getName());
        holder.foodDescription.setText(ramen.getDescription());
        holder.foodIcon.setImageResource(ramen.getImage());
    }
    @Override
    public int getItemCount() {
        return modelRamenList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ItemClickListener mClickListener;
        ImageView foodIcon;
        TextView foodName, foodDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foodIcon = itemView.findViewById(R.id.Foodicon);
            foodName = itemView.findViewById(R.id.tvFoodname);
            foodDescription = itemView.findViewById(R.id.tvDescription);

            itemView.setOnClickListener(this);
        }
    @Override
    public void onClick(View v) {
        if (mClickListener != null) mClickListener.onItemClick(v, getAdapterPosition());
    }
}
    modelRamen getItem(int id) {
        return modelRamenList.get(id);
    }
    public void setClickListener(MainActivity mainActivity) {
        this.mClickListener = itemClickListener;
    }
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}







