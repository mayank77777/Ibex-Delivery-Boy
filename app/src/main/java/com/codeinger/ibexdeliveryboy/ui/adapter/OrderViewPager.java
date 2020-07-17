package com.codeinger.ibexdeliveryboy.ui.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.codeinger.ibexdeliveryboy.ui.fragment.OrderFragment;

public class OrderViewPager extends FragmentPagerAdapter {

    public OrderViewPager(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return new OrderFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "New";
            case 1:
                return "Accepted";
            case 2:
                return "Processing";
            default:
                return "";
        }
    }
}
