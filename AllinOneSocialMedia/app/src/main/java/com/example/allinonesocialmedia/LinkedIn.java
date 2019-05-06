package com.example.allinonesocialmedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LinkedIn extends AppCompatActivity {
private WebView mywebview4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linked_in);
        mywebview4=(WebView)findViewById(R.id.wv4);
        WebSettings webSettings=mywebview4.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebview4.loadUrl("https://www.linkedin.com");
        mywebview4.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if(mywebview4.canGoBack())  {
            mywebview4.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}
