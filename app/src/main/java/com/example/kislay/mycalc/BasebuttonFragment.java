package com.example.kislay.mycalc;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class BasebuttonFragment extends Fragment {







    public BasebuttonFragment() {
        // Required empty public constructor
    }
    private String display_item = "";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_basebutton, container, false);

        final TextView textView ;
       textView=(TextView)rootview.findViewById(R.id.diplay_text);
        Button button1, button2,button3, button4,button5, button6,button7, button8,button9, button0,buttonEqual, buttonDot;



        button1 = (Button)rootview.findViewById(R.id.a1);
        button2 = (Button)rootview.findViewById(R.id.a2);
        button3 = (Button)rootview.findViewById(R.id.a3);
        button4 = (Button)rootview.findViewById(R.id.a4);
        button5 = (Button)rootview.findViewById(R.id.a5);
        button6 = (Button)rootview.findViewById(R.id.a6);
        button7 = (Button)rootview.findViewById(R.id.a7);
        button8 = (Button)rootview.findViewById(R.id.a8);
        button9 = (Button)rootview.findViewById(R.id.a9);
        button0 = (Button)rootview.findViewById(R.id.a0);
        buttonEqual = (Button)rootview.findViewById(R.id.aequal);
        buttonDot = (Button)rootview.findViewById(R.id.adot);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display_item += "1";
                textView.setText(display_item);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display_item += "2";
                textView.setText(display_item);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display_item += "3";
                textView.setText(display_item);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display_item += "4";
                textView.setText(display_item);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display_item += "5";
                textView.setText(display_item);

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display_item += "6";
                textView.setText(display_item);

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display_item += "7";
                textView.setText(display_item);

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display_item += "8";
                textView.setText(display_item);

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display_item += "9";
                textView.setText(display_item);

            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display_item += "0";
                textView.setText(display_item);

            }

        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return;


            }
        });




        return rootview;
    }


}
