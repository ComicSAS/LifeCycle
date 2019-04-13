package com.example.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CheckLifeCycle", "SecondaryActivity onStart()");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("CheckLifeCycle", "SecondaryActivity onCreate()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CheckLifeCycle", "SecondaryActivity onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CheckLifeCycle", "SecondaryActivity onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CheckLifeCycle", "SecondaryActivity onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CheckLifeCycle", "SecondaryActivity onDestroy()");
    }
}
