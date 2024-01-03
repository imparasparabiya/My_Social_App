package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class GmailActivity extends AppCompatActivity {

    WebView gmailweb;
        String url = "https://mail.google.com/";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail);

        gmailweb = findViewById(R.id.gmailweb);


        WebSettings settings = gmailweb.getSettings();
        settings.setJavaScriptEnabled(true);

        gmailweb.loadUrl(url);
    }
}