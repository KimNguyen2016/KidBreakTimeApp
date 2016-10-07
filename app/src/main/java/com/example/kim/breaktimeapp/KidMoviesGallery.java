package com.example.kim.breaktimeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class KidMoviesGallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kid_movies_gallery);

        GridView gridV = (GridView) findViewById(R.id.gridView);
        gridV.setAdapter(new ImageAdapter(this));

        gridV.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), KidMoviesDetails.class);
                intent.putExtra("id", position);
                intent.putExtra("title", position);
                intent.putExtra("name", position);
                intent.putExtra("desc", position);
                startActivity(intent);
            }
        });
    }
}
