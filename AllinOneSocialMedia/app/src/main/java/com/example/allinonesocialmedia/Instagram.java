package com.example.allinonesocialmedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Instagram extends AppCompatActivity {
    public WebView mywebview2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);
        mywebview2=(WebView)findViewById(R.id.wv2);
        WebSettings webSettings=mywebview2.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebview2.loadUrl("https://www.instagram.com");
        mywebview2.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if(mywebview2.canGoBack())  {
            mywebview2.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}
