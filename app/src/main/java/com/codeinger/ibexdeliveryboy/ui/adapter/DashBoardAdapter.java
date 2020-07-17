package com.codeinger.ibexdeliveryboy.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.codeinger.ibexdeliveryboy.R;
import com.codeinger.ibexdeliveryboy.data.model.Home;

import java.util.List;

public class DashBoardAdapter extends RecyclerView.Adapter<DashBoardAdapter.DashBoarViewHolder> {

    List<Home> list;

    public DashBoardAdapter(List<Home> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public DashBoarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.dashboard, parent, false);
        return new DashBoarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DashBoarViewHolder holder, int position) {



        if(position==0){
            if(android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                holder.main.setBackgroundDrawable(ContextCompat.getDrawable(holder.main.getContext(), R.drawable.primery_box_caregory_text) );
            } else {
                holder.main.setBackground(ContextCompat.getDrawable(holder.main.getContext(), R.drawable.primery_box_caregory_text));
            }

            holder.count.setTextColor(holder.count.getContext().getResources().getColor(R.color.white));
            holder.text.setTextColor(holder.count.getContext().getResources().getColor(R.color.white));
            holder.arrow.setColorFilter(holder.count.getContext().getResources().getColor(R.color.white), android.graphics.PorterDuff.Mode.SRC_IN);


        }

        else {
            if(android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                holder.main.setBackgroundDrawable(ContextCompat.getDrawable(holder.main.getContext(), R.drawable.primery_box_stroke_product_detail) );
            } else {
                holder.main.setBackground(ContextCompat.getDrawable(holder.main.getContext(), R.drawable.primery_box_stroke_product_detail));
            }
        }

        holder.text.setText(list.get(position).getTitle());
        holder.count.setText(list.get(position).getCount()+"");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class DashBoarViewHolder extends RecyclerView.ViewHolder {

        LinearLayout main;
        TextView count,text;
        ImageView arrow;

        public DashBoarViewHolder(@NonNull View itemView) {
            super(itemView);

            main = itemView.findViewById(R.id.main);
            count = itemView.findViewById(R.id.count);
            text = itemView.findViewById(R.id.text);
            arrow = itemView.findViewById(R.id.arrow);

        }
    }
}
