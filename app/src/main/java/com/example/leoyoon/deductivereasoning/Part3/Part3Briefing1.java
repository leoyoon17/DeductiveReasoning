package com.example.leoyoon.deductivereasoning.Part3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.leoyoon.deductivereasoning.Misc.User;
import com.example.leoyoon.deductivereasoning.R;

public class Part3Briefing1 extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part3_briefing1);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        user = (User)bundle.getSerializable("user");

        String briefing1 = "\t\t You wipe the sweat off your brows as the bomb shuts down and the beeping stops. But, your celebrations are cut short once again as you get another call." +
                "\n" +
                "\n\t\t“Impressive. Quite impressive Agent ";
        String briefing2 = ", I can see why John chose you for the job!” exclaimed the mysterious voice.\n" +
                "" +
                "\n\t\t“But the fun is not over just yet, as I have another gift in which I assume you will be interested in.”\n" +
                "\t\n\t\tThe mysterious man begins, “The location of a second bomb is in a house on Baker Street with five houses which look identical from the outside. If you pick the wrong one, I set off the bomb. If you try anything other than you are told, I set off the bomb. So, it is up to you, the city’s “best” detective to find the bomb.”\n" +
                "\t\n\t\t“You may need some help with this one so here are some clues:\n" +
                "\n1)\tEach house’s owner is of a different nationality, drinks a different beverage and smokes a different type of cigar\n" +
                "\n2)\tEach house’s interior walls are painted a different color\n" +
                "\n3)\tEach house contains a different animal but one has the object you are looking for”\n" +
                "\n\t\t“There should be a list of more clues to help you find the house, underneath the cushion of your seat, this one is a long one so you should get started. And oh, do me a favor and bring the Deerstalker with you!” concluded the voice, and the dial tone began once again. You grab the sheet containing more information and rush to Baker Street.\n";

        String briefingString = String.format("%s%s%s", briefing1, user.getUserLastName(), briefing2);
        TextView briefing = (TextView)findViewById(R.id.textView1);

        briefing.setText(briefingString);

    }

    public void nextBriefingPage (View view) {
        Intent intent = new Intent(Part3Briefing1.this, Part3.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user", user);
        intent.putExtras(bundle);

        Part3Briefing1.this.startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        finish();
    }
}
