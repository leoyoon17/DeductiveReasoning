package com.example.leoyoon.deductivereasoning;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.widget.ImageView;

public class Splash extends Activity {

    /** Duration of Wait **/
    private final int SPLASH_DISPLAY_LENGTH = 2000;

    /** Called when the activity is first created **/
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_splash);

        ImageView imageView = (ImageView)findViewById(R.id.sherlockSillouette);
        imageView.setImageResource(R.drawable.sherlock_sillouette);

        /* New Handler to start the Menu-activity
        * and close the splash screen after some seconds */
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                /* Create an Intent that will start the Menu activity */
                Intent mainIntent = new Intent(Splash.this,CreateUser.class);
                Splash.this.startActivity(mainIntent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                Splash.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }
}
