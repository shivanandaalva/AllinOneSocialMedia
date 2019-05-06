package com.example.allinonesocialmedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Twitter extends AppCompatActivity {
    public WebView mywebview3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);
        mywebview3=(WebView)findViewById(R.id.wv3);
        WebSettings webSettings=mywebview3.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebview3.loadUrl("https://www.twitter.com");
        mywebview3.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if(mywebview3.canGoBack())  {
            mywebview3.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}

