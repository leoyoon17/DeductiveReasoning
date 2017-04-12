package com.example.leoyoon.deductivereasoning.Part1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.example.leoyoon.deductivereasoning.R;
import com.example.leoyoon.deductivereasoning.Misc.User;

public class Briefing1 extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_briefing1);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        user = (User)bundle.getSerializable("user");


        String briefing1 = "Good evening Agent ";
        String briefing1_2 = ", we have a new case that needs your expertise. At approximately 0400 hours, the British National Museum’s anti burglary alarm system went off. The only object that was reported as altered by the museum’s security teams was the Deerstalker cap formerly worm by the legendary detective, Sherlock Holmes. The bureau is unaware of the motives behind this act of vandalism as Holmes fell down Reichenbach Falls along with his nemesis, James Moriarty – although, their bodies were never found at the site of the incident. Through further inspection, we found a note underneath the cap stating,\n" +
                "\n \t \t \t “The Game is Afoot” \n\n" +
                "\tWe managed to gather four witnesses who claim that they may have something of use for this investigation. Your job is to gather clues and bring us one step closer to solving this mystery.";

        String briefingString = String.format("%s%s%s",briefing1, user.getUserLastName(), briefing1_2);

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
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        finish();
    }

    public void skipBriefing (View view) {

        Intent intent = new Intent(Briefing1.this, MainActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user", user);
        intent.putExtras(bundle);

        Briefing1.this.startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        finish();
    }
}
