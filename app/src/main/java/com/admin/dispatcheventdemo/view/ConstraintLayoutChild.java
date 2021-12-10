package com.admin.dispatcheventdemo.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;

import com.admin.dispatcheventdemo.util.Log;
import com.admin.dispatcheventdemo.util.MotionEventUtil;

import android.view.MotionEvent;

public class ConstraintLayoutChild extends ConstraintLayout {
    public String TAG = getClass().getSimpleName() + "---------->";

    public ConstraintLayoutChild(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i(TAG, "dispatchTouchEvent: "+ MotionEventUtil.getMotionEventInfo(ev));
        return super.dispatchTouchEvent(ev);//onInterceptTouchEvent
//        return true;//消费
//        return false;//Activity onTouchEvent
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i(TAG, "onInterceptTouchEvent: "+MotionEventUtil.getMotionEventInfo(ev));
        return super.onInterceptTouchEvent(ev);//View dispatchTouchEvent
//        return true;//this onTouchEvent
//        return false;//View dispatchTouchEvent
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i(TAG, "onTouchEvent: "+MotionEventUtil.getMotionEventInfo(event));
        return super.onTouchEvent(event);//Activity onTouchEvent
//        return true;//消费
//        return false;//Activity onTouchEvent
    }
}
