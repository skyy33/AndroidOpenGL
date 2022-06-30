package com.example.androidopengl;



import android.app.Activity;
import android.graphics.Camera;
import android.graphics.SurfaceTexture;

import android.opengl.GLSurfaceView;
import android.os.Bundle;


public class MainActivity extends Activity  implements SurfaceTexture.OnFrameAvailableListener {



    private  GLSurfaceView mCameraGlSurfaceView;
    private SurfaceTexture mSurfaceTexture;

    public static Camera camera;
    private int camera_status = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        OneGlSurfaceView oneGlSurfaceView =new OneGlSurfaceView(this);
        setContentView(R.layout.activity_main);
        mCameraGlSurfaceView = findViewById(R.id.glsurfaceview);

    }


    @Override
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {

    }
}