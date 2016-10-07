package com.example.kim.breaktimeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PoemActivity extends AppCompatActivity {

    Button readBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);

        readBtn = (Button)findViewById(R.id.btnRead);

        readBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PoemActivity.this, PoemReading.class);
                startActivity(intent);
            }
        });
    }
}
