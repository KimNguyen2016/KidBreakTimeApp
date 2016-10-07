package com.example.kim.breaktimeapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button exitBtn;
    Boolean flag = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exitBtn = (Button) findViewById(R.id.btnExit);

        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exitApp();
            }
        });
    }


    public void startTicTacToeGame(View v){
        flag = true;
        Intent myIntent = new Intent(this, TicTacToeGame.class);
        startActivity(myIntent);

    }

    public void startFlowerSpinner(View v){
        Intent myIntent = new Intent(this, FlowerSpin.class);
        startActivity(myIntent);
    }

    public void startAnimalGallery(View v){
        Intent myIntent = new Intent(this, AnimalGallery.class);
        startActivity(myIntent);
    }

    public void startReadingPoem(View v){
        Intent myIntent = new Intent(this, PoemActivity.class);
        startActivity(myIntent);
    }

    public void startPlayRockPaperScissors(View v){
        Intent myIntent = new Intent(this, RockPaperScissor.class);
        startActivity(myIntent);
    }

    public void startKidMovies(View v){
        Intent myIntent = new Intent(this, KidMoviesGallery.class);
        startActivity(myIntent);
    }
    public void exitApp(){
        System.exit(0);
    }

}
