package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mylibrary.OtherActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private static final int REQUESTCODE = 101;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    @Override
    public void onClick(View v){
        Intent intent = new Intent(this,OtherActivity.class);
        startActivity(intent);
    }

    private void initView(){
        textView = findViewById(R.id.txtView);
        textView.setOnClickListener(this);
    }
}