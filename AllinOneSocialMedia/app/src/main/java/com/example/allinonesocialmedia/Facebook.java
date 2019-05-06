package com.example.allinonesocialmedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Facebook extends AppCompatActivity {
    public WebView mywebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        mywebview=(WebView)findViewById(R.id.wv1);
        WebSettings webSettings=mywebview.getSettings();
webSettings.setJavaScriptEnabled(true);
mywebview.loadUrl("https://www.facebook.com");
mywebview.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if(mywebview.canGoBack())  {
            mywebview.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}
