package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class GoogleActivity extends AppCompatActivity {

    WebView googleweb;
        String url = "https://www.google.com/";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);

        googleweb = findViewById(R.id.googleweb);


        googleweb = findViewById(R.id.googleweb);

        WebSettings settings = googleweb.getSettings();
        settings.setJavaScriptEnabled(true);

        googleweb.loadUrl(url);

    }
}