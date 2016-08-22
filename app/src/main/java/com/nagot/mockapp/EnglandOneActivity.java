package com.nagot.mockapp;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class EnglandOneActivity extends AppCompatActivity {
    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_england_one);

        ((CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout)).setTitle("England 1");
    }
}
