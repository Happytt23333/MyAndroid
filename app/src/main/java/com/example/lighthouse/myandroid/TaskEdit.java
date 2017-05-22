package com.example.lighthouse.myandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class TaskEdit extends AppCompatActivity {
    public Button edit_smallcar;
    public Button edit_midcar;
    public Button edit_largecar;

    public Button edit_small;
    public Button edit_middle;
    public Button edit_big;

    public Button edit_pay_before;
    public Button edit_pay_after;
    public Button confirm;

    public EditText taskedit1;
    public EditText taskedit2;
    public EditText taskedit3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taskedit);

        taskedit1 = (EditText)findViewById(R.id.taskedit1);
        taskedit2 = (EditText)findViewById(R.id.taskedit2);
        taskedit3 = (EditText)findViewById(R.id.taskedit3);

        edit_smallcar = (Button) findViewById(R.id.smallcar);
        edit_smallcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String style = edit_smallcar.getText().toString();
                taskedit1.setText(style);
            }
        });
        edit_midcar = (Button) findViewById(R.id.midcar);
        edit_midcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String style = edit_midcar.getText().toString();
                taskedit1.setText(style);
            }
        });
        edit_largecar = (Button) findViewById(R.id.largecar);
        edit_largecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String style = edit_largecar.getText().toString();
                taskedit1.setText(style);
            }
        });

        edit_small = (Button)findViewById(R.id.task_small);
        edit_small.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String size = edit_small.getText().toString();
                taskedit2.setText(size);
            }
        });
        edit_middle = (Button)findViewById(R.id.task_middle);
        edit_middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String size = edit_middle.getText().toString();
                taskedit2.setText(size);
            }
        });
        edit_big = (Button)findViewById(R.id.task_large);
        edit_big.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String size = edit_big.getText().toString();
                taskedit2.setText(size);
            }
        });

        edit_pay_before = (Button)findViewById(R.id.pay_before);
        edit_pay_before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String paypal = edit_pay_before.getText().toString();
                taskedit3.setText(paypal);
            }
        });
        edit_pay_after = (Button)findViewById(R.id.pay_after);
        edit_pay_after.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String paypal = edit_pay_after.getText().toString();
                taskedit3.setText(paypal);
            }
        });

        confirm = (Button)findViewById(R.id.confirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data1 = taskedit1.getText().toString();
                String data2 = taskedit2.getText().toString();
                String data3 = taskedit3.getText().toString();
                Intent intent = new Intent(TaskEdit.this,MasterActivity.class);
                intent.putExtra("style",data1);
                intent.putExtra("size",data2);
                intent.putExtra("paypal",data3);
                startActivity(intent);
            }
        });


    }
}
