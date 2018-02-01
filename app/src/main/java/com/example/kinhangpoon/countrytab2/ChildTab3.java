package com.example.kinhangpoon.countrytab2;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by KinhangPoon on 31/1/2018.
 */

public class ChildTab3 extends Fragment {
    int[] image_id={R.drawable.thegreatwall,R.drawable.taj,R.drawable.newyork};
    ImageView image;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.childtab3,container,false);

        image = view.findViewById(R.id.famous);

        int num = getArguments().getInt("index");

        image.setImageResource(image_id[num]);


        return view;
    }
}
