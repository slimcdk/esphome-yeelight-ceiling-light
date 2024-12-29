package p011c.p083d.p090b;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p011c.p083d.p090b.C1189j;

/* renamed from: c.d.b.d0 */
public class C1169d0 implements C1189j {

    /* renamed from: b */
    static volatile Object f1985b;

    /* renamed from: c */
    private static final Object f1986c = new Object();

    /* renamed from: d */
    private static final ThreadLocal<StringBuilder> f1987d = new C1170a();

    /* renamed from: a */
    private final Context f1988a;

    /* renamed from: c.d.b.d0$a */
    static class C1170a extends ThreadLocal<StringBuilder> {
        C1170a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    }

    /* renamed from: c.d.b.d0$b */
    private static class C1171b {
        /* renamed from: a */
        static Object m3007a(Context context) {
            File f = C1173e0.m3015f(context);
            HttpResponseCache installed = HttpResponseCache.getInstalled();
            return installed == null ? HttpResponseCache.install(f, C1173e0.m3010a(f)) : installed;
        }
    }

    public C1169d0(Context context) {
        this.f1988a = context.getApplicationContext();
    }

    /* renamed from: b */
    private static void m3003b(Context context) {
        if (f1985b == null) {
            try {
                synchronized (f1986c) {
                    if (f1985b == null) {
                        f1985b = C1171b.m3007a(context);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public C1189j.C1190a mo9946a(Uri uri, int i) {
        String str;
        if (Build.VERSION.SDK_INT >= 14) {
            m3003b(this.f1988a);
        }
        HttpURLConnection c = mo9947c(uri);
        c.setUseCaches(true);
        if (i != 0) {
            if (C1199q.m3093a(i)) {
                str = "only-if-cached,max-age=2147483647";
            } else {
                StringBuilder sb = f1987d.get();
                sb.setLength(0);
                if (!C1199q.m3094b(i)) {
                    sb.append("no-cache");
                }
                if (!C1199q.m3095c(i)) {
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
            return new C1189j.C1190a(c.getInputStream(), C1173e0.m3032w(c.getHeaderField("X-Android-Response-Source")), headerFieldInt);
        }
        c.disconnect();
        throw new C1189j.C1191b(responseCode + " " + c.getResponseMessage(), i, responseCode);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public HttpURLConnection mo9947c(Uri uri) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        return httpURLConnection;
    }
}
