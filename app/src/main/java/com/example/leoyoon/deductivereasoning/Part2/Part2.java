package com.example.leoyoon.deductivereasoning.Part2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.leoyoon.deductivereasoning.Misc.User;
import com.example.leoyoon.deductivereasoning.Part3.Part3Briefing1;
import com.example.leoyoon.deductivereasoning.R;

public class Part2 extends AppCompatActivity {

    private User user;

    /* For Wait */
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        user = (User)bundle.getSerializable("user");
    }

    public void clear (View view) {
        EditText bombEditText = (EditText)findViewById(R.id.bombEditText);
        bombEditText.setText("");
    }

    public void check (View view) {
        EditText bombEditText = (EditText)findViewById(R.id.bombEditText);
        String code = bombEditText.getText().toString();
        /* If the number in editText == 229 then continue */
        if (code.matches("229")) {
            bombEditText.setText("...");
            mHandler.postDelayed(new Runnable() {
                public void run() {
                    Intent intent = new Intent(Part2.this, Part3Briefing1.class);

                    Bundle bundle = new Bundle();
                    bundle.putSerializable("user", user);
                    intent.putExtras(bundle);

                    Part2.this.startActivity(intent);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
                }
            }, 2500);


        }
        /* If the number in editText != 229 then game over */
        else {
            bombEditText.setText("...");
            mHandler.postDelayed(new Runnable() {
                public void run() {
                    Intent intent = new Intent(Part2.this, Part2GameOver.class);

                    Bundle bundle = new Bundle();
                    bundle.putSerializable("user", user);
                    intent.putExtras(bundle);

                    Part2.this.startActivity(intent);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
                }
            }, 2500);
        }

    }

    public void toClues (View view) {
        Intent intent = new Intent(Part2.this, Part2Clues.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("user", user);
        intent.putExtras(bundle);

        Part2.this.startActivity(intent);

    }
}
