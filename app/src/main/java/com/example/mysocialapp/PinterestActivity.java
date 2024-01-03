package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class PinterestActivity extends AppCompatActivity {

    WebView pinterestweb;
    String url = "https://www.pinterest.ph/login/";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinterest);
        pinterestweb = findViewById(R.id.pinterestweb);

        WebSettings settings = pinterestweb.getSettings();

        settings.setJavaScriptEnabled(true);

        pinterestweb.loadUrl(url);
    }
}