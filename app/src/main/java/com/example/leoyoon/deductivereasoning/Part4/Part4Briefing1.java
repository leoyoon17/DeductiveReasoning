package com.example.leoyoon.deductivereasoning.Part4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.leoyoon.deductivereasoning.Misc.User;
import com.example.leoyoon.deductivereasoning.Part2.Part2Briefing1;
import com.example.leoyoon.deductivereasoning.R;

public class Part4Briefing1 extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part4_briefing1);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        user = (User)bundle.getSerializable("user");

        String briefing1 = "\tYou come to the door of the house which reads, 221 B Baker Street, only to be interrupted by another call." +
                " “I’m surprised you made it all the way here! Please come in!” said the mysterious voice. “But before you enter," +
                " I’m afraid I have one more riddle for you.” Your heart sinks and the voice continues\n\n" +
                "\t \t \t \t\n“As I was going to St. Ives,\n" +
                "\t \t \t \t\n I met a man with seven wives,\n" +
                "\t \t \t \t\n Each wife had seven sacks,\n" +
                "\t \t \t \t\n Each sack had seven cats,\n" +
                "\t \t \t \t\n Each cat had seven kits:\n" +
                "\t \t \t \t\n Kits, cats, sacks, and wives,\n" +
                "\t \t \t \t\n How many were there going to St. Ives?”\n" +
                "\t \n“Enter the answer to the key code on the door, enter the wrong number and die.” the voice concludes.";

        TextView briefing = (TextView)findViewById(R.id.textView1);
        briefing.setText(briefing1);

    }

    public void nextBriefingPage (View view) {
        Intent intent = new Intent(Part4Briefing1.this, Part4.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user", user);
        intent.putExtras(bundle);

        Part4Briefing1.this.startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        finish();
    }
}
