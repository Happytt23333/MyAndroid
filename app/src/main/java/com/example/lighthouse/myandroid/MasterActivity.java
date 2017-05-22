package com.example.lighthouse.myandroid;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static com.example.lighthouse.myandroid.R.layout.activity_master;
import static com.example.lighthouse.myandroid.R.layout.fragment_three;

public class MasterActivity extends AppCompatActivity {
    private List<Task> task_list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);
        //初始化task_list
        initTask();
        replaceFragment(new FragmentOne());

        View view_list = View.inflate(this,R.layout.fragment_three,null);
        //list按钮的点击事件：切换fragment到任务列表界面
        Button btn_list = (Button)findViewById(R.id.list);
        btn_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new FragmentThree());
            }
        });

        View view_task = View.inflate(this,R.layout.fragment_one,null);
        //task按钮的点击事件：切换fragment到发布任务界面
        Button btn_task = (Button)findViewById(R.id.task);
        btn_task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new FragmentOne());
            }
        });

        View _view_me = View.inflate(this,R.layout.fragment_two,null);
        //me按钮的点击事件：切换fragment到我的界面
        Button btn_me = (Button)findViewById(R.id.me);
        btn_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new FragmentTwo());
            }
        });

        //设置task_list适配器
        TaskAdapter adapter = new TaskAdapter(MasterActivity.this, activity_master,task_list);
        ListView task_list = (ListView)findViewById(R.id.master_task_list);
        task_list.setAdapter(adapter);

        EditText master_start = (EditText)findViewById(R.id.master_startedit);
        EditText master_destination = (EditText)findViewById(R.id.master_destinationedit);
        EditText master_attention = (EditText)findViewById(R.id.master_attentionEdit);

        ImageView taskedit = (ImageView)findViewById(R.id.master_carstyle);
        taskedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MasterActivity.this,TaskEdit.class);
                startActivity(intent);
            }
        });
    }

    public void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.master_framelayout,fragment);
        transaction.commit();
    }

    public void initTask(){
        Task one = new Task(R.drawable.logo,"刘安镇","江山市","明天8点前送到","小货车","小件","定金支付");
        task_list.add(one);

        Task two = new Task(R.drawable.logo,"一里县","江山市","尽量少颠簸","小货车","中件","货到付款");
        task_list.add(two);

        Task three = new Task(R.drawable.logo,"青山镇","江山市","尽量少颠簸","大货车","大件","定金支付");
        task_list.add(three);

        Task four = new Task(R.drawable.logo,"蒋家村","龙游市","尽量少颠簸","中货车","中件","定金支付");
        task_list.add(four);

        Task five = new Task(R.drawable.logo,"五里县","江山市","尽量少颠簸","大货车","大件","货到付款");
        task_list.add(five);

        Task six = new Task(R.drawable.logo,"六合县","江山市","尽量少颠簸","小货车","中件","货到付款");
        task_list.add(one);

        Task seven = new Task(R.drawable.logo,"七横镇","江山市","尽量少颠簸","小货车","小件","定金支付");
        task_list.add(one);
    }
}
