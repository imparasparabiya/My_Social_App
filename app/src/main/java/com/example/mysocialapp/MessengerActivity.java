package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MessengerActivity extends AppCompatActivity {

    WebView messangerweb;
    String url = "https://www.messenger.com/";
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messenger);
        messangerweb = findViewById(R.id.messagerweb);
        WebSettings settings = messangerweb.getSettings();

        settings.setJavaScriptEnabled(true);

        messangerweb.loadUrl(url);
    }
}