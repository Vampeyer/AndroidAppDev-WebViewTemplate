package com.example.mywebapp;

import android.os.Bundle;

// the WebView is imported to view the page and
// the web view client is imported to browse along the page
import android.webkit.WebView;
import android.webkit.WebViewClient;



import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        WebView webView = (WebView) findViewById(R.id.webview);


// Enable iframes
        webView.getSettings().setJavaScriptEnabled(true);

// Enable media playback

        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().getAllowUniversalAccessFromFileURLs();
        webView.getSettings().getDomStorageEnabled();
        webView.getSettings().getMediaPlaybackRequiresUserGesture();
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(true);



        // the webview client allows browsing inside the web page.
        webView.setWebViewClient(new WebViewClient());



        webView.loadUrl("https://techsport.app/");



//        webView.loadUrl("file:///android_asset/index.html");
    ;}
}


