package com.example.leoyoon.deductivereasoning.Part1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.leoyoon.deductivereasoning.R;

public class adlerPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adler_page);

        String statement = "\tAdler states that she received a letter in the mailbox not to long ago, which consisted of an invitation to the gala at the museum and what seems to be a cryptograph..." +
                "What bothers me is that there was no sign of who the sender was... \n" +
                "\tAdler's gaze could burn holes like the sun, quite unsettling and always a mystery... \n" +
                "\tIf you want to look at the cryptograph, you can take a look in the 'Clues' section.";

        TextView statementView = (TextView)findViewById(R.id.statementView);
        statementView.setText(statement);
    }

    public void back (View view ) {
        finish();
    }
}
