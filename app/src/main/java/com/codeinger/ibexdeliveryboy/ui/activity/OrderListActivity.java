package com.codeinger.ibexdeliveryboy.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codeinger.ibexdeliveryboy.R;
import com.codeinger.ibexdeliveryboy.ui.adapter.OrderViewPager;
import com.google.android.material.tabs.TabLayout;

public class OrderListActivity extends AppCompatActivity {

   private TabLayout tabLayout;
   private ViewPager viewPager;
    private Toolbar toolbar;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_list);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewpager);

        viewPager.setAdapter(new OrderViewPager(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OrderListActivity.this,OrderDetailActivity.class));
            }
        });
    }
}
