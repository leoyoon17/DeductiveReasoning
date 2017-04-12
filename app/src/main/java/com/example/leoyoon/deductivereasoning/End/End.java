package com.example.leoyoon.deductivereasoning.End;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.leoyoon.deductivereasoning.Misc.User;
import com.example.leoyoon.deductivereasoning.Part2.Part2;
import com.example.leoyoon.deductivereasoning.Part2.Part2Briefing1;
import com.example.leoyoon.deductivereasoning.R;

public class End extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        user = (User)bundle.getSerializable("user");

        String briefing1 = "\tThe door creaks behind you as you enter the room. Walking down the main hall, you notice a man sitting comfortably in an old fashion chair. “Did you like my riddles?” asked the man as he calmly stood up. You gasp to find that the face behind the voice belongs to non-other than Sherlock Holmes.\n\n" +
                "\t\tYou question why he would commit such acts of terrorism. “I was bored… and do not worry, that bomb was no more than a plastic box with some wires on it,” replied the man, straighter than an arrow. “But also, I wished to find a new companion now that my dear Watson is busy with his own affairs…” continued Holmes.\n\n" +
                "\t\t“Ah, thank you for this,” as he reached for the deerstalker. “I guess you can think of this cap as a test.”\n\n" +
                "\t\tAs you handed Holmes his cap, he asked “So, Agent ";
        String briefing2 = ", are you ready to join me in my adventures?”\n";

        String briefing = String.format("%s%s%s", briefing1, user.getUserLastName(), briefing2);

        TextView end = (TextView)findViewById(R.id.textView1);
        end.setText(briefing);

    }

    public void endPage (View view) {
        Intent intent = new Intent(End.this, finalPage.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user", user);
        intent.putExtras(bundle);

        End.this.startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        finish();
    }
}
