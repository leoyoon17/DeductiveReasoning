package com.example.leoyoon.deductivereasoning.Part1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.leoyoon.deductivereasoning.Misc.User;
import com.example.leoyoon.deductivereasoning.R;

public class preSolveScreen extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 2500;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_solve_screen);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        user = (User)bundle.getSerializable("user");

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent = new Intent(preSolveScreen.this, Solve.class);

                Bundle bundle = new Bundle();
                bundle.putSerializable("user", user);
                intent.putExtras(bundle);

                preSolveScreen.this.startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                preSolveScreen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
