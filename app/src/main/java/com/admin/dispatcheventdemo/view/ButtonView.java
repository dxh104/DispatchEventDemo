package com.admin.dispatcheventdemo.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;

import com.admin.dispatcheventdemo.util.Log;
import com.admin.dispatcheventdemo.util.MotionEventUtil;

import android.view.MotionEvent;
import android.widget.Button;

@SuppressLint("AppCompatCustomView")
public class ButtonView extends Button {
    public String TAG = getClass().getSimpleName() + "---------->";

    public ButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i(TAG, "dispatchTouchEvent: " + MotionEventUtil.getMotionEventInfo(event));
        return super.dispatchTouchEvent(event);//this onTouchEvent
//        return true;//消费
//        return false;//ViewGroup onTouchEvent
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i(TAG, "onTouchEvent: " + MotionEventUtil.getMotionEventInfo(event));
        return super.onTouchEvent(event);//ViewGroup onTouchEvent
//        return true;//消费
//        return false;//ViewGroup onTouchEvent
    }
}
