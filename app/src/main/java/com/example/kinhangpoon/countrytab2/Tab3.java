package com.example.kinhangpoon.countrytab2;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by KinhangPoon on 30/1/2018.
 */

public class Tab3 extends Fragment implements TabLayout.OnTabSelectedListener{

    MyInterface myInterface;
    TabLayout t3;
    ViewPager viewPager3;
    MyAdapterNest myAdapterNest;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        myInterface = (MyInterface) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3,container,false);
        t3 = view.findViewById(R.id.tabLayout3);
        viewPager3 = view.findViewById(R.id.pager3);
        t3.addTab(t3.newTab().setText("City"));
        t3.addTab(t3.newTab().setText("Population"));
        t3.addTab(t3.newTab().setText("Famous"));
        t3.setTabGravity(TabLayout.GRAVITY_FILL);
        t3.setOnTabSelectedListener(this);

        myAdapterNest = new MyAdapterNest(getChildFragmentManager(),3,2);

        viewPager3.setAdapter(myAdapterNest);

        viewPager3.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                t3.setScrollPosition(position,0,true);
                t3.setSelected(true);
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
        viewPager3.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
