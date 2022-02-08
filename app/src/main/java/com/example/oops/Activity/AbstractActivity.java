package com.example.oops.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
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
                try {

                    int value1 = Integer.parseInt(activityAbstractBinding.editTextValue1.getText().toString());
                    int value2 = Integer.parseInt(activityAbstractBinding.editTextValue2.getText().toString());

                    MyClass myClass = new MyClass();
                    myClass.print(value1, value2);

                } catch (Exception exception) {
                    Log.e("Error ==> ", "" + exception);
                }
            }
        });
    }
}