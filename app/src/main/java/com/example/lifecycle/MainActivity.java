package com.example.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnLifeCycle;

    private View.OnClickListener onLifeCycleAction;

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CheckLifeCycle", "MainActivity onStart()");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("CheckLifeCycle", "MainActivity onCreate()");
        initViews();
        initListeners();
        bindListeners();
    }

    private void initViews() {
        mBtnLifeCycle = findViewById(R.id.btn_main_lifecycle);
    }

    private void initListeners() {
        onLifeCycleAction = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        };
    }

    private void bindListeners() {
        mBtnLifeCycle.setOnClickListener(onLifeCycleAction);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CheckLifeCycle", "MainActivity onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CheckLifeCycle", "MainActivity onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CheckLifeCycle", "MainActivity onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CheckLifeCycle", "MainActivity onDestroy()");
    }
}
