package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebBackForwardList;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class AmazonActivity extends AppCompatActivity {

    WebView amazonweb;
    String url = "https://www.amazon.in/";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amazon);
        amazonweb = findViewById(R.id.amazonweb);

        WebSettings settings = amazonweb.getSettings();
        settings.setJavaScriptEnabled(true);
        amazonweb.loadUrl(url);
    }
}