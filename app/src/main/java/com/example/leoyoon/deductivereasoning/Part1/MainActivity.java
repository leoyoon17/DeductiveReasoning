package com.example.leoyoon.deductivereasoning.Part1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.leoyoon.deductivereasoning.R;
import com.example.leoyoon.deductivereasoning.Misc.User;

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

    }

    public void toSolve (View view) {
        Intent intent = new Intent (MainActivity.this, preSolveScreen.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user",user);
        intent.putExtras(bundle);

        MainActivity.this.startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        finish();

    }

    public void toAdlerPage (View view) {
        Intent intent = new Intent (MainActivity.this, adlerPage.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user",user);
        intent.putExtras(bundle);

        MainActivity.this.startActivity(intent);

    }

    public void toBakshiPage (View view) {
        Intent intent = new Intent (MainActivity.this, bakshiPage.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user",user);
        intent.putExtras(bundle);

        MainActivity.this.startActivity(intent);

    }

    public void toBasilPage (View view) {
        Intent intent = new Intent (MainActivity.this, basilPage.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user",user);
        intent.putExtras(bundle);

        MainActivity.this.startActivity(intent);

    }

    public void toKudoPage (View view) {
        Intent intent = new Intent (MainActivity.this, kudoPage.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user",user);
        intent.putExtras(bundle);

        MainActivity.this.startActivity(intent);

    }
}
