package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class TelegramActivity extends AppCompatActivity {

    WebView telegramweb;
    String url = "https://web.telegram.org/";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telegram);
        telegramweb = findViewById(R.id.telegramweb);

        WebSettings settings = telegramweb.getSettings();
        settings.setJavaScriptEnabled(true);
        telegramweb.loadUrl(url);
    }
}