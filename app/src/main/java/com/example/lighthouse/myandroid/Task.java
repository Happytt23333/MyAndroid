package com.example.lighthouse.myandroid;

/**
 * Created by Lighthouse on 2017/5/17.
 */

public class Task {
    private int imageId;
    private String task_start;
    private String task_end;
    private String task_attention;

    public Task(int imageId,String task_start,String task_end,String task_attention){
        this.imageId = imageId;
        this.task_start = task_start;
        this.task_end = task_end;
        this.task_attention = task_attention;
    }

    public int getImageId(){
        return imageId;
    }

    public String getTask_start(){
        return task_start;
    }

    public String getTask_end(){
        return task_end;
    }

    public String getTaks_attention(){
        return task_attention;
    }
}
