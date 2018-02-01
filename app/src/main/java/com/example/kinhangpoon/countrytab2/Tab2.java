package com.example.kinhangpoon.countrytab2;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by KinhangPoon on 30/1/2018.
 */

public class Tab2 extends Fragment implements TabLayout.OnTabSelectedListener {
    MyInterface myInterface;
    TabLayout t2;
    ViewPager viewPager2;
    MyAdapterNest myAdapterNest;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        myInterface = (MyInterface) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2,container,false);
        t2 = view.findViewById(R.id.tabLayout2);
        viewPager2 = view.findViewById(R.id.pager2);
        t2.addTab(t2.newTab().setText("City"));
        t2.addTab(t2.newTab().setText("Population"));
        t2.addTab(t2.newTab().setText("Famous"));
        t2.setTabGravity(TabLayout.GRAVITY_FILL);
        t2.setOnTabSelectedListener(this);

        myAdapterNest = new MyAdapterNest(getChildFragmentManager(),3,1);

        viewPager2.setAdapter(myAdapterNest);

        viewPager2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                t2.setScrollPosition(position,0,true);
                t2.setSelected(true);
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
        viewPager2.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }


}
