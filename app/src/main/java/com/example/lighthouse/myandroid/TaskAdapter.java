package com.example.lighthouse.myandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        taskImage.setImageResource(task.getImageId());
        task_start.setText(task.getTask_start());
        task_end.setText(task.getTask_end());
        task_attention.setText(task.getTaks_attention());

        return view;
    }
}
