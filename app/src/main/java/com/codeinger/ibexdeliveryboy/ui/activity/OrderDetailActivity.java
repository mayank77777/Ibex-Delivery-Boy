package com.codeinger.ibexdeliveryboy.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codeinger.ibexdeliveryboy.R;
import com.codeinger.ibexdeliveryboy.data.Utils;
import com.codeinger.ibexdeliveryboy.ui.adapter.MiniOrderAdapter;

public class OrderDetailActivity extends AppCompatActivity {

    RecyclerView miniOrder;
    private Toolbar toolbar;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);

        miniOrder = findViewById(R.id.recyclerview);
        miniOrder.setLayoutManager(new LinearLayoutManager(this));
        miniOrder.setAdapter(new MiniOrderAdapter(Utils.getList()));

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OrderDetailActivity.this,DashBoardActivity.class));
            }
        });
    }
}
