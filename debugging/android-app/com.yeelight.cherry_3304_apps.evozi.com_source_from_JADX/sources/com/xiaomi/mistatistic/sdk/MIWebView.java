package com.xiaomi.mistatistic.sdk;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.xiaomi.mistatistic.sdk.controller.C4124g;
import com.xiaomi.mistatistic.sdk.data.HttpEvent;
import java.util.HashMap;
import java.util.Map;

public class MIWebView extends WebView {

    /* renamed from: com.xiaomi.mistatistic.sdk.MIWebView$a */
    class C4087a extends WebViewClient {

        /* renamed from: b */
        private WebViewClient f6983b;

        /* renamed from: c */
        private Map<String, Long> f6984c = new HashMap();

        public C4087a(WebViewClient webViewClient) {
            this.f6983b = webViewClient;
        }

        public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            WebViewClient webViewClient = this.f6983b;
            if (webViewClient != null) {
                webViewClient.doUpdateVisitedHistory(webView, str, z);
            } else {
                super.doUpdateVisitedHistory(webView, str, z);
            }
        }

        public void onFormResubmission(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.f6983b;
            if (webViewClient != null) {
                webViewClient.onFormResubmission(webView, message, message2);
            } else {
                super.onFormResubmission(webView, message, message2);
            }
        }

        public void onLoadResource(WebView webView, String str) {
            WebViewClient webViewClient = this.f6983b;
            if (webViewClient != null) {
                webViewClient.onLoadResource(webView, str);
            } else {
                super.onLoadResource(webView, str);
            }
        }

        public void onPageFinished(WebView webView, String str) {
            WebViewClient webViewClient = this.f6983b;
            if (webViewClient != null) {
                webViewClient.onPageFinished(webView, str);
            } else {
                super.onPageFinished(webView, str);
            }
            Long l = this.f6984c.get(str);
            if (l != null) {
                C4124g.m11151a().mo23062a(new HttpEvent(str, System.currentTimeMillis() - l.longValue()));
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebViewClient webViewClient = this.f6983b;
            if (webViewClient != null) {
                webViewClient.onPageStarted(webView, str, bitmap);
            } else {
                super.onPageStarted(webView, str, bitmap);
            }
            this.f6984c.put(str, Long.valueOf(System.currentTimeMillis()));
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            WebViewClient webViewClient = this.f6983b;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, i, str, str2);
            } else {
                super.onReceivedError(webView, i, str, str2);
            }
            Long l = this.f6984c.get(str2);
            if (l != null) {
                C4124g.m11151a().mo23062a(new HttpEvent(str2, System.currentTimeMillis() - l.longValue(), (long) i));
            }
        }

        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            WebViewClient webViewClient = this.f6983b;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            } else {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }

        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            WebViewClient webViewClient = this.f6983b;
            if (webViewClient != null) {
                webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
            } else {
                super.onReceivedLoginRequest(webView, str, str2, str3);
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebViewClient webViewClient = this.f6983b;
            if (webViewClient != null) {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        public void onScaleChanged(WebView webView, float f, float f2) {
            WebViewClient webViewClient = this.f6983b;
            if (webViewClient != null) {
                webViewClient.onScaleChanged(webView, f, f2);
            } else {
                super.onScaleChanged(webView, f, f2);
            }
        }

        public void onTooManyRedirects(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.f6983b;
            if (webViewClient != null) {
                webViewClient.onTooManyRedirects(webView, message, message2);
            } else {
                super.onTooManyRedirects(webView, message, message2);
            }
        }

        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.f6983b;
            if (webViewClient != null) {
                webViewClient.onUnhandledKeyEvent(webView, keyEvent);
            } else {
                super.onUnhandledKeyEvent(webView, keyEvent);
            }
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebViewClient webViewClient = this.f6983b;
            return webViewClient != null ? webViewClient.shouldInterceptRequest(webView, str) : super.shouldInterceptRequest(webView, str);
        }

        public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.f6983b;
            return webViewClient != null ? webViewClient.shouldOverrideKeyEvent(webView, keyEvent) : super.shouldOverrideKeyEvent(webView, keyEvent);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WebViewClient webViewClient = this.f6983b;
            return webViewClient != null ? webViewClient.shouldOverrideUrlLoading(webView, str) : super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(new C4087a(webViewClient));
    }
}
