package com.example.lighthouse.myandroid;

/**
 * Created by Lighthouse on 2017/5/17.
 */

public class Task {
    private int imageId;
    private String task_start;
    private String task_end;
    private String task_attention;
    private String task_style;
    private String task_size;
    private String task_paypal;
    public Task(int imageId,String task_start,String task_end,String task_attention,String task_style,
                String task_size,String task_paypal){
        this.imageId = imageId;
        this.task_start = task_start;
        this.task_end = task_end;
        this.task_attention = task_attention;
        this.task_style = task_style;
        this.task_size = task_size;
        this.task_paypal = task_paypal;
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

    public String getTask_style(){return task_style;}

    public String getTask_size(){return task_size;}

    public String getTask_paypal(){return task_paypal;}
}
