package com.fasttech.thenewsbox;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class NewsActivity extends AppCompatActivity {
    WebView webView;
    ProgressBar pr;

    void init(){
        webView = (WebView)findViewById(R.id.web);
        pr = (ProgressBar)findViewById(R.id.progressBar3) ;

        Intent rcv = getIntent();
        String u =rcv.getStringExtra("KeyUrl");
        String n = rcv.getStringExtra("KeyName");
        WebViewClient client = new WebViewClient();
        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                pr.setProgress(newProgress);
                if(newProgress==100){
                    pr.setVisibility(View.GONE);
                    getSupportActionBar().hide();
                }else {
                    pr.setVisibility(View.VISIBLE);
                }
            }
        });
        webView.setWebViewClient(client);
        webView.getSettings().setJavaScriptEnabled(true);
        getSupportActionBar().setTitle(n);
        webView.loadUrl(u);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        init();
    }
}
