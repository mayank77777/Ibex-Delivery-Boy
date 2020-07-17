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
import com.codeinger.ibexdeliveryboy.ui.adapter.NotificationAdapter;

public class OrderNotificationActivity extends AppCompatActivity {

    private RecyclerView today,yesterday,lastweek;
    private Toolbar toolbar;
    private Button next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_notification);

        today = findViewById(R.id.today);
        today.setLayoutManager(new LinearLayoutManager(this));
        today.setAdapter(new NotificationAdapter(Utils.getList()));


        yesterday = findViewById(R.id.yesterday);
        yesterday.setLayoutManager(new LinearLayoutManager(this));
        yesterday.setAdapter(new NotificationAdapter(Utils.getList()));

        lastweek = findViewById(R.id.last_week);
        lastweek.setLayoutManager(new LinearLayoutManager(this));
        lastweek.setAdapter(new NotificationAdapter(Utils.getList()));

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OrderNotificationActivity.this,OrderListActivity.class));
            }
        });
    }
}
