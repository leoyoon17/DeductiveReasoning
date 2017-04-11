package com.example.leoyoon.deductivereasoning.Part1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.leoyoon.deductivereasoning.R;

public class bakshiPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bakshi_page);

        String statement = "\t Bakshi states that he was enjoying a peaceful day in Calcutta only to have a messenger boy drop off an envelope. He states that the contents of the envelope consisted of an invitation to the gala at the museum and a piece of paper which" +
                "consisted of a bunch of stick figures... \n" +
                "\tThere were no signs of who sent the letter. You can view the document with the stick figures in the 'Clues' section.";

        TextView statementView = (TextView)findViewById(R.id.statementView);
        statementView.setText(statement);
    }

    public void back (View view) {
        finish();
    }
}
