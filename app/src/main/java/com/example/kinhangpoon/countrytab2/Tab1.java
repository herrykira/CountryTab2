package com.example.kinhangpoon.countrytab2;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by KinhangPoon on 30/1/2018.
 */

public class Tab1 extends Fragment implements TabLayout.OnTabSelectedListener {
    MyInterface myInterface;
    TabLayout t1;
    ViewPager viewPager1;
    MyAdapterNest myAdapterNest;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        myInterface = (MyInterface) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1,container,false);
        t1 = view.findViewById(R.id.tabLayout1);
        viewPager1 = view.findViewById(R.id.pager1);
        t1.addTab(t1.newTab().setText("City"));
        t1.addTab(t1.newTab().setText("Population"));
        t1.addTab(t1.newTab().setText("Famous"));
        t1.setTabGravity(TabLayout.GRAVITY_FILL);
        t1.setOnTabSelectedListener(this);

        myAdapterNest = new MyAdapterNest(getChildFragmentManager(),3,0);

        viewPager1.setAdapter(myAdapterNest);

        viewPager1.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                t1.setScrollPosition(position,0,true);
                t1.setSelected(true);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        return view;
    }


    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager1.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
