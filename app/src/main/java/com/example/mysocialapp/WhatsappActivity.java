package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WhatsappActivity extends AppCompatActivity {
    WebView whatsappweb;

                String url = "https://web.whatsapp.com/";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsapp);

                whatsappweb = findViewById(R.id.whatsappweb);

        WebSettings settings = whatsappweb.getSettings();

        settings.setJavaScriptEnabled(true);
        whatsappweb.loadUrl(url);
    }
}