package com.miot.service.connection.wifi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.miot.service.C3602R;
import com.miot.service.view.TitleBarUtil;

public class WebShellActivity extends FragmentActivity {
    public static final String ARGS_KEY_URL = "url";
    public static final String PATH_CLOUD_DEVICE = "/cloud_device";
    private static final String SCHEME_HTTP = "http://";
    private static final String SCHEME_HTTPS = "https://";
    private static final String SCHEME_MI_HOME = "mihome://";
    public static final String TITLE_ID = "title_id";
    Context mContext;
    /* access modifiers changed from: private */
    public String mCurrentUrl;
    TextView mTitle;
    String mTitleStr;
    String mUrl;
    private WebChromeClient mWebChromeClient = new WebChromeClient() {
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (TextUtils.isEmpty(WebShellActivity.this.mTitleStr)) {
                WebShellActivity.this.mTitle.setText(str);
                return;
            }
            WebShellActivity webShellActivity = WebShellActivity.this;
            webShellActivity.mTitle.setText(webShellActivity.mTitleStr);
        }
    };
    WebView mWebView;
    private WebViewClient mWebViewClient = new WebViewClient() {
        public void onPageFinished(WebView webView, String str) {
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            WebShellActivity.this.mTitle.setText(C3602R.string.web_shell_loading);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!str.startsWith(WebShellActivity.SCHEME_HTTP) && !str.startsWith(WebShellActivity.SCHEME_HTTPS)) {
                Uri parse = Uri.parse(str);
                if (str.startsWith("tel") || str.startsWith("mailto")) {
                    WebShellActivity.this.mContext.startActivity(new Intent("android.intent.action.VIEW", parse));
                    return true;
                }
                if (str.startsWith("xmbbsapp://bbs.xiaomi.cn")) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(WebShellActivity.this.mUrl));
                    try {
                        intent.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
                        WebShellActivity.this.mContext.startActivity(intent);
                        return true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return super.shouldOverrideUrlLoading(webView, str);
            } else if (WebShellActivity.this.mCurrentUrl == null || str == null || !str.equals(WebShellActivity.this.mCurrentUrl)) {
                webView.loadUrl(str);
                String unused = WebShellActivity.this.mCurrentUrl = str;
                return true;
            } else {
                WebShellActivity.this.mWebView.goBack();
                return true;
            }
        }
    };

    public static boolean isCloudDevicePagePath(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(PATH_CLOUD_DEVICE);
    }

    /* access modifiers changed from: package-private */
    public void doFinishPage() {
        finish();
    }

    /* access modifiers changed from: package-private */
    public void doGoBack() {
        WebView webView = this.mWebView;
        if (webView == null || !webView.canGoBack()) {
            super.onBackPressed();
        } else {
            this.mWebView.goBack();
        }
    }

    /* access modifiers changed from: package-private */
    public void initWebView() {
        if (Build.VERSION.SDK_INT >= 11) {
            this.mWebView.removeJavascriptInterface("searchBoxJavaBridge_");
        }
        this.mWebView.getSettings().setJavaScriptEnabled(true);
        this.mWebView.getSettings().setDomStorageEnabled(true);
        this.mWebView.setFocusable(true);
        this.mWebView.setFocusableInTouchMode(true);
        this.mWebView.requestFocusFromTouch();
        this.mWebView.requestFocus();
        this.mWebView.setVisibility(0);
        this.mWebView.setWebViewClient(this.mWebViewClient);
        this.mWebView.setWebChromeClient(this.mWebChromeClient);
        this.mWebView.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                try {
                    intent.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
                    WebShellActivity.this.mContext.startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void injectJS(WebView webView, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            webView.evaluateJavascript(str, (ValueCallback) null);
            return;
        }
        webView.loadUrl("javascript:" + str);
    }

    public void onBackPressed() {
        WebView webView = this.mWebView;
        if (webView != null && webView.canGoBack()) {
            this.mWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mContext = this;
        TitleBarUtil.enableTranslucentStatus((Activity) this);
        setContentView(C3602R.layout.web_shell_activity);
        TitleBarUtil.setTitleBarPadding(findViewById(C3602R.C3604id.title_bar));
        findViewById(C3602R.C3604id.module_a_3_return_btn).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                WebShellActivity.this.onBackPressed();
            }
        });
        this.mTitle = (TextView) findViewById(C3602R.C3604id.module_a_3_return_title);
        this.mWebView = (WebView) findViewById(C3602R.C3604id.webview);
        this.mUrl = getIntent().getStringExtra(ARGS_KEY_URL);
        int intExtra = getIntent().getIntExtra(TITLE_ID, -1);
        if (intExtra != -1) {
            this.mTitleStr = getString(intExtra);
        }
        initWebView();
        if (!TextUtils.isEmpty(this.mUrl)) {
            this.mWebView.loadUrl(this.mUrl);
        } else {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.mWebView.destroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mWebView.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mWebView.onResume();
    }
}
