package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class PlayStoreActivity extends AppCompatActivity {

    WebView playstoreweb;
    String url = "https://play.google.com/store/";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_store);
        playstoreweb = findViewById(R.id.playstoreweb);

        WebSettings settings = playstoreweb.getSettings();

        settings.setJavaScriptEnabled(true);

        playstoreweb.loadUrl(url);
    }
}