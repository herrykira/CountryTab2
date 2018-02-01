package com.example.kinhangpoon.countrytab2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by KinhangPoon on 31/1/2018.
 */

public class MyAdapterNest extends FragmentStatePagerAdapter {
    int tabCount; // how many tabs you want
    int parentTab;

    public MyAdapterNest(FragmentManager fm, int tabCount,int parentTab){
        super(fm);
        this.tabCount=tabCount;
        this.parentTab = parentTab;
    }
    @Override
    public Fragment getItem(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("index",parentTab);
        switch (position) {
            case 0:
                ChildTab1 childTab1 = new ChildTab1();
                childTab1.setArguments(bundle);
                return childTab1;
            case 1:
                ChildTab2 childTab2 = new ChildTab2();
                childTab2.setArguments(bundle);
                return childTab2;
            case 2:
                ChildTab3 childTab3 = new ChildTab3();
                childTab3.setArguments(bundle);
                return childTab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
