package com.example.mysocialapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    CircleImageView whatsapp, facebook, google, gmail, discord, github, linkin, insta, map, messenger, pinterest, playstore, snap, spotify, telegram, twitter, youtube, amazon, angel, mytra, olx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        whatsapp = findViewById(R.id.whatsapp);
        facebook = findViewById(R.id.facebook);
        google = findViewById(R.id.google);
        gmail = findViewById(R.id.gmail);
        discord = findViewById(R.id.discord);
        github = findViewById(R.id.github);
        linkin = findViewById(R.id.linkin);
        insta = findViewById(R.id.insta);
        map = findViewById(R.id.map);
        messenger = findViewById(R.id.messager);
        pinterest = findViewById(R.id.pinterest);
        playstore = findViewById(R.id.playstore);
        snap = findViewById(R.id.snap);
        spotify = findViewById(R.id.spotify);
        telegram = findViewById(R.id.telegram);
        twitter = findViewById(R.id.twitter);
        youtube = findViewById(R.id.youtube);
        amazon = findViewById(R.id.amazon);
        angel = findViewById(R.id.angel);
        mytra = findViewById(R.id.mytra);
        olx = findViewById(R.id.olx);

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,WhatsappActivity.class);
                startActivity(intent);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,FacebookActivity.class);
                startActivity(intent);

            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,GoogleActivity.class);
                startActivity(intent);

            }
        });
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,GmailActivity.class);
                startActivity(intent);

            }
        });
        discord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, DiscordActivity.class);
                startActivity(intent);

            }
        });
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,GithubActivity.class);
                startActivity(intent);

            }
        });
        linkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LinkinActivity.class);
                startActivity(intent);

            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,InstaActivity.class);
                startActivity(intent);

            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MapappActivity.class);
                startActivity(intent);

            }
        });
        messenger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MessengerActivity.class);
                startActivity(intent);

            }
        });
        pinterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PinterestActivity.class);
                startActivity(intent);

            }
        });
        playstore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PlayStoreActivity.class);
                startActivity(intent);

            }
        });
        snap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SnapchatActivity.class);
                startActivity(intent);

            }
        });
        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SpotifyActivity.class);
                startActivity(intent);

            }
        });
        telegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TelegramActivity.class);
                startActivity(intent);

            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TwitterActivity.class);
                startActivity(intent);

            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,YoutubeActivity.class);
                startActivity(intent);

            }
        });
        amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AmazonActivity.class);
                startActivity(intent);
            }
        });
        angel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AngelActivity.class);
                startActivity(intent);

            }
        });
        mytra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MytraActivity.class);
                startActivity(intent);

            }
        });
        olx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,OlxActivity.class);
                startActivity(intent);

            }
        });
    }
}