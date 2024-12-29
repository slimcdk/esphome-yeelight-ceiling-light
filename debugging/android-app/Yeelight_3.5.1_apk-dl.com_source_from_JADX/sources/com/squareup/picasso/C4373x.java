package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.os.Build;
import com.squareup.picasso.Downloader;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.squareup.picasso.x */
public class C4373x implements Downloader {

    /* renamed from: b */
    static volatile Object f7320b;

    /* renamed from: c */
    private static final Object f7321c = new Object();

    /* renamed from: d */
    private static final ThreadLocal<StringBuilder> f7322d = new C4374a();

    /* renamed from: a */
    private final Context f7323a;

    /* renamed from: com.squareup.picasso.x$a */
    static class C4374a extends ThreadLocal<StringBuilder> {
        C4374a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    }

    /* renamed from: com.squareup.picasso.x$b */
    private static class C4375b {
        /* renamed from: a */
        static Object m12426a(Context context) {
            File f = C4376y.m12432f(context);
            HttpResponseCache installed = HttpResponseCache.getInstalled();
            return installed == null ? HttpResponseCache.install(f, C4376y.m12427a(f)) : installed;
        }
    }

    public C4373x(Context context) {
        this.f7323a = context.getApplicationContext();
    }

    /* renamed from: b */
    private static void m12422b(Context context) {
        if (f7320b == null) {
            try {
                synchronized (f7321c) {
                    if (f7320b == null) {
                        f7320b = C4375b.m12426a(context);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public Downloader.C4324a mo28096a(Uri uri, int i) {
        String str;
        if (Build.VERSION.SDK_INT >= 14) {
            m12422b(this.f7323a);
        }
        HttpURLConnection c = mo28249c(uri);
        c.setUseCaches(true);
        if (i != 0) {
            if (NetworkPolicy.isOfflineOnly(i)) {
                str = "only-if-cached,max-age=2147483647";
            } else {
                StringBuilder sb = f7322d.get();
                sb.setLength(0);
                if (!NetworkPolicy.shouldReadFromDiskCache(i)) {
                    sb.append("no-cache");
                }
                if (!NetworkPolicy.shouldWriteToDiskCache(i)) {
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append("no-store");
                }
                str = sb.toString();
            }
            c.setRequestProperty("Cache-Control", str);
        }
        int responseCode = c.getResponseCode();
        if (responseCode < 300) {
            long headerFieldInt = (long) c.getHeaderFieldInt("Content-Length", -1);
            return new Downloader.C4324a(c.getInputStream(), C4376y.m12449w(c.getHeaderField("X-Android-Response-Source")), headerFieldInt);
        }
        c.disconnect();
        throw new Downloader.ResponseException(responseCode + " " + c.getResponseMessage(), i, responseCode);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public HttpURLConnection mo28249c(Uri uri) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        return httpURLConnection;
    }
}
