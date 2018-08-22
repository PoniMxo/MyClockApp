package com.mxolisiponi.myclockapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    }
    public void LoginActivity(View view)
    {
        Intent intent = new Intent(LandingActivity.this, LoginActivity.class);
        startActivity(intent);
    }
    public void RegisterActivity(View view)
    {
        Intent intent = new Intent(LandingActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
}
