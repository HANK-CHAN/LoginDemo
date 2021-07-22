package com.tw.ch.lcc.hankchan.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        // 執行續 ，設定1秒之後才執行
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WelcomePage.this,MainActivity.class);
                startActivity(intent);  // 跳頁
                finish(); // 將這一頁關閉
            }
        },1000);

    }
}