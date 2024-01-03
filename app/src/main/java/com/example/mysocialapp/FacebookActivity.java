package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class FacebookActivity extends AppCompatActivity {

    WebView facebookweb;
        String url = "https://www.facebook.com/";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);


        facebookweb = findViewById(R.id.facebookweb);

        WebSettings settings = facebookweb.getSettings();

        settings.setJavaScriptEnabled(true);

        facebookweb.loadUrl(url);

    }
}