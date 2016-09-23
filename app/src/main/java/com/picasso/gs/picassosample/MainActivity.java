package com.picasso.gs.picassosample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = (ImageView) findViewById(R.id.image1);
        imageView4 = (ImageView) findViewById(R.id.image4);
        imageView5 = (ImageView) findViewById(R.id.image5);
        imageView6 = (ImageView) findViewById(R.id.image6);
        imageView7 = (ImageView) findViewById(R.id.image7);

        //Load Image
        Picasso.with(this)
                .load("https://cnet4.cbsistatic.com/hub/i/2011/10/27/a66dfbb7-fdc7-11e2-8c7c-d4ae52e62bcc/android-wallpaper5_2560x1600_1.jpg")
                .into(imageView1);

        //With Place Holder
        Picasso.with(this)
                .load("https://cnet4.cbsistatic.com/hub/i/2011/10/27/a66dfbb7-fdc7-11e2-8c7c-d4ae52e62bcc/android-wallpaper5_2560x1600_1.jpg")
                .placeholder(R.mipmap.ic_launcher)
                .into(imageView4);

        //With Resize
        Picasso.with(this)
                .load("http://cdn.bgr.com/2012/11/android-icon.jpg?quality=98&strip=all")
                .resize(100,100)
                .into(imageView5);

        //With Rotate
        Picasso.with(this)
                .load("https://crackberry.com/sites/crackberry.com/files/styles/large/public/topic_images/2013/ANDROID.png?itok=xhm7jaxS")
                .rotate(180)
                .into(imageView6);

        //with Error
        Picasso.with(this)
                .load("www.google.com")
                .error(R.drawable.error)
                .into(imageView7);

    }
}
