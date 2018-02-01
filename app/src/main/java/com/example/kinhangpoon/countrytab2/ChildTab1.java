package com.example.kinhangpoon.countrytab2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by KinhangPoon on 31/1/2018.
 */


public class ChildTab1 extends Fragment {
    String[] cities={"Beijing","New Delhi","Washington D.C"};
    TextView city;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.childtab1,container,false);

        city = view.findViewById(R.id.cityshow);

        int num = getArguments().getInt("index");

        city.setText(cities[num]);


        return view;
    }
}
