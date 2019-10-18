package com.tianzhuan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tianzhuan.myapplication.pms.MyContext;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyContext context=new MyContext();
        context.getPackageManager().getPackageInfo(null,0);
    }
}
