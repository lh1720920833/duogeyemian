package com.ls.qiapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.bt_4)
    void zhuang4 () {
        Intent intent1= new Intent(Main2Activity.this, Main5Activity.class);
        startActivity(intent1);
    }

    @OnClick(R.id.bt_5)
    void zhuang5() {
        Intent intent2 = new Intent(Main2Activity.this, Main6Activity.class);
        startActivity(intent2);
    }
}
