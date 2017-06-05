package com.gmail.osbornroad.adproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBannerClick(View view) {
        Intent intent = new Intent(this, BannerActivity.class);
        startActivity(intent);
    }

    public void onInterstitialClick(View view) {
        Intent intent = new Intent(this, InterstitialActivity.class);
        startActivity(intent);
    }
}
