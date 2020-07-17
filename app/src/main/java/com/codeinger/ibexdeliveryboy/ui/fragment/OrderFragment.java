package com.codeinger.ibexdeliveryboy.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codeinger.ibexdeliveryboy.R;
import com.codeinger.ibexdeliveryboy.data.Utils;
import com.codeinger.ibexdeliveryboy.ui.adapter.OrderAdapter;


public class OrderFragment extends Fragment {

    private View view;
    private RecyclerView recycler_view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_order, container, false);

        recycler_view = view.findViewById(R.id.recycler_view);
        recycler_view.setLayoutManager(new LinearLayoutManager(getContext()));
        recycler_view.setAdapter(new OrderAdapter(Utils.getList()));    

        return view;
    }
}
