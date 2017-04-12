package com.example.leoyoon.deductivereasoning.Part4;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.leoyoon.deductivereasoning.End.End;
import com.example.leoyoon.deductivereasoning.Misc.User;
import com.example.leoyoon.deductivereasoning.Part1.Solve;
import com.example.leoyoon.deductivereasoning.R;

public class Part4 extends AppCompatActivity {

    private User user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part4);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        user = (User)bundle.getSerializable("user");

        TextView code = (TextView)findViewById(R.id.textView5);

        code.setText("");

        Button btn1 = (Button)findViewById(R.id.button1);
        Button btn2 = (Button)findViewById(R.id.button2);
        Button btn3 = (Button)findViewById(R.id.button3);
        Button btn4 = (Button)findViewById(R.id.button4);
        Button btn5 = (Button)findViewById(R.id.button5);
        Button btn6 = (Button)findViewById(R.id.button6);
        Button btn7 = (Button)findViewById(R.id.button7);
        Button btn8 = (Button)findViewById(R.id.button8);
        Button btn9 = (Button)findViewById(R.id.button9);
        Button btn0 = (Button)findViewById(R.id.button0);
        Button checkButton = (Button)findViewById(R.id.checkButton);

        btn1.setBackgroundColor(Color.TRANSPARENT);
        btn2.setBackgroundColor(Color.TRANSPARENT);
        btn3.setBackgroundColor(Color.TRANSPARENT);
        btn4.setBackgroundColor(Color.TRANSPARENT);
        btn5.setBackgroundColor(Color.TRANSPARENT);
        btn6.setBackgroundColor(Color.TRANSPARENT);
        btn7.setBackgroundColor(Color.TRANSPARENT);
        btn8.setBackgroundColor(Color.TRANSPARENT);
        btn9.setBackgroundColor(Color.TRANSPARENT);
        btn0.setBackgroundColor(Color.TRANSPARENT);
        checkButton.setBackgroundColor(Color.TRANSPARENT);



    }


    public void onePressed (View view) {
        TextView code = (TextView)findViewById(R.id.textView5);
        code.append("1");
    }

    public void twoPressed (View view) {
        TextView code = (TextView)findViewById(R.id.textView5);
        code.append("2");
    }

    public void threePressed (View view) {
        TextView code = (TextView)findViewById(R.id.textView5);
        code.append("3");
    }

    public void fourPressed (View view) {
        TextView code = (TextView)findViewById(R.id.textView5);
        code.append("4");
    }

    public void fivePressed (View view) {
        TextView code = (TextView)findViewById(R.id.textView5);
        code.append("5");
    }

    public void sixPressed (View view) {
        TextView code = (TextView)findViewById(R.id.textView5);
        code.append("6");
    }

    public void sevenPressed (View view) {
        TextView code = (TextView)findViewById(R.id.textView5);
        code.append("7");
    }

    public void eightPressed (View view) {
        TextView code = (TextView)findViewById(R.id.textView5);
        code.append("8");
    }

    public void ninePressed (View view) {
        TextView code = (TextView)findViewById(R.id.textView5);
        code.append("9");
    }

    public void zeroPressed (View view) {
        TextView code = (TextView)findViewById(R.id.textView5);
        code.append("0");
    }

    public void check (View view) {
        TextView code = (TextView)findViewById(R.id.textView5);
        String theCode = code.getText().toString();
        Integer codeLength = theCode.length();

        if (theCode.matches("0001")){
            Intent intent = new Intent(Part4.this, End.class);

            Bundle bundle = new Bundle();
            bundle.putSerializable("user", user);
            intent.putExtras(bundle);

            Part4.this.startActivity(intent);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            finish();
        }

        else if (codeLength < 4 ){
            Toast.makeText(this, "Please Enter at least 4 numbers", Toast.LENGTH_LONG).show();
        }

        else if (codeLength.equals(4) && !theCode.matches("0001")){
            Intent intent = new Intent(Part4.this, Part4GameOver.class);

            Bundle bundle = new Bundle();
            bundle.putSerializable("user", user);
            intent.putExtras(bundle);

            Part4.this.startActivity(intent);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            finish();
        }
    }

    public void clear (View view) {
        TextView code = (TextView)findViewById(R.id.textView5);
        code.setText("");
    }

}
