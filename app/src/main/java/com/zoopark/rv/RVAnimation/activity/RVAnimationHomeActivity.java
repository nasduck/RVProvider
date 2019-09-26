package com.zoopark.rv.RVAnimation.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.zoopark.rvprovider.R;

public class RVAnimationHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv_animation_home);

    }

    public void onFadeAnimClick(View view) {
        Intent intent = new Intent(this, RVAnimationFadeActivity.class);
        startActivity(intent);
    }

    public void onFlipAnimClick(View view) {
        Intent intent = new Intent(this, RVAnimationFlipActivity.class);
        startActivity(intent);
    }

    public void onScaleAnimClick(View view) {
        Intent intent = new Intent(this, RVAnimationScaleActivity.class);
        startActivity(intent);
    }

    public void onTranslationClick(View view) {
        Intent intent = new Intent(this, RVAnimationTranslationActivity.class);
        startActivity(intent);
    }
}