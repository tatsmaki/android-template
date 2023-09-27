package com.example.android

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private lateinit var web: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        web = findViewById(R.id.webView)
        web.webViewClient = WebViewClient()
        web.loadUrl("http://localhost:3000")
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true
        web.settings.setSupportZoom(true)
    }

    override fun onBackPressed() {
        if (web.canGoBack())
            web.goBack()
        else
            super.onBackPressed()
    }
}
