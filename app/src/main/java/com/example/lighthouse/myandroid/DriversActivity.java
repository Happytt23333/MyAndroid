package com.example.lighthouse.myandroid;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static com.example.lighthouse.myandroid.R.layout.activity_drivers;
import static com.example.lighthouse.myandroid.R.layout.activity_master;
import static com.example.lighthouse.myandroid.R.layout.driver_list;

public class DriversActivity extends AppCompatActivity {
    private List<Task> driver_tasklist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drivers);

        View driver_title = View.inflate(this,R.layout.activity_title,null);
        View driver_list = View.inflate(this,R.layout.driver_list,null);
        View driver_task = View.inflate(this,R.layout.driver_task,null);
        View driver_me = View.inflate(this,R.layout.driver_me,null);

        TaskAdapter adapter = new TaskAdapter(DriversActivity.this, activity_drivers,driver_tasklist);
        final ListView task_list = (ListView)driver_list.findViewById(R.id.master_task_list);
        task_list.setAdapter(adapter);
        initTask();
        replaceFragment(new DriverFragmentTask());
        //设置task_list适配器
        task_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            }
        });

        //list按钮的点击事件：切换fragment到任务列表界面
        Button btn_list = (Button)driver_title.findViewById(R.id.list);
        btn_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new DriverFragmentList());
            }
        });

        //task按钮的点击事件：切换fragment到发布任务界面
        Button btn_task = (Button)driver_title.findViewById(R.id.task);
        btn_task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new DriverFragmentTask());
            }
        });

        //me按钮的点击事件：切换fragment到我的界面
        Button btn_me = (Button)driver_title.findViewById(R.id.me);
        btn_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new DriverFragmentMe());
            }
        });

        //初始化task_list
        initTask();
        replaceFragment(new DriverFragmentList());
    }

    public void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.driver_framelayout,fragment);
        transaction.commit();
    }

    public void initTask(){
        Task one = new Task(R.drawable.logo,"刘安镇","江山市","明天8点前送到","小货车","小件","定金支付");
        driver_tasklist.add(one);

        Task two = new Task(R.drawable.logo,"一里县","江山市","尽量少颠簸","小货车","中件","货到付款");
        driver_tasklist.add(two);

        Task three = new Task(R.drawable.logo,"青山镇","江山市","尽量少颠簸","大货车","大件","定金支付");
        driver_tasklist.add(three);

        Task four = new Task(R.drawable.logo,"蒋家村","龙游市","尽量少颠簸","中货车","中件","定金支付");
        driver_tasklist.add(four);

        Task five = new Task(R.drawable.logo,"五里县","江山市","尽量少颠簸","大货车","大件","货到付款");
        driver_tasklist.add(five);

        Task six = new Task(R.drawable.logo,"六合县","江山市","尽量少颠簸","小货车","中件","货到付款");
        driver_tasklist.add(one);

        Task seven = new Task(R.drawable.logo,"七横镇","江山市","尽量少颠簸","小货车","小件","定金支付");
        driver_tasklist.add(one);
    }
}
