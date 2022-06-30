package com.example.androidopengl;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class OneGlSurfaceView extends GLSurfaceView {


    private OneGlRenderer renderer;
    public OneGlSurfaceView(Context context){
        super(context);
        setEGLContextClientVersion(2);
        renderer =new OneGlRenderer();
        setRenderer(renderer);
    }
}
