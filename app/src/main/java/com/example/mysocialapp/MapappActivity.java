package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MapappActivity extends AppCompatActivity {

    WebView mapweb;
    String url = "https://www.google.com/maps";
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapapp);

        mapweb = findViewById(R.id.mapweb);

        WebSettings settings = mapweb.getSettings();
        settings.setJavaScriptEnabled(true);

        mapweb.loadUrl(url);
    }
}