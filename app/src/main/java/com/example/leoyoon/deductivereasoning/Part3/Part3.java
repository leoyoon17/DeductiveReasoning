package com.example.leoyoon.deductivereasoning.Part3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.leoyoon.deductivereasoning.Misc.User;
import com.example.leoyoon.deductivereasoning.Part1.Briefing1;
import com.example.leoyoon.deductivereasoning.Part1.MainActivity;
import com.example.leoyoon.deductivereasoning.Part4.Part4Briefing1;
import com.example.leoyoon.deductivereasoning.R;

public class Part3 extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part3);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        user = (User)bundle.getSerializable("user");
    }

    public void toClues(View view) {
        Intent intent = new Intent(Part3.this, Part3Clues.class);
        Part3.this.startActivity(intent);
    }

    public void toBriefing(View view) {
        Intent intent = new Intent (Part3.this, Part3Briefing1.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user", user);
        intent.putExtras(bundle);

        Part3.this.startActivity(intent);
        finish();
    }

    public void Solve (View view){
        RadioButton rb1 = (RadioButton)findViewById(R.id.rb1);
        RadioButton rb2 = (RadioButton)findViewById(R.id.rb2);
        RadioButton rb3 = (RadioButton)findViewById(R.id.rb3);
        RadioButton rb4 = (RadioButton)findViewById(R.id.rb4);
        RadioButton rb5 = (RadioButton)findViewById(R.id.rb5);

        /* Right answer. Go to Final Part */
        if (rb4.isChecked()) {
            Intent intent = new Intent (Part3.this, Part4Briefing1.class);

            Bundle bundle = new Bundle();
            bundle.putSerializable("user", user);
            intent.putExtras(bundle);

            Part3.this.startActivity(intent);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            finish();

        }
        /* If nothing is checked */
        else if (!rb1.isChecked()
                && !rb2.isChecked()
                && !rb3.isChecked()
                && !rb4.isChecked()
                && !rb5.isChecked()) {
            Toast.makeText(this, "I should probably pick out a house to check out...", Toast.LENGTH_LONG).show();
        }

        /* Anything other than the correct answer, go to game over*/
        else {
            Intent intent = new Intent (Part3.this, Part3GameOver.class);

            Bundle bundle = new Bundle();
            bundle.putSerializable("user", user);
            intent.putExtras(bundle);

            Part3.this.startActivity(intent);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            finish();
        }

    }
}
