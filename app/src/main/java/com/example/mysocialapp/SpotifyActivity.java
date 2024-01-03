package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class SpotifyActivity extends AppCompatActivity {

    WebView spotifyweb;
    String url = "https://open.spotify.com/";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spotify);
        spotifyweb = findViewById(R.id.spotifyweb);

        WebSettings settings = spotifyweb.getSettings();
        settings.setJavaScriptEnabled(true);
        spotifyweb.loadUrl(url);
    }
}