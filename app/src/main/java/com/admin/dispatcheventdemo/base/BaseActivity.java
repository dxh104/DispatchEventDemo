package com.admin.dispatcheventdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

import com.admin.dispatcheventdemo.util.Log;
import com.admin.dispatcheventdemo.util.MotionEventUtil;

public class BaseActivity extends AppCompatActivity {
    public String TAG = getClass().getSimpleName() + "---------->";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i(TAG, "dispatchTouchEvent: " + MotionEventUtil.getMotionEventInfo(ev));
        return super.dispatchTouchEvent(ev);//--->ViewGroup
//        return false;//消费
//        return true;//消费
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i(TAG, "onTouchEvent: " + MotionEventUtil.getMotionEventInfo(event));
        return super.onTouchEvent(event);
    }

}
