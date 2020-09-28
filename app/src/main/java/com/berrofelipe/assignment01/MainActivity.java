package com.berrofelipe.assignment01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
public class MainActivity extends AppCompatActivity {

    String lifecycle = "MainActivity:\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        TopFragment topFragment = new TopFragment();
        BottomFragment bottomFragment = new BottomFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, topFragment,"TopFragment").replace(R.id.fragment2, bottomFragment,"BottomFragment").commit();

        lifecycle +=getResources().getString(R.string.onCreate);


        BottomFragment fragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        if (fragment!=null)
            fragment.update(lifecycle);
    }

    @Override
    protected void onStart() {
        super.onStart();
        lifecycle +=getResources().getString(R.string.onStart);

        BottomFragment fragment = (BottomFragment)getSupportFragmentManager().findFragmentByTag("bottom");
        if (fragment!=null)
            fragment.update(lifecycle);
    }
    @Override
    protected void onPause() {
        super.onPause();
        lifecycle +=getResources().getString(R.string.onPause);

        BottomFragment fragment = (BottomFragment) getSupportFragmentManager().findFragmentByTag("bottom");
        if (fragment!=null)
            fragment.update(lifecycle);
    }
    @Override
    protected void onStop() {
        super.onStop();
        lifecycle +=getResources().getString(R.string.onStop);

        BottomFragment fragment = (BottomFragment) getSupportFragmentManager().findFragmentByTag("bottom");
        if (fragment!=null)
            fragment.update(lifecycle);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lifecycle +=getResources().getString(R.string.onResume);

        BottomFragment fragment = (BottomFragment) getSupportFragmentManager().findFragmentByTag("bottom");
        if (fragment!=null)
            fragment.update(lifecycle);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        lifecycle +=getResources().getString(R.string.onDestroy);

        BottomFragment fragment = (BottomFragment) getSupportFragmentManager().findFragmentByTag("bottom");
        if (fragment!=null)
            fragment.update(lifecycle);
    }
}

