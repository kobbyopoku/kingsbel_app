package com.e.kingsbel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myWebView = (WebView) findViewById(R.id.homeWebView);
        setContentView(myWebView);
        myWebView.loadUrl("https://www.kingsbel.com/store");

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        MyAppWebViewClient webViewClient = new MyAppWebViewClient();

        myWebView.setWebViewClient(webViewClient);
    }
    // handling back button
    @Override
    public void onBackPressed() {
        if(myWebView.canGoBack()) {
            myWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
