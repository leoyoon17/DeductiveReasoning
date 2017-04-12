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

        String briefing1 = "\n\tAs you come to the realization that all of the suspects had something to do in the burglary, you receive a phone call.\n\n" +
                "\t\t“Hello, my dear ";
        String briefing2 = "”, spoke the calm, eerie, British voice.\n\n" +
                "\t\tYou remain bewildered in your seat. Then suddenly, you hear a faint beeping sound.\n\n" +
                "\t\tThe voice continues, “You may have noticed by now that I had left a little present underneath your chair.”\n\n" +
                "\t\tYou stand up to check the source of the beeping sound only to be greeted by enough plastic explosives to level all of London.\n\n" +
                "\t\tThe mysterious caller announces, “If you wish not wish to be turned into a fine mist, you are to enter a code consisting of three positive whole numbers in ascending order. So that the second number is greater than or equal to the first and the third is greater than or equal to the second. But since I’m feeling quite generous today, I will bestow upon you, 3 clues to the passcode.”\n\n" +
                "\t\t“The first clue is that the three numbers in the passcode multiply to 36… The second clue is that the sum of the three numbers in the passcode add up to the room number you are in right now. Finally, my last clue is that the largest number in the passcode only appears once.” said the voice.\n\n" +
                "\t\tFinally, the mysterious voice suggests that you do not leave the room you are in to check for the room’s number as the bomb will go off. Any attempts to disarm the bomb without the passcode, the bomb will go off. You try to question the villain’s motives but the voice just responds, “You have one chance to enter the correct passcode or London will be returned to dust. Good luck!”\n\n" +
                "\t\tThe receiver clicks and all you are left with is the dial tone from your phone, the bomb’s heartbeat, and the suffocating atmosphere in the room. Time to crunch some numbers!\n";

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
