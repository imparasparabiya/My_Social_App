package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class LinkinActivity extends AppCompatActivity {

    WebView linkinweb;
    String url = "https://in.linkedin.com/";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkin);

        linkinweb = findViewById(R.id.linkinweb);

        WebSettings settings = linkinweb.getSettings();

        settings.setJavaScriptEnabled(true);

        linkinweb.loadUrl(url);
    }
}