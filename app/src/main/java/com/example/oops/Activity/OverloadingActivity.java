package com.example.oops.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.oops.Customer;
import com.example.oops.R;
import com.example.oops.databinding.ActivityMainBinding;

public class OverloadingActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private Customer customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = activityMainBinding.editTextName.getText().toString();
                String email = activityMainBinding.editTextEmail.getText().toString();
                String password = activityMainBinding.editTextPassword.getText().toString();

                customer = new Customer();

                if (email.equals("") || email.isEmpty()) {
                    customer.form(name, password);
                } else {
                    customer.form(name, email, password);
                }
            }
        });


    }
}