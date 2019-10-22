package com.ls.qiapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.bt_6)
    void zhuang6(){
        Intent intent = new Intent(Main3Activity.this, Main7Activity.class);
        startActivity(intent);
    }
}
