package com.miot.service.common.miotcloud;

import android.text.TextUtils;
import com.miot.common.utils.Logger;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.miot.service.common.miotcloud.impl.OpenMiotCloudImpl;
import com.squareup.okhttp.C4270c;
import com.squareup.okhttp.C4284f;
import com.squareup.okhttp.C4310u;
import com.squareup.okhttp.C4312v;
import com.squareup.okhttp.C4318x;
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

public class OkHttpManager {
    private static final String TAG = "OkHttpManager";
    private static String mLocale;
    private static volatile OkHttpManager sInstance;
    private C4310u mHttpClient;

    private OkHttpManager() {
        C4310u uVar = new C4310u();
        this.mHttpClient = uVar;
        uVar.mo27995U(false);
        C4310u uVar2 = this.mHttpClient;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        uVar2.mo27993R(5, timeUnit);
        this.mHttpClient.mo27996X(10, timeUnit);
        this.mHttpClient.mo27997Y(10, timeUnit);
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        CookieHandler.setDefault(cookieManager);
        this.mHttpClient.mo27994S(cookieManager);
        this.mHttpClient.mo27987E().add(new UserAgentInterceptor("mijia-sdk-ua"));
        addLocaleCookie();
    }

    private void configCache(File file) {
        this.mHttpClient.mo27992Q(new C4270c(file, (long) 10485760));
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
    public void parseResponse(C4318x xVar, HttpCallback<String> httpCallback) {
        if (!xVar.mo28065t()) {
            httpCallback.onFailed(xVar.mo28060o(), xVar.mo28067u());
            return;
        }
        String n = xVar.mo28056k().mo28089n();
        Logger.m7499d(TAG, "parseResponse body: " + n);
        httpCallback.onSucceed(n);
    }

    public void addCookie(String str, HttpCookie httpCookie) {
        try {
            ((CookieManager) this.mHttpClient.mo28007j()).getCookieStore().add(new URI(str), httpCookie);
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
        this.mHttpClient.mo27998b(str);
    }

    public void enableHttpLog() {
        this.mHttpClient.mo27987E().add(new OkHttpLogingInterceptor());
    }

    public void enqueue(C4312v vVar, final HttpCallback<String> httpCallback) {
        this.mHttpClient.mo27990M(vVar).mo27851e(new C4284f() {
            public void onFailure(C4312v vVar, IOException iOException) {
                HttpCallback httpCallback = httpCallback;
                httpCallback.onFailed(1013, "IOException " + iOException.toString());
                iOException.printStackTrace();
            }

            public void onResponse(C4318x xVar) {
                try {
                    OkHttpManager.this.parseResponse(xVar, httpCallback);
                } catch (IOException e) {
                    HttpCallback httpCallback = httpCallback;
                    httpCallback.onFailed(1012, "Exception " + e.toString());
                    e.printStackTrace();
                }
            }
        });
    }

    public C4318x execute(C4312v vVar) {
        return this.mHttpClient.mo27990M(vVar).mo27853g();
    }

    public void removeCookies() {
        ((CookieManager) this.mHttpClient.mo28007j()).getCookieStore().removeAll();
    }

    public void setUserAgent(String str) {
        TextUtils.isEmpty(str);
    }
}
