package com.example.recycleviewfood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    List<com.example.recycleviewfood.item> item;
    private ItemClickListener mClickListener;

    public Adapter(Context context, List<com.example.recycleviewfood.item> item) {
        this.context = context;
        this.item = item;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(new View(context)).load(item.get(position).getImage()).into(holder.foodIcon);
        com.example.recycleviewfood.item ramen = item.get(position);
        holder.foodName.setText(ramen.getName());
        holder.foodDescription.setText(ramen.getDescription());
    }
    @Override
    public int getItemCount() {
        return item.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView foodIcon;
        TextView foodName, foodDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foodIcon = itemView.findViewById(R.id.Foodicon);
            foodName = itemView.findViewById(R.id.tvNameItem);
            foodDescription = itemView.findViewById(R.id.tvDescriptionItem);

            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            if (mClickListener != null) mClickListener.onItemClick(v, getBindingAdapterPosition());
        }
    }


    item getItem(int id) {
        return item.get(id);
    }
    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}