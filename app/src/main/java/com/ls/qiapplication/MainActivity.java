package com.ls.qiapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.bt_1)
    void zhuang1 (){
        Intent intent1 = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent1);

    } @OnClick(R.id.bt_2)
    void zhuang2 (){
        Intent intent2 = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent2);
    }

    @OnClick(R.id.bt_3)
    void zhuang3() {
        Intent intent3 = new Intent(MainActivity.this, Main4Activity.class);
        startActivity(intent3);
    }
}
