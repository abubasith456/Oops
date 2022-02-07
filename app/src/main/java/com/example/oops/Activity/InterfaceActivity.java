package com.example.oops.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.oops.Interafce.Human;
import com.example.oops.R;
import com.example.oops.databinding.ActivityInterfaceBinding;

public class InterfaceActivity extends AppCompatActivity {

    private ActivityInterfaceBinding activityInterfaceBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_interface);
        activityInterfaceBinding = DataBindingUtil.setContentView(this, R.layout.activity_interface);
        activityInterfaceBinding.buttonCheckLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Human human = new Human();
                human.print();
            }
        });
    }
}