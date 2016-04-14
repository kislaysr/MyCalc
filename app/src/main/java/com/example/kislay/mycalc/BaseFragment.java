package com.example.kislay.mycalc;


import android.location.LocationManager;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BaseFragment extends Fragment {

    private int count = 0;
    private static StringBuffer display_item = new StringBuffer("");
    private String[] array = new String[50];
    String result = " defautResult";
    private TextView textView, finaldislay;
    private Button button;
    private  Button button1, button2,button3, button4,button5, button6,button7, button8,button9, button0,buttonEqual, buttonDot,buttonPlus,buttonMinus,buttonMul,buttonDiv,buttonDel;
    public BaseFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_base, container, false);
        textView = (TextView)rootview.findViewById(R.id.display1);
        finaldislay = (TextView)rootview.findViewById(R.id.display2);
        button = new Button(inflater.getContext());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int id = v.getId();
               switch (id){
                   case R.id.b0:
                       Toast.makeText(inflater.getContext(),"Its working ",Toast.LENGTH_SHORT).show();
                       break;
               }
            }
        });
        // Inflate the layout for this fragment
        button1 = (Button)rootview.findViewById(R.id.b1);
        button2 = (Button)rootview.findViewById(R.id.b2);
        button3 = (Button)rootview.findViewById(R.id.b3);
        button4 = (Button)rootview.findViewById(R.id.b4);
        button5 = (Button)rootview.findViewById(R.id.b5);
        button6 = (Button)rootview.findViewById(R.id.b6);
        button7 = (Button)rootview.findViewById(R.id.b7);
        button8 = (Button)rootview.findViewById(R.id.b8);
        button9 = (Button)rootview.findViewById(R.id.b9);
        button0 = (Button)rootview.findViewById(R.id.b0);
        buttonEqual = (Button)rootview.findViewById(R.id.bequal);
        buttonDot = (Button)rootview.findViewById(R.id.bdot);
        buttonPlus = (Button)rootview.findViewById(R.id.bPlus);
        buttonMinus = (Button)rootview.findViewById(R.id.bMin);
        buttonDiv = (Button)rootview.findViewById(R.id.bDiv);
        buttonMul = (Button)rootview.findViewById(R.id.bMul);
        buttonDel = (Button)rootview.findViewById(R.id.bDel);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                array[count++]= "1";
                display_item .append("1");
                textView.setText(display_item);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                array[count++]= "2";
                display_item.append("2");
                textView.setText(display_item);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                array[count++]= "3";
                display_item.append("3");
                textView.setText(display_item);           }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                array[count++]= "4";
                display_item.append("4");
                textView.setText(display_item);           }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                array[count++]= "5";
                display_item.append("5");
                textView.setText(display_item);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                array[count++]= "6";
                display_item.append("6");
                textView.setText(display_item);           }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                array[count++]= "7";
                display_item.append("7");
                textView.setText(display_item) ;
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                array[count++]= "8";
                display_item.append("8");
                textView.setText(display_item);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                array[count++]= "9";
                display_item.append("9");
                textView.setText(display_item);           }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                array[count++]= "0";
                display_item.append("0");
                textView.setText(display_item);           }

        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                array[count++]= "/";
                display_item.append("/");
                textView.setText(display_item);          }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                array[count++]= "-";
                display_item.append("-");
                textView.setText(display_item) ;         }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                array[count++]= "+";
                display_item.append("+");
                Log.e("disp",display_item.toString());
                textView.setText(display_item.toString()) ;        }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                array[count++]= ".";
                display_item.append(".");
                textView.setText(display_item);          }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                array[count++]= "*";
                display_item.append("*");
                textView.setText(display_item);         }
        });
        buttonDel.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                display_item.delete(0,count+1);
                count = 0;
                textView.setText(display_item);
                return false;
            }
        });
       buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Log.e("DEL on click",Integer.toString(count));
                if(count!=0) {
                    --count;
                    display_item.deleteCharAt(count);
                    textView.setText(display_item);
                }
                else
                    return;
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(inflater.getContext(), "Calculation is done 0", Toast.LENGTH_SHORT).show();
                //call function of calculation class pass array
                Logic2 l = new Logic2();
                result = l.clac();
                finaldislay.setText(result);
            }
        });







        return rootview;
    }
    public String getResult()
    {
        Log.e("array ",display_item.toString());
        StringBuilder builder = new StringBuilder();
        for(String s : array) {
            builder.append(s);
        }
        Log.e("display_item",display_item.toString());
        return display_item.toString();

    }



}