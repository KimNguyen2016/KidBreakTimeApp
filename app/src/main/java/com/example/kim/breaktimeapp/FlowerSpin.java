package com.example.kim.breaktimeapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

/**
 * Created by Kim on 9/27/2016.
 */
public class FlowerSpin extends AppCompatActivity{

    ImageView ivFlower1, ivFlower2, ivFlower3, ivFlower4, ivFlower5;
    Button SpinBtn;
    View bgView;
    Boolean done = false;
    Random ran = new Random();
    Random rndC = new Random();
    int i, color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flowerspinner);

        ivFlower1 = (ImageView)findViewById(R.id.iViewFlower1);
        ivFlower2 = (ImageView)findViewById(R.id.iViewFlower2);
        ivFlower3 = (ImageView)findViewById(R.id.iViewFlower3);
        ivFlower4 = (ImageView)findViewById(R.id.iViewFlower4);
        ivFlower5 = (ImageView)findViewById(R.id.iViewFlower5);
        bgView = (View)findViewById(R.id.spinnerBG);

        SpinBtn = (Button)findViewById(R.id.btnSpin);

        i = ran.nextInt() + 360;
        color = Color.argb(255, rndC.nextInt(256), rndC.nextInt(256), rndC.nextInt(256));

        SpinBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (done) {
                    setBackGroundColors(color);
                    rotateFlower(ran.nextInt() + 360, 0.5f, 1000, ivFlower1);
                    rotateFlower(ran.nextInt() + 360, 0.5f, 3600, ivFlower2);
                    rotateFlower(ran.nextInt() + 360, 0.5f, 1000, ivFlower3);
                    rotateFlower(ran.nextInt() + 360, 0.5f, 3000, ivFlower4);
                    rotateFlower(ran.nextInt() + 360, 0.5f, 1000, ivFlower5);
                    done = false;
                    SpinBtn.setText("SPIN AGAIN");
                }
                else {
                    int color = Color.argb(255, rndC.nextInt(256), rndC.nextInt(256), rndC.nextInt(256));
                    setBackGroundColors(color);

                    rotateFlower(ran.nextInt() + 360, 0.7f, 1000, ivFlower1);
                    rotateFlower(ran.nextInt() + 360, 0.7f, 3600, ivFlower2);
                    rotateFlower(ran.nextInt() + 360, 0.7f, 1000, ivFlower3);
                    rotateFlower(ran.nextInt() + 360, 0.7f, 3600, ivFlower4);
                    rotateFlower(ran.nextInt() + 360, 0.7f, 1000, ivFlower5);
                    done = true;
                    SpinBtn.setText("SPIN");
                }

            }
        });
    }

    public void rotateFlower(int x1, float x2, int x3, ImageView iv){

        RotateAnimation  rotate = new RotateAnimation(x1, 360, RotateAnimation.RELATIVE_TO_SELF, x2,
                                     RotateAnimation.RELATIVE_TO_SELF, x2);

        rotate.setFillAfter(true);
        rotate.setDuration(x3);
        rotate.setInterpolator(new AccelerateInterpolator());
        iv.startAnimation(rotate);
    }

    public void setBackGroundColors(int color){
        ivFlower1.setBackgroundColor(color);
        ivFlower2.setBackgroundColor(color);
        ivFlower3.setBackgroundColor(color);
        bgView.setBackgroundColor(color);
    }

}
