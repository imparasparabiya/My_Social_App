package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class YoutubeActivity extends AppCompatActivity {

    WebView youtubeweb;
    String url = "https://www.youtube.com/";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        youtubeweb = findViewById(R.id.youtubeweb);

        WebSettings settings = youtubeweb.getSettings();
        settings.setJavaScriptEnabled(true);
        youtubeweb.loadUrl(url);
    }
}