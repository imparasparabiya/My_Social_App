package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class InstaActivity extends AppCompatActivity {

    WebView instaweb;
        String Url = "https://www.instagram.com/accounts/login/";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insta);

        instaweb = findViewById(R.id.instaweb);


        WebSettings settings = instaweb.getSettings();
        settings.setJavaScriptEnabled(true);
        instaweb.loadUrl(Url);
    }
}