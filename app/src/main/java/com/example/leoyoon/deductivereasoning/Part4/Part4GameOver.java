package com.example.leoyoon.deductivereasoning.Part4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.leoyoon.deductivereasoning.Misc.User;
import com.example.leoyoon.deductivereasoning.R;

public class Part4GameOver extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part3_game_over);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        user = (User)bundle.getSerializable("user");
    }

    public void back (View view) {
        Intent intent = new Intent(Part4GameOver.this, Part4.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user", user);
        intent.putExtras(bundle);

        Part4GameOver.this.startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        finish();
    }
}
