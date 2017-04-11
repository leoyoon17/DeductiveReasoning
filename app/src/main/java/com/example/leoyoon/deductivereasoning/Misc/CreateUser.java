package com.example.leoyoon.deductivereasoning.Misc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.leoyoon.deductivereasoning.Part1.Briefing1;
import com.example.leoyoon.deductivereasoning.R;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CreateUser extends AppCompatActivity {

    private static final String FILENAME = "file.sav";
    protected User user = new User("","");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);
    }

    public void CreateUser (View view) {
        EditText userFirstNameText = (EditText) findViewById(R.id.userFirstName);
        EditText userLastNameText = (EditText) findViewById(R.id.userLastName);

        String userFirstName = userFirstNameText.getText().toString();
        String userLastName = userLastNameText.getText().toString();

        if(userFirstName.matches("") || userLastName.matches("")) {
            Toast.makeText(this, "Please Enter Agent's Name (Both First and Last)", Toast.LENGTH_SHORT).show();
        }
        else {
            user.setUserFirstName(userFirstName);
            user.setUserLastName(userLastName);
            saveInFile();

            Intent intent = new Intent(CreateUser.this, Briefing1.class);

            Bundle bundle = new Bundle();
            bundle.putSerializable("user", user);
            intent.putExtras(bundle);

            CreateUser.this.startActivity(intent);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            finish();
        }

    }

    private void saveInFile() {
        try {
            FileOutputStream fos = openFileOutput(FILENAME, 0);
            OutputStreamWriter writer = new OutputStreamWriter(fos);
            Gson gson = new Gson();
            gson.toJson(user, writer);
            writer.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
