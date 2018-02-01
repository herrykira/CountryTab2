package com.example.kinhangpoon.countrytab2;


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

public class ChildTab2 extends Fragment {
    String[] populations={"21.5 million","21.75 million","681,170"};
    TextView population;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.childtab2,container,false);

        population = view.findViewById(R.id.populationshow);

        int num = getArguments().getInt("index");

        population.setText(populations[num]);


        return view;
    }
}
