package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class OlxActivity extends AppCompatActivity {

    WebView olxweb;
    String url = "https://www.olx.in/en-in/items/q-login";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olx);
        olxweb = findViewById(R.id.olxweb);

        WebSettings settings = olxweb.getSettings();
        settings.setJavaScriptEnabled(true);
        olxweb.loadUrl(url);
    }
}