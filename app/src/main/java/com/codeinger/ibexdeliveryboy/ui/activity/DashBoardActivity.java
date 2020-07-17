package com.codeinger.ibexdeliveryboy.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codeinger.ibexdeliveryboy.R;
import com.codeinger.ibexdeliveryboy.data.Utils;
import com.codeinger.ibexdeliveryboy.data.model.Home;
import com.codeinger.ibexdeliveryboy.ui.adapter.DashBoardAdapter;
import com.codeinger.ibexdeliveryboy.util.GridSpacingItemDecoration;
import com.codeinger.ibexdeliveryboy.util.Util;

import java.util.ArrayList;
import java.util.List;


public class DashBoardActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button next;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoardActivity.this,ThankyouActivity.class));
            }
        });

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, Util.dpToPx(this, 16), true));

        recyclerView.setAdapter(new DashBoardAdapter(getList()));

    }

    private List<Home> getList() {
        List<Home> homes = new ArrayList<>();
        homes.add(new Home("Pending",5));
        homes.add(new Home("Delivered",10));
        homes.add(new Home("New order",15));
        homes.add(new Home("Rejected order",5));
        homes.add(new Home("Processing Order",7));
        homes.add(new Home("Completed order",5));
        return homes;
    }
}
