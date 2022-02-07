package com.example.oops.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.oops.Boy;
import com.example.oops.Human;
import com.example.oops.R;
import com.example.oops.databinding.ActivityOverridingBinding;

public class OverridingActivity extends AppCompatActivity {

    private ActivityOverridingBinding activityOverridingBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_overriding);
        activityOverridingBinding = DataBindingUtil.setContentView(this, R.layout.activity_overriding);
        activityOverridingBinding.buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boy boy = new Boy();
                boy.print();
            }
        });
        activityOverridingBinding.buttonClickSuper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Human human=new Human();
                human.eat();

                Boy boy = new Boy();
                boy.eat();
            }
        });
    }

}