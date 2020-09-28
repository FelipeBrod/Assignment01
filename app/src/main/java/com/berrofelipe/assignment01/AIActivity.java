package com.berrofelipe.assignment01;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AIActivity extends AppCompatActivity {

    private TextView aiView;

    private String lifecycle="AIActivity:\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai);
        aiView = findViewById(R.id.aitextView);

        lifecycle +=getResources().getString(R.string.onCreate);
        aiView.setText(lifecycle);
    }

    @Override
    protected void onStart() {
        super.onStart();
        lifecycle +=getResources().getString(R.string.onStart);
        aiView.setText(lifecycle);
    }

    @Override
    protected void onPause() {
        super.onPause();
        lifecycle +=getResources().getString(R.string.onPause);
        aiView.setText(lifecycle);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lifecycle +=getResources().getString(R.string.onResume);
        aiView.setText(lifecycle);
    }
    @Override
    protected void onStop() {
        super.onStop();
        lifecycle +=getResources().getString(R.string.onStop);
        aiView.setText(lifecycle);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        lifecycle +=getResources().getString(R.string.onDestroy);
        aiView.setText(lifecycle);
    }

}