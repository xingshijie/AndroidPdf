package com.alo7.android.pdfreader;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;

import java.io.File;

/**
 *
 * Created by shijie.xing on 16/12/22.
 */
public class PdfView extends FrameLayout {

    private WebView webView;
    
    public PdfView(Context context) {
        this(context, null);
    }

    public PdfView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PdfView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        webView = new WebView(context);
        addView(webView, new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        WebSettings webSettings = webView.getSettings();
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowFileAccessFromFileURLs(true);
        webSettings.setAllowUniversalAccessFromFileURLs(true);
        webView.getSettings().setLoadsImagesAutomatically(true);
    }

    public void loadFromFile(File file){
        if(file != null && file.exists()){
            webView.loadUrl("file:///android_asset/simpleviewer.html?url=" + file.toURI());
        }
    }

    public void loadFromUrl(String url){
        if(url != null){
            webView.loadUrl("file:///android_asset/simpleviewer.html?url=" + url);
        }
    }
}
