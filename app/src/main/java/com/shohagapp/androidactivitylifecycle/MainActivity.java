package com.shohagapp.androidactivitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy Called");
    }

}
