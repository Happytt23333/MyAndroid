package com.example.lighthouse.myandroid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by Lighthouse on 2017/5/15.
 */

public class TitleLayout extends LinearLayout {

    public TitleLayout(Context context, AttributeSet attrs){
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.activity_title,this);

        Button list_master = (Button)findViewById(R.id.list);
        list_master.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button task_master = (Button)findViewById(R.id.task);
        task_master.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button me_master = (Button)findViewById(R.id.me);
        me_master.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
