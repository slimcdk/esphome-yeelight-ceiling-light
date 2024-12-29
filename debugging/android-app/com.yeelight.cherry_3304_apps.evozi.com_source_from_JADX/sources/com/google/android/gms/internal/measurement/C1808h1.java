package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import com.xiaomi.mistatistic.sdk.BaseService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.h1 */
public final class C1808h1 implements C1871l1 {
    @GuardedBy("ConfigurationContentLoader.class")

    /* renamed from: g */
    private static final Map<Uri, C1808h1> f3443g = new ArrayMap();

    /* renamed from: h */
    private static final String[] f3444h = {BaseService.KEY, "value"};

    /* renamed from: a */
    private final ContentResolver f3445a;

    /* renamed from: b */
    private final Uri f3446b;

    /* renamed from: c */
    private final ContentObserver f3447c = new C1839j1(this, (Handler) null);

    /* renamed from: d */
    private final Object f3448d = new Object();

    /* renamed from: e */
    private volatile Map<String, String> f3449e;
    @GuardedBy("this")

    /* renamed from: f */
    private final List<C1886m1> f3450f = new ArrayList();

    private C1808h1(ContentResolver contentResolver, Uri uri) {
        this.f3445a = contentResolver;
        this.f3446b = uri;
        contentResolver.registerContentObserver(uri, false, this.f3447c);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C1808h1 m5183b(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.h1> r0 = com.google.android.gms.internal.measurement.C1808h1.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.h1> r1 = f3443g     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.h1 r1 = (com.google.android.gms.internal.measurement.C1808h1) r1     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            com.google.android.gms.internal.measurement.h1 r2 = new com.google.android.gms.internal.measurement.h1     // Catch:{ SecurityException -> 0x0018 }
            r2.<init>(r3, r4)     // Catch:{ SecurityException -> 0x0018 }
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.h1> r3 = f3443g     // Catch:{ SecurityException -> 0x0017 }
            r3.put(r4, r2)     // Catch:{ SecurityException -> 0x0017 }
        L_0x0017:
            r1 = r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1808h1.m5183b(android.content.ContentResolver, android.net.Uri):com.google.android.gms.internal.measurement.h1");
    }

    /* renamed from: e */
    static synchronized void m5184e() {
        synchronized (C1808h1.class) {
            for (C1808h1 next : f3443g.values()) {
                next.f3445a.unregisterContentObserver(next.f3447c);
            }
            f3443g.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    private final Map<String, String> m5185g() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Map<String, String> map = (Map) C1922o1.m5627a(new C1853k1(this));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return map;
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return null;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo11597a(String str) {
        return mo11696c().get(str);
    }

    /* renamed from: c */
    public final Map<String, String> mo11696c() {
        Map<String, String> map = this.f3449e;
        if (map == null) {
            synchronized (this.f3448d) {
                map = this.f3449e;
                if (map == null) {
                    map = m5185g();
                    this.f3449e = map;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    /* renamed from: d */
    public final void mo11697d() {
        synchronized (this.f3448d) {
            this.f3449e = null;
            C2026v1.m6108g();
        }
        synchronized (this) {
            for (C1886m1 C : this.f3450f) {
                C.mo11834C();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ Map mo11698f() {
        Cursor query = this.f3445a.query(this.f3446b, f3444h, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map arrayMap = count <= 256 ? new ArrayMap(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                arrayMap.put(query.getString(0), query.getString(1));
            }
            query.close();
            return arrayMap;
        } finally {
            query.close();
        }
    }
}
