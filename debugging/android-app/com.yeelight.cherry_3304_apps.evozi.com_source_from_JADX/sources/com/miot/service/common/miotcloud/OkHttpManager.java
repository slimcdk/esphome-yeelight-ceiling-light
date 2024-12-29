package com.miot.service.common.miotcloud;

import android.text.TextUtils;
import com.miot.common.utils.Logger;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.miot.service.common.miotcloud.impl.OpenMiotCloudImpl;
import java.io.File;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p011c.p083d.p084a.C0992c;
import p011c.p083d.p084a.C1114f;
import p011c.p083d.p084a.C1141v;
import p011c.p083d.p084a.C1144x;
import p011c.p083d.p084a.C1150z;

public class OkHttpManager {
    private static final String TAG = "OkHttpManager";
    private static String mLocale;
    private static volatile OkHttpManager sInstance;
    private C1141v mHttpClient;

    private OkHttpManager() {
        C1141v vVar = new C1141v();
        this.mHttpClient = vVar;
        vVar.mo9808U(false);
        this.mHttpClient.mo9806O(5, TimeUnit.SECONDS);
        this.mHttpClient.mo9809Y(10, TimeUnit.SECONDS);
        this.mHttpClient.mo9811b0(10, TimeUnit.SECONDS);
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        CookieHandler.setDefault(cookieManager);
        this.mHttpClient.mo9807P(cookieManager);
        this.mHttpClient.mo9800B().add(new UserAgentInterceptor("mijia-sdk-ua"));
        addLocaleCookie();
    }

    private void configCache(File file) {
        this.mHttpClient.mo9805N(new C0992c(file, (long) 10485760));
    }

    public static OkHttpManager getInstance() {
        String locale = Locale.getDefault().toString();
        if (!locale.equals(mLocale)) {
            mLocale = locale;
            sInstance = null;
        }
        if (sInstance == null) {
            synchronized (OkHttpManager.class) {
                if (sInstance == null) {
                    sInstance = new OkHttpManager();
                }
            }
        }
        return sInstance;
    }

    /* access modifiers changed from: private */
    public void parseResponse(C1150z zVar, HttpCallback<String> httpCallback) {
        if (!zVar.mo9866t()) {
            httpCallback.onFailed(zVar.mo9861o(), zVar.mo9868u());
            return;
        }
        String t = zVar.mo9857k().mo9391t();
        Logger.m10629d(TAG, "parseResponse body: " + t);
        httpCallback.onSucceed(t);
    }

    public void addCookie(String str, HttpCookie httpCookie) {
        try {
            ((CookieManager) this.mHttpClient.mo9820m()).getCookieStore().add(new URI(str), httpCookie);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public void addLocaleCookie() {
        HttpCookie httpCookie = new HttpCookie("locale", Locale.getDefault().toString());
        httpCookie.setDomain(MiotCloudImpl.COOKIE_DOMAIN);
        httpCookie.setPath(MiotCloudImpl.COOKIE_PATH);
        addCookie(MiotCloudImpl.COOKIE_URL, httpCookie);
        addCookie(OpenMiotCloudImpl.COOKIE_URL, httpCookie);
    }

    public void cancelRequest(String str) {
        this.mHttpClient.mo9810b(str);
    }

    public void enableHttpLog() {
        this.mHttpClient.mo9800B().add(new OkHttpLogingInterceptor());
    }

    public void enqueue(C1144x xVar, final HttpCallback<String> httpCallback) {
        this.mHttpClient.mo9803F(xVar).mo9670e(new C1114f() {
            public void onFailure(C1144x xVar, IOException iOException) {
                HttpCallback httpCallback = httpCallback;
                httpCallback.onFailed(1013, "IOException " + iOException.toString());
                iOException.printStackTrace();
            }

            public void onResponse(C1150z zVar) {
                try {
                    OkHttpManager.this.parseResponse(zVar, httpCallback);
                } catch (IOException e) {
                    HttpCallback httpCallback = httpCallback;
                    httpCallback.onFailed(1012, "Exception " + e.toString());
                    e.printStackTrace();
                }
            }
        });
    }

    public C1150z execute(C1144x xVar) {
        return this.mHttpClient.mo9803F(xVar).mo9672g();
    }

    public void removeCookies() {
        ((CookieManager) this.mHttpClient.mo9820m()).getCookieStore().removeAll();
    }

    public void setUserAgent(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
    }
}
