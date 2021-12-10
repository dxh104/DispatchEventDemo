package com.admin.dispatcheventdemo;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.widget.Button;

import com.admin.dispatcheventdemo.base.BaseActivity;

public class MainActivity extends BaseActivity {

    private ConstraintLayout constraintLayoutRoot;
    private ConstraintLayout constraintLayoutChild;
    private Button btnHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }


    private void initView() {
        constraintLayoutRoot = (ConstraintLayout) findViewById(R.id.constraintLayout_root);
        constraintLayoutChild = (ConstraintLayout) findViewById(R.id.constraintLayout_child);
        btnHello = (Button) findViewById(R.id.btn_hello);
    }
}
