package com.example.lighthouse.myandroid;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static com.example.lighthouse.myandroid.R.layout.activity_drivers;
import static com.example.lighthouse.myandroid.R.layout.activity_master;

public class DriversActivity extends AppCompatActivity {
    private List<Task> driver_tasklist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drivers);
        //初始化task_list
        initTask();
        replaceFragment(new DriverFragmentList());

        View driver_list = View.inflate(this,R.layout.driver_list,null);
        //list按钮的点击事件：切换fragment到任务列表界面
        Button btn_list = (Button)findViewById(R.id.list);
        btn_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new DriverFragmentList());
            }
        });

        View driver_task = View.inflate(this,R.layout.driver_task,null);
        //task按钮的点击事件：切换fragment到发布任务界面
        Button btn_task = (Button)findViewById(R.id.task);
        btn_task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new DriverFragmentTask());
            }
        });

        View driver_me = View.inflate(this,R.layout.driver_me,null);
        //me按钮的点击事件：切换fragment到我的界面
        Button btn_me = (Button)findViewById(R.id.me);
        btn_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new DriverFragmentMe());
            }
        });

        //设置task_list适配器
        TaskAdapter adapter = new TaskAdapter(DriversActivity.this, activity_drivers,driver_tasklist);
        ListView task_list = (ListView)findViewById(R.id.master_task_list);
        task_list.setAdapter(adapter);
    }

    public void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.driver_framelayout,fragment);
        transaction.commit();
    }

    public void initTask(){
        Task one = new Task(R.drawable.logo,"刘安镇","江山市","明天8点前送到");
        driver_tasklist.add(one);

        Task two = new Task(R.drawable.logo,"一里县","江山市","尽量少颠簸");
        driver_tasklist.add(two);

        Task three = new Task(R.drawable.logo,"青山镇","江山市","尽量少颠簸");
        driver_tasklist.add(three);

        Task four = new Task(R.drawable.logo,"蒋家村","龙游市","尽量少颠簸");
        driver_tasklist.add(four);

        Task five = new Task(R.drawable.logo,"五里县","江山市","尽量少颠簸");
        driver_tasklist.add(five);

        Task six = new Task(R.drawable.logo,"六合县","江山市","尽量少颠簸");
        driver_tasklist.add(one);

        Task seven = new Task(R.drawable.logo,"七横镇","江山市","尽量少颠簸");
        driver_tasklist.add(one);
    }
}
