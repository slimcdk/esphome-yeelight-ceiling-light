package com.miot.service.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import com.miot.common.DarkModeCompat;
import java.lang.ref.WeakReference;

public class SmartHomeWebView extends WebView {
    private static final String TAG = "SmartHomeWebView";
    private SmartHomeWebViewClient mWebViewClient;

    public static class SmartHomeWebViewClient extends WebViewClient {
        private WeakReference<WebViewClient> mExtraWebViewClientRef;

        public void onPageFinished(WebView webView, String str) {
            WebViewClient webViewClient;
            WeakReference<WebViewClient> weakReference = this.mExtraWebViewClientRef;
            if (!(weakReference == null || (webViewClient = (WebViewClient) weakReference.get()) == null)) {
                webViewClient.onPageFinished(webView, str);
            }
            super.onPageFinished(webView, str);
        }

        public void setExtraWebViewClient(WebViewClient webViewClient) {
            this.mExtraWebViewClientRef = new WeakReference<>(webViewClient);
        }

        @Nullable
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebViewClient webViewClient;
            WeakReference<WebViewClient> weakReference = this.mExtraWebViewClientRef;
            if (!(weakReference == null || (webViewClient = (WebViewClient) weakReference.get()) == null)) {
                webViewClient.shouldInterceptRequest(webView, str);
            }
            return super.shouldInterceptRequest(webView, str);
        }
    }

    public SmartHomeWebView(Context context) {
        super(context);
        init(context);
    }

    public SmartHomeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public SmartHomeWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    @SuppressLint({"AddJavascriptInterface"})
    private void init(Context context) {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDatabaseEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setAppCachePath(context.getDir("cache", 0).getPath());
        settings.setAllowFileAccess(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
        }
        settings.setSupportZoom(true);
        settings.setTextZoom(100);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(-1);
        if (i >= 11 && i < 17) {
            removeJavascriptInterface("searchBoxJavaBridge_");
        }
        if (i >= 21) {
            settings.setMixedContentMode(0);
        }
        SmartHomeWebViewClient smartHomeWebViewClient = new SmartHomeWebViewClient();
        this.mWebViewClient = smartHomeWebViewClient;
        setWebViewClient(smartHomeWebViewClient);
        setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                if (!TextUtils.isEmpty(str)) {
                    SmartHomeWebView.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                }
            }
        });
        initCookie();
        if (i < 29) {
            return;
        }
        if (DarkModeCompat.isDarkMode(getContext())) {
            settings.setForceDark(2);
        } else {
            settings.setForceDark(0);
        }
    }

    public void initCookie() {
        CookieSyncManager.createInstance(getContext());
        CookieManager.getInstance().setAcceptCookie(true);
    }

    /* access modifiers changed from: protected */
    public void setCookie(CookieManager cookieManager, String str, String str2, String str3) {
        if (str != null && str2 != null && str3 != null) {
            cookieManager.setCookie(str3, str + "=" + str2 + "; domain=" + str3);
        }
    }

    public void setExtraWebViewClient(WebViewClient webViewClient) {
        SmartHomeWebViewClient smartHomeWebViewClient = this.mWebViewClient;
        if (smartHomeWebViewClient != null) {
            smartHomeWebViewClient.setExtraWebViewClient(webViewClient);
        }
    }
}
