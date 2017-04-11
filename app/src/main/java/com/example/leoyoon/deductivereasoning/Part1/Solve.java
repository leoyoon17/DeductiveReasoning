package com.example.leoyoon.deductivereasoning.Part1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.leoyoon.deductivereasoning.Misc.User;
import com.example.leoyoon.deductivereasoning.Part2.Part2Briefing1;
import com.example.leoyoon.deductivereasoning.R;

public class Solve extends AppCompatActivity {
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        user = (User)bundle.getSerializable("user");
    }

    public void back (View view) {
        finish();
    }

    public void confirm (View view) {
        EditText geniusText = (EditText)findViewById(R.id.geniusEditText);
        EditText philosopherText = (EditText)findViewById(R.id.phiosopherEditText);
        EditText abstractThinkerText = (EditText)findViewById(R.id.abstractThinkerEditText);

        String geniusCheck = geniusText.getText().toString();
        String philosopherCheck = philosopherText.getText().toString();
        String abstractThinkerCheck = abstractThinkerText.getText().toString();

        /* If at least one of the entries are empty, then tell them to fill all of them at once */
        if (geniusCheck.matches("")
                || philosopherCheck.matches("")
                || abstractThinkerCheck.matches("")) {
            Toast.makeText(this, "I think I should solve all three at once...", Toast.LENGTH_SHORT).show();
        }
        /* If everything matches with the answers, then we can continue. */
        else if (geniusCheck.equalsIgnoreCase("genius")
                && philosopherCheck.equalsIgnoreCase("philosopher")
                && abstractThinkerCheck.equalsIgnoreCase("abstract thinker")){

            Intent intent = new Intent(Solve.this, Part2Briefing1.class);

            Bundle bundle = new Bundle();
            bundle.putSerializable("user", user);
            intent.putExtras(bundle);

            Solve.this.startActivity(intent);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            finish();
        }
        /* Anything else, tell them they are wrong */
        else {
            Toast.makeText(this, "I don't think thats what the codes mean... I should try again.", Toast.LENGTH_LONG).show();
        }
    }
}
