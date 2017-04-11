package com.example.leoyoon.deductivereasoning.Part2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.leoyoon.deductivereasoning.R;

public class Part2Clues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2_clues);

        String clues = "\t 1) The three numbers in the passcode multiply to 36" +
                "\n\n\t 2) The sum of the three numbers in hte passcode add up to the room number you are in right now" +
                "\n\n   \t 3) The largest number in the passcode only appears once";
        TextView clueView = (TextView)findViewById(R.id.clue1View);
        clueView.setText(clues);
    }

    public void back (View view) {finish();}
}

