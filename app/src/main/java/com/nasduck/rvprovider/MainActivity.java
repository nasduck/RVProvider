package com.nasduck.rvprovider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nasduck.rvprovider.RVAnimation.RVAnimationActivity;
import com.nasduck.rvprovider.oreo.OreoActivity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onAnimationClick(View view) {
		Intent intent = new Intent(MainActivity.this, RVAnimationActivity.class);
		startActivity(intent);
	}

	public void onOreoClick(View view) {
		startActivity(new Intent(this, OreoActivity.class));
	}
}
