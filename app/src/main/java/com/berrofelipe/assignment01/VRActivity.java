package com.berrofelipe.assignment01;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VRActivity extends AppCompatActivity {

    private TextView viewVR;

    private String lifecycle="VRActivity:\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vr);
        viewVR = findViewById(R.id.vrTextView);

        lifecycle += getResources().getString(R.string.onCreate);
        viewVR.setText(lifecycle);

    }

    @Override
    protected void onStart() {
        super.onStart();
        lifecycle +=getResources().getString(R.string.onStart);
        viewVR.setText(lifecycle);
    }

    @Override
    protected void onPause() {
        super.onPause();
        lifecycle +=getResources().getString(R.string.onPause);
        viewVR.setText(lifecycle);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lifecycle +=getResources().getString(R.string.onResume);
        viewVR.setText(lifecycle);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        lifecycle +=getResources().getString(R.string.onDestroy);
        viewVR.setText(lifecycle);
    }

    @Override
    protected void onStop() {
        super.onStop();
        lifecycle +=getResources().getString(R.string.onStop);
        viewVR.setText(lifecycle);

    }

}
