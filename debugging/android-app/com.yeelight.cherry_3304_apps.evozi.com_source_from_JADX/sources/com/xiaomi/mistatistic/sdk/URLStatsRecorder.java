package com.xiaomi.mistatistic.sdk;

import android.os.Build;
import android.os.SystemClock;
import com.xiaomi.mistatistic.sdk.controller.C4124g;
import com.xiaomi.mistatistic.sdk.controller.C4130h;
import com.xiaomi.mistatistic.sdk.controller.HttpEventFilter;
import com.xiaomi.mistatistic.sdk.data.HttpEvent;
import com.xiaomi.mistatistic.sdk.network.C4178c;
import com.xiaomi.mistatistic.sdk.network.C4180d;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;

public class URLStatsRecorder {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Map<String, URLStreamHandler> f6986a = new HashMap();

    /* renamed from: b */
    private static final List<String> f6987b = new ArrayList();

    /* renamed from: c */
    private static final List<String> f6988c = new ArrayList();

    /* renamed from: d */
    private static final List<String> f6989d = new ArrayList();

    /* renamed from: e */
    private static final List<String> f6990e = new ArrayList();

    /* renamed from: f */
    private static Boolean f6991f = null;

    /* renamed from: com.xiaomi.mistatistic.sdk.URLStatsRecorder$a */
    static class C4090a extends URLStreamHandler {

        /* renamed from: a */
        private URLStreamHandler f6992a;

        public C4090a(URLStreamHandler uRLStreamHandler) {
            this.f6992a = uRLStreamHandler;
        }

        /* access modifiers changed from: protected */
        public URLConnection openConnection(URL url) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Method declaredMethod = URLStreamHandler.class.getDeclaredMethod("openConnection", new Class[]{URL.class});
                declaredMethod.setAccessible(true);
                URLConnection uRLConnection = (URLConnection) declaredMethod.invoke(this.f6992a, new Object[]{url});
                if (uRLConnection instanceof HttpsURLConnection) {
                    C4180d dVar = new C4180d((HttpsURLConnection) uRLConnection);
                    dVar.mo23200a(elapsedRealtime);
                    return dVar;
                } else if (!(uRLConnection instanceof HttpURLConnection)) {
                    return uRLConnection;
                } else {
                    C4178c cVar = new C4178c((HttpURLConnection) uRLConnection);
                    cVar.mo23143a(elapsedRealtime);
                    return cVar;
                }
            } catch (Exception e) {
                C4124g.m11151a().mo23062a(new HttpEvent(url.toString(), e.getClass().getSimpleName()));
                throw new IOException();
            }
        }

        /* access modifiers changed from: protected */
        public URLConnection openConnection(URL url, Proxy proxy) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Method declaredMethod = URLStreamHandler.class.getDeclaredMethod("openConnection", new Class[]{URL.class, Proxy.class});
                declaredMethod.setAccessible(true);
                URLConnection uRLConnection = (URLConnection) declaredMethod.invoke(this.f6992a, new Object[]{url, proxy});
                if (uRLConnection instanceof HttpsURLConnection) {
                    C4180d dVar = new C4180d((HttpsURLConnection) uRLConnection);
                    dVar.mo23200a(elapsedRealtime);
                    return dVar;
                } else if (!(uRLConnection instanceof HttpURLConnection)) {
                    return uRLConnection;
                } else {
                    C4178c cVar = new C4178c((HttpURLConnection) uRLConnection);
                    cVar.mo23143a(elapsedRealtime);
                    return cVar;
                }
            } catch (Exception e) {
                C4124g.m11151a().mo23062a(new HttpEvent(url.toString(), e.getClass().getSimpleName()));
                throw new IOException();
            }
        }
    }

    static {
        f6987b.add("file");
        f6987b.add("ftp");
        f6987b.add("http");
        f6987b.add("https");
        f6987b.add("jar");
        f6988c.add("http");
    }

    public static void addHttpEvent(HttpEvent httpEvent) {
        C4124g.m11151a().mo23062a(httpEvent);
    }

    public static void dump() {
        List<HttpEvent> b = C4124g.m11151a().mo23065b();
        if (b != null && b.size() > 0) {
            for (HttpEvent next : b) {
                try {
                    PrintStream printStream = System.out;
                    printStream.println("EVENT: " + next.getUrl() + ": " + next.toJSON().toString());
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static boolean enableAutoRecord() {
        Class<URL> cls;
        String str;
        Boolean bool = f6991f;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if (!f6987b.isEmpty()) {
                for (String url : f6987b) {
                    new URL(url, "www.xiaomi.com", "");
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    cls = URL.class;
                    str = "handlers";
                } else {
                    cls = URL.class;
                    str = "streamHandlers";
                }
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                Hashtable hashtable = (Hashtable) declaredField.get((Object) null);
                for (String next : f6987b) {
                    f6986a.put(next, (URLStreamHandler) hashtable.get(next));
                }
                URL.setURLStreamHandlerFactory(new URLStreamHandlerFactory() {
                    public URLStreamHandler createURLStreamHandler(String str) {
                        if (URLStatsRecorder.f6986a.containsKey(str)) {
                            return new C4090a((URLStreamHandler) URLStatsRecorder.f6986a.get(str));
                        }
                        return null;
                    }
                });
                f6991f = Boolean.TRUE;
            }
        } catch (Throwable th) {
            f6991f = Boolean.FALSE;
            C4130h.m11176a("failed to enable url interceptor", th);
        }
        return f6991f.booleanValue();
    }

    public static void setEventFilter(HttpEventFilter httpEventFilter) {
        C4124g.m11151a().mo23061a(httpEventFilter);
    }

    public static URLConnection wrapURLConnection(URLConnection uRLConnection) {
        return uRLConnection instanceof HttpURLConnection ? new C4178c((HttpURLConnection) uRLConnection) : uRLConnection instanceof HttpsURLConnection ? new C4180d((HttpsURLConnection) uRLConnection) : uRLConnection;
    }
}
