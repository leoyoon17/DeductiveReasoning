package com.example.leoyoon.deductivereasoning.Part1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.leoyoon.deductivereasoning.R;

import org.w3c.dom.Text;

public class kudoPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kudo_page);

        String statement = "\tWhat a strange assignment... a child as a witness..." +
                " Oddities aside, Kudo states that he received an invitation to the gala" +
                " and was ecstactic visiting the museum of his hero. He also mentioned that" +
                " the letter came with a sheet of paper containing a series of stick figures." +
                " I should probably check it out in the 'Clues' section. \n" +
                "\tCute kid... \n" +
                "\tBut I get" +
                " a feeling that he's more than meets the eye.";

        TextView statementView = (TextView)findViewById(R.id.statementView);
        statementView.setText(statement);
    }

    public void back (View view) {
        finish();
    }
}
