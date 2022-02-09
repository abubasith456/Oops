package com.example.oops.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.oops.R;
import com.example.oops.databinding.ActivityExceptionHandleBinding;

public class ExceptionHandleActivity extends AppCompatActivity{

    ActivityExceptionHandleBinding activityExceptionHandleBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_exception_handle);
        activityExceptionHandleBinding = DataBindingUtil.setContentView(this, R.layout.activity_exception_handle);
        activityExceptionHandleBinding.buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                try {

                    float number1 = Integer.parseInt(activityExceptionHandleBinding.editTextNumber1.getText().toString());
                    float number2 = Integer.parseInt(activityExceptionHandleBinding.editTextNumber2.getText().toString());

                    float number3 = number1 / number2;

//                    throw new ArithmeticException("Throw exception");

                    Log.e("Result ==>", String.valueOf(number3));

                } catch (java.lang.Exception exception) {
                    Log.e("Error ==> ", "" + exception);
                }
//                finally {
//                    activityExceptionHandleBinding.editTextNumber1.setText("");
//                    activityExceptionHandleBinding.editTextNumber2.setText("");
//                }

//                try{
//                    Log.e("Result ==>", "");
//                }finally {
//                    Log.e("Result ==>", "");
//                }
            }
        });
    }
}