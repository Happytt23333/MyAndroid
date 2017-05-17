package com.example.lighthouse.myandroid;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lighthouse on 2017/5/15.
 */

public class FragmentThree extends  Fragment{
    private List<Task> task_item = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_three,container,false);
        return view;
    }
}
