package com.example.lighthouse.myandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.textservice.TextInfo;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lighthouse on 2017/5/17.
 */

public class TaskAdapter extends ArrayAdapter<Task> {
    private int resourceId;

    public TaskAdapter(Context context, int textViewResourceId, List<Task> objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Task task = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView taskImage = (ImageView)view.findViewById(R.id.imageView);
        TextView task_start = (TextView)view.findViewById(R.id.task_start);
        TextView task_end = (TextView)view.findViewById(R.id.task_end);
        TextView task_attention = (TextView) view.findViewById(R.id.task_attention);
        TextView task_style = (TextView)view.findViewById(R.id.item_style);
        TextView task_size = (TextView)view.findViewById(R.id.item_size);
        TextView task_paypal = (TextView)view.findViewById(R.id.item_paypal);

        taskImage.setImageResource(task.getImageId());
        task_start.setText(task.getTask_start());
        task_end.setText(task.getTask_end());
        task_attention.setText(task.getTaks_attention());
        task_style.setText(task.getTask_style());
        task_size.setText(task.getTask_size());
        task_paypal.setText(task.getTask_paypal());
        return view;
    }
}
