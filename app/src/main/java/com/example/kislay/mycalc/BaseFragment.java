package com.example.kislay.mycalc;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class BaseFragment extends Fragment {


    private TextView tv;

    public BaseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_base, container, false);
        tv = (TextView)rootview.findViewById(R.id.display1);
        // Inflate the layout for this fragment





        return rootview;
    }


}
