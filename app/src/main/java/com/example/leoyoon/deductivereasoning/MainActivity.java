package com.example.leoyoon.deductivereasoning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import it.sephiroth.android.library.imagezoom.ImageViewTouchBase;

import static com.example.leoyoon.deductivereasoning.R.drawable.crime_room;
import static com.example.leoyoon.deductivereasoning.R.id.image;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageViewTouch imageViewTouch = (ImageViewTouch)findViewById(R.id.crimeRoomImage);

        imageViewTouch.setDisplayType(ImageViewTouchBase.DisplayType.FIT_TO_SCREEN);
        /*imageViewTouch.setImageResource(crime_room);*/

}
}
