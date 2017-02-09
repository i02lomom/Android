package com.example.mike.conecta4v3;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.mike.conecta4v3.R;

public class Initial extends Activity implements OnClickListener {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initial);
        ImageView img = (ImageView) findViewById(R.id.initial_img);
        img.setOnClickListener(this);
        
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.initial);
        img.startAnimation(animation);
        
        View initial = (View) findViewById(R.id.initial);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.initial2);
        initial.startAnimation(animation2);
        
    }
    public void onClick (View v){
    	startActivity(new Intent("com.example.mike.conecta4v3.MAINACTIVITY"));
    }
    
    /*public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            startActivity(new Intent("com.example.mike.conecta4v3.MAINACTIVITY"));
        }
        return true;
    }*/
}
