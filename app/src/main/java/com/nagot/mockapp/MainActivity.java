package com.nagot.mockapp;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //((CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout)).setTitle("teste");
    }
}
