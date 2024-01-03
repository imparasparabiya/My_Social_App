package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class SnapchatActivity extends AppCompatActivity {

    WebView snapweb;
    String url = "https://accounts.snapchat.com/accounts/v2/login";
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snapchat);

        snapweb = findViewById(R.id.snapweb);

        WebSettings settings = snapweb.getSettings();
        settings.setJavaScriptEnabled(true);
        snapweb.loadUrl(url);
    }
}