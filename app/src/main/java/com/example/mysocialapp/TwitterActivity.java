package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class TwitterActivity extends AppCompatActivity {

    WebView twitterweb;
    String url = "https://twitter.com/login";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);

        twitterweb = findViewById(R.id.twitterweb);
        WebSettings settings = twitterweb.getSettings();
        settings.setJavaScriptEnabled(true);
        twitterweb.loadUrl(url);
    }
}