package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class DiscordActivity extends AppCompatActivity {

    WebView discordweb;
        String url = "https://discord.com/";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discord);

        discordweb = findViewById(R.id.discordweb);


        WebSettings settings = discordweb.getSettings();
        settings.setJavaScriptEnabled(true);
        discordweb.loadUrl(url);
    }
}