package com.example.leoyoon.deductivereasoning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import static com.example.leoyoon.deductivereasoning.R.string.briefing1;

public class Briefing1 extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_briefing1);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        user = (User)bundle.getSerializable("user");


        String briefing1 = getResources().getString(R.string.briefing1);
        String briefing1_2 = getResources().getString(R.string.briefing1_2);

        String briefingString = String.format("%s %s %s",briefing1, user.getUserLastName(), briefing1_2);

        TextView briefing = (TextView)findViewById(R.id.briefingView1);
        briefing.setText(briefingString);
        briefing.setMovementMethod(new ScrollingMovementMethod());
    }
    public void nextBriefingPage (View view){

        Intent intent = new Intent(Briefing1.this, Briefing2.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user", user);
        intent.putExtras(bundle);

        Briefing1.this.startActivity(intent);
    }

    public void skipBriefing (View view) {

        Intent intent = new Intent(Briefing1.this, MainActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user", user);
        intent.putExtras(bundle);

        Briefing1.this.startActivity(intent);
        finish();
    }
}
