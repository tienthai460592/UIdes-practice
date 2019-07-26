package com.example.uides;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<Item> mItems;
    private Context mContext;

    public Adapter(Context context, List<Item> items) {
        this.mContext = context;
        this.mItems = items;
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View itemView = inflater.inflate(R.layout.listview1, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
//        Item item = mItems.get(position);
        holder.tvName.setText("El Chiringuito");
        holder.description.setText("Ten seasons of culinary satisfaction on Ibiza. Serving honest, great tasting food in a warm, soft and loving environment.");

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvName,description ;
        public ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.name);
            imageView =  itemView.findViewById(R.id.imageView);
            description = itemView.findViewById(R.id.textView11);

        }
    }
}