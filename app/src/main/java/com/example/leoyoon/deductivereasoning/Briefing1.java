package com.example.leoyoon.deductivereasoning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Briefing1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_briefing1);
    }
    public void nextBriefingPage (View view){
        Intent intent = new Intent(Briefing1.this, Briefing2.class);
        Briefing1.this.startActivity(intent);
        finish();
    }
}
