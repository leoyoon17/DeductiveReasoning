package com.example.leoyoon.deductivereasoning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Briefing2 extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_briefing2);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        user = (User)bundle.getSerializable("user");

        String godSpeed = "God speed Agent";

        String briefingEnd = String.format("%s %s%s",godSpeed, user.getUserLastName(),",");

        TextView briefingEndView = (TextView)findViewById(R.id.godSpeed);
        briefingEndView.setText(briefingEnd);

    }

    public void goBack(View view){
        Intent intent = new Intent (Briefing2.this, Briefing1.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user", user);
        intent.putExtras(bundle);

        Briefing2.this.startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        finish();
    }

    public void toMainActivity (View view) {
        Intent intent = new Intent (Briefing2.this, MainActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user", user);
        intent.putExtras(bundle);

        Briefing2.this.startActivity(intent);
        finish();
    }
}

