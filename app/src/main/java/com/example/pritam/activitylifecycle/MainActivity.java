package com.example.pritam.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Tag","onCreate is called");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Tag","onStart is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Tag","onResume is called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Tag","onRestart is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Tag","onPause is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Tag","onStop is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Tag","onDestroy is called");
    }
}
