package com.example.leoyoon.deductivereasoning.Part3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.leoyoon.deductivereasoning.R;

import org.w3c.dom.Text;

public class Part3Clues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part3_clues);

        String clues = "\t 1) The Brit lives in the house with red walls" +
                "\n\t 2) The Swede has a dog" +
                "\n\t 3) The Dane drinks tea" +
                "\n\t 4) The house with green walls is directly to the left of the house with white walls" +
                "\n\t 5) The owner of the house with green walls drinks coffee" +
                "\n\t 6) The person who smokes Pall Mall cigars owns a bird" +
                "\n\t 7) The owner of the house with Yellow walls smokes Dunhill cigars" +
                "\n\t 8) The man living in hte center house drinks milk" +
                "\n\t 9) The Norwegian lives in the first house" +
                "\n\t 10) The man who smokes Blends lives next to the cat owner" +
                "\n\t 11) The horse's owner lives next to the man who smokes Dunhill" +
                "\n\t 12) The man who smokes Blue Master drinks Root Beer" +
                "\n\t 13) The Brit smokes Prince" +
                "\n\t 14) The Norwegian lives next to the house with Blue Walls" +
                "\n\t 15) The man who smokes Blends has a next-door neighbor who drinks water.";

        TextView clueView = (TextView)findViewById(R.id.cluesView);
        clueView.setText(clues);
    }

    public void back (View view) {
        finish();
    }


}
