package com.kankoo.kankoo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistChoose extends AppCompatActivity {
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist_choose);
        button1 = (Button) findViewById(R.id.btnRegist1;
        button1.setOnClickListener(listener);

        button2 = (Button) findViewById(R.id.btnRegist2);
        button2.setOnClickListener(listener);
    }

    Button.OnClickListener listener = new Button.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnRegist1:
                    Intent intent1 = new Intent(RegistChoose.this, RegistActivity1.class);
                    startActivity(intent1);
                    break;

                case R.id.btnRegist2:
                    Intent intent2 = new Intent(RegistChoose.this, RegistActivity2.class);
                    startActivity(intent2);
                    break;
            }
        }
    };}