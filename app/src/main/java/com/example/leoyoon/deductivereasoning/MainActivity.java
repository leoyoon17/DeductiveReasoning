package com.example.leoyoon.deductivereasoning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import it.sephiroth.android.library.imagezoom.ImageViewTouchBase;

import static com.example.leoyoon.deductivereasoning.R.drawable.crime_room;
import static com.example.leoyoon.deductivereasoning.R.id.image;

public class MainActivity extends AppCompatActivity {
    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        user = (User)bundle.getSerializable("user");

     }

    public void toBriefing (View view) {
        Intent intent = new Intent (MainActivity.this, Briefing1.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user", user);
        intent.putExtras(bundle);

        MainActivity.this.startActivity(intent);
        finish();
    }

    public void toClues (View view) {
        Intent intent = new Intent (MainActivity.this, Clues.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user", user);
        intent.putExtras(bundle);

        MainActivity.this.startActivity(intent);
        finish();
    }

    public void toSolve (View view) {
        Intent intent = new Intent (MainActivity.this, Solve.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user",user);
        intent.putExtras(bundle);

        MainActivity.this.startActivity(intent);
        finish();
    }

    public void toAdlerPage (View view) {
        Intent intent = new Intent (MainActivity.this, adlerPage.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user",user);
        intent.putExtras(bundle);

        MainActivity.this.startActivity(intent);
        finish();
    }
}
