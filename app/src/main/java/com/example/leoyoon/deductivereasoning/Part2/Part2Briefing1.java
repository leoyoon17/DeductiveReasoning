package com.example.leoyoon.deductivereasoning.Part2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.leoyoon.deductivereasoning.Misc.User;
import com.example.leoyoon.deductivereasoning.R;

public class Part2Briefing1 extends AppCompatActivity {

    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2_briefing1);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        user = (User)bundle.getSerializable("user");

        String briefing1 = getResources().getString(R.string.briefing2_1);
        String briefing2 = getResources().getString(R.string.briefing2_2);

        String briefingString = String.format("%s %s %s", briefing1, user.getUserFirstName(), briefing2);

        TextView briefing = (TextView)findViewById(R.id.textView1);
        briefing.setText(briefingString);
    }

    public void nextBriefingPage (View view) {
        Intent intent = new Intent(Part2Briefing1.this, Part2.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user", user);
        intent.putExtras(bundle);

        Part2Briefing1.this.startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        finish();
    }
}
