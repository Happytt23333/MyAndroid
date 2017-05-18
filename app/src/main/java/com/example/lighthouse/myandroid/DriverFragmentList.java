package com.example.lighthouse.myandroid;

/**
 * Created by Lighthouse on 2017/5/17.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DriverFragmentList extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.driver_list,container,false);
        return view;
    }
}
