package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private WebView webview;
    private EditText txtdireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.webview= (WebView) findViewById(R.id.wvWebView);
        this.txtdireccion= (EditText) findViewById(R.id.editTextWeb);

    }

    public void navegarInternet(View view){
        this.webview.loadUrl("http://"+this.txtdireccion.getText());
        this.webview.setWebViewClient(new mostrarEnAplicacion());
    }

    public void volver(View view) {
        this.webview.goBack();
    }

    private class mostrarEnAplicacion extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

}