package com.example.oops.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.oops.R;
import com.example.oops.databinding.ActivityOopsBinding;

public class OopsActivity extends AppCompatActivity {

    private ActivityOopsBinding activityOopsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_oops);
        activityOopsBinding = DataBindingUtil.setContentView(this, R.layout.activity_oops);
        activityOopsBinding.buttonOverload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OopsActivity.this, OverloadingActivity.class);
                startActivity(intent);
            }
        });

        activityOopsBinding.buttonOverride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OopsActivity.this, OverridingActivity.class);
                startActivity(intent);
            }
        });

        activityOopsBinding
                .buttonAbstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OopsActivity.this, AbstractActivity.class);
                startActivity(intent);
            }
        });

        activityOopsBinding.buttonInterFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OopsActivity.this, InterfaceActivity.class);
                startActivity(intent);
            }
        });

        activityOopsBinding.buttonEncaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OopsActivity.this, EncapsActivity.class);
                startActivity(intent);
            }
        });

        activityOopsBinding.buttonException.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OopsActivity.this, ExceptionHandleActivity.class);
                startActivity(intent);
            }
        });
    }
}