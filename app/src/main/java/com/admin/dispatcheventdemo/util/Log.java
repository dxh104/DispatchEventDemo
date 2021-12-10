package com.admin.dispatcheventdemo.util;

public class Log {
    public static void i(String TAG, String message) {
        android.util.Log.i(System.currentTimeMillis()+" "+TAG, message);
    }
}
