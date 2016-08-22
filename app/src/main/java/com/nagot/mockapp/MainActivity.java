package com.nagot.mockapp;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview = (ImageView) findViewById(R.id.england1);

        initInstancesDrawer();

        imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = ActivityOptionsCompat.makeSceneTransitionAnimation(
                        MainActivity.this,
                        imageview,
                        imageview.getTransitionName())
                        .toBundle();
                Intent intent = new Intent(MainActivity.this, EnglandOneActivity.class);
                startActivity(intent, bundle);
            }
        });




    }

    private void initInstancesDrawer(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Tab One"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab Two"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab Three"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab Four"));
    }
}
