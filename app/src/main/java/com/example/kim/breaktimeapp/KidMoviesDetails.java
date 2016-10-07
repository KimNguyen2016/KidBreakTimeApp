package com.example.kim.breaktimeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class KidMoviesDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kid_movies_details);

        Intent intent = getIntent();
        int position = intent.getExtras().getInt("id");

        ImageAdapter adapter = new ImageAdapter(this);

        ImageView imgV = (ImageView) findViewById(R.id.imageSingle);
        TextView tvTitles = (TextView) findViewById(R.id.tvTitle);
        TextView tvNames = (TextView) findViewById(R.id.tvDirector);
        TextView tvContents = (TextView) findViewById(R.id.tvContent);

        imgV.setImageResource(adapter.images[position]);
        tvTitles.setText(adapter.titles[position]);
        tvNames.setText(adapter.names[position]);
        tvContents.setText(adapter.contents[position]);

    }
}
