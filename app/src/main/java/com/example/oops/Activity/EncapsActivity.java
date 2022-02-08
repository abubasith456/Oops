package com.example.oops.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.oops.Model.UserInfo;
import com.example.oops.R;
import com.example.oops.databinding.ActivityEncapsBinding;

public class EncapsActivity extends AppCompatActivity {

    private ActivityEncapsBinding activityEncapsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_encaps);
        activityEncapsBinding = DataBindingUtil.setContentView(this, R.layout.activity_encaps);
        activityEncapsBinding.buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String name = activityEncapsBinding.editTextName.getText().toString();
                    String email = activityEncapsBinding.editTextEmail.getText().toString();

                    UserInfo userInfo = new UserInfo();

                    userInfo.setName(name);
                    userInfo.setEmail(email);

                    activityEncapsBinding.textViewShowName.setText(userInfo.getName());
                    activityEncapsBinding.textViewShowEmail.setText(userInfo.getEmail());

                } catch (Exception exception) {
                    Log.e("Error ==> ", "" + exception);
                }
            }
        });
    }
}