package com.ls.qiapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.bt_7)
    void zhuang7(){
        Intent intent = new Intent(Main4Activity.this, Main8Activity.class);
        startActivity(intent);

    }
}
