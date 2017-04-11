package com.example.leoyoon.deductivereasoning.Part1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.leoyoon.deductivereasoning.R;

public class Clues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clues);
    }

    public void back (View view) { finish(); }
    public void toCryptograph (View view) {
        Intent intent = new Intent(Clues.this, Cryptograph.class);

        Clues.this.startActivity(intent);
    }
}
