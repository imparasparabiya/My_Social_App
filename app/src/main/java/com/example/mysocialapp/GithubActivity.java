package com.example.mysocialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class GithubActivity extends AppCompatActivity {

    WebView githubweb;
        String url = "https://github.com/";

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);
        githubweb = findViewById(R.id.githubweb);

        WebSettings settings = githubweb.getSettings();
        settings.setJavaScriptEnabled(true);
        githubweb.loadUrl(url);
    }
}