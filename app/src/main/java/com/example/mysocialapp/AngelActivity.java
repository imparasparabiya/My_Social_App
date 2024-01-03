package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class AngelActivity extends AppCompatActivity {

    WebView angelweb;
    String url = "https://www.angelone.in/login/";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angel);

        angelweb = findViewById(R.id.angelweb);
        WebSettings settings = angelweb.getSettings();

        settings.setJavaScriptEnabled(true);
        angelweb.loadUrl(url);
    }
}