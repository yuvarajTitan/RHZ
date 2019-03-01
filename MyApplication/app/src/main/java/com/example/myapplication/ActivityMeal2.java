package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityMeal2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal2);
    }

    public void buttonChat(View view){
        Intent i = new Intent(ActivityMeal2.this, MainActivity.class);
        startActivity(i);
    }

}