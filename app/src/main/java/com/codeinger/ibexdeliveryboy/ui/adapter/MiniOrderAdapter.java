package com.codeinger.ibexdeliveryboy.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codeinger.ibexdeliveryboy.R;

import java.util.List;

public class MiniOrderAdapter extends RecyclerView.Adapter<MiniOrderAdapter.MiniOrderViewHolder> {

    List<String> list;

    public MiniOrderAdapter(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MiniOrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.mini_order, parent, false);
        return new MiniOrderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MiniOrderViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MiniOrderViewHolder extends RecyclerView.ViewHolder{

        public MiniOrderViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
