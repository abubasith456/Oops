package com.example.oops.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.oops.Abstract.MyClass;
import com.example.oops.R;
import com.example.oops.databinding.ActivityAbstractBinding;

public class AbstractActivity extends AppCompatActivity {

    private ActivityAbstractBinding activityAbstractBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_abstract);
        activityAbstractBinding = DataBindingUtil.setContentView(this, R.layout.activity_abstract);
        activityAbstractBinding.buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value1=0;
                int value2=0;
                value1 = Integer.parseInt(activityAbstractBinding.editTextValue1.getText().toString());
                value2 = Integer.parseInt(activityAbstractBinding.editTextValue2.getText().toString());

                if (value1==0){
                    Toast.makeText(AbstractActivity.this, "Please enter the value", Toast.LENGTH_SHORT).show();
                }else {
                    MyClass myClass = new MyClass();
                    myClass.print(value1, value2);
                }



            }
        });
    }
}