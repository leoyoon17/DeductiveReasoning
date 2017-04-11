package com.example.leoyoon.deductivereasoning.Part1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.leoyoon.deductivereasoning.R;

public class basilPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basil_page);

        String statement = "\t Having to converse with a mouse was something that I " +
                " had not imagined during my assignment. Let alone a mouse dressed" +
                " like Sherlock... \n\tAbnormalities aside, the mouse was holed up underneath" +
                " one of the museum's floorboards. It directed me to a piece of paper which" +
                " had a series of stick figures on it... \n" +
                "\tMaybe I should inform security about" +
                " a possible rodent problem that they might have on their hand?... \n" +
                "\tNevermind, " +
                "back to the assignment.";

        TextView statementView = (TextView)findViewById(R.id.statementView);
        statementView.setText(statement);
    }

    public void back (View view) { finish();}
}
