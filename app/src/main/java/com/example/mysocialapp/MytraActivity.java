package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MytraActivity extends AppCompatActivity {

    WebView mytraweb;
    String url = "https://www.myntra.com/login";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mytra);
        mytraweb = findViewById(R.id.mytraweb);
        WebSettings settings = mytraweb.getSettings();
        settings.setJavaScriptEnabled(true);
        mytraweb.loadUrl(url);
    }
}