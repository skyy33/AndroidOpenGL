package com.example.androidopengl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        OneGlSurfaceView oneGlSurfaceView =new OneGlSurfaceView(this);
        setContentView(oneGlSurfaceView);
    }
}