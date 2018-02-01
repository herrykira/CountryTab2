package com.example.kinhangpoon.countrytab2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by KinhangPoon on 30/1/2018.
 */
// get fragments
public class MyAdapter extends FragmentStatePagerAdapter {

    int tabCount; // how many tabs you want

    public MyAdapter(FragmentManager fm, int tabCount){
        super(fm);
        this.tabCount=tabCount;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Tab1 tab1 = new Tab1();
                return tab1;
            case 1:
                Tab2 tab2 = new Tab2();
                return tab2;
            case 2:
                Tab3 tab3 = new Tab3();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
