package com.example.oops.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.oops.Exception;
import com.example.oops.Override.Boy;
import com.example.oops.Override.Human;
import com.example.oops.R;
import com.example.oops.SingleTon;
import com.example.oops.Test;
import com.example.oops.databinding.ActivityOverridingBinding;

public class OverridingActivity extends AppCompatActivity {

    private ActivityOverridingBinding activityOverridingBinding;
    Exception except;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_overriding);
        activityOverridingBinding = DataBindingUtil.setContentView(this, R.layout.activity_overriding);
//        SingleTon.getInstance();
        activityOverridingBinding.buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Boy boy = new Boy();
//                boy.print();

//                SingleTon singleTon = SingleTon.getInstance();
//                singleTon.print();
//                SingleTon.getInstance().print();

//                //Static example
//                Test t1 = new Test();
//                t1.print();
//                Test t2 = new Test();
//                t2.print();
//                Test t3 = new Test();
//                t3.print();
                try {
                    except = new Exception();
                    except.divide();
//                    except.add();
                } catch (java.lang.Exception exception) {
                    Log.e("Error Division ==> ", "" + exception);
//                    except.add();
                }
            }
        });
        activityOverridingBinding.buttonClickSuper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //parent class
                Human human = new Human();
                human.eat();

                //children class
                Human boy = new Boy();
                boy.eat();
            }
        });
    }

}