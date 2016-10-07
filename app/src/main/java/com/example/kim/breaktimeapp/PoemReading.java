package com.example.kim.breaktimeapp;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class PoemReading extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem_reading);

        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);

        TabHost.TabSpec tab1 = tabHost.newTabSpec("POEM1");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("POEM2");
        TabHost.TabSpec tab3 = tabHost.newTabSpec("POEM3");

        TabHost.TabSpec tab4 = tabHost.newTabSpec("POEM4");
        TabHost.TabSpec tab5 = tabHost.newTabSpec("POEM5");

        tab1.setIndicator("POEM1");
        tab1.setContent(new Intent(PoemReading.this, Poem1.class));

        tab2.setIndicator("POEM2");
        tab2.setContent(new Intent(PoemReading.this, Poem2.class));

        tab3.setIndicator("POEM3");
        tab3.setContent(new Intent(PoemReading.this, Poem3.class));

        tab4.setIndicator("POEM4");
        tab4.setContent(new Intent(PoemReading.this, Poem4.class));

        tab5.setIndicator("POEM5");
        tab5.setContent(new Intent(PoemReading.this, Poem5.class));

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
        tabHost.addTab(tab4);
        tabHost.addTab(tab5);

    }
}
