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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.v5 */
public final class C1345v5 implements C1012a6 {
    @GuardedBy("ConfigurationContentLoader.class")

    /* renamed from: g */
    private static final Map f1674g = new ArrayMap();

    /* renamed from: h */
    public static final String[] f1675h = {"key", "value"};

    /* renamed from: a */
    private final ContentResolver f1676a;

    /* renamed from: b */
    private final Uri f1677b;

    /* renamed from: c */
    private final ContentObserver f1678c;

    /* renamed from: d */
    private final Object f1679d = new Object();

    /* renamed from: e */
    private volatile Map f1680e;
    @GuardedBy("this")

    /* renamed from: f */
    private final List f1681f = new ArrayList();

    private C1345v5(ContentResolver contentResolver, Uri uri) {
        C1330u5 u5Var = new C1330u5(this, (Handler) null);
        this.f1678c = u5Var;
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.f1676a = contentResolver;
        this.f1677b = uri;
        contentResolver.registerContentObserver(uri, false, u5Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0016 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C1345v5 m3112b(android.content.ContentResolver r4, android.net.Uri r5) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.v5> r0 = com.google.android.gms.internal.measurement.C1345v5.class
            monitor-enter(r0)
            java.util.Map r1 = f1674g     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.measurement.v5 r2 = (com.google.android.gms.internal.measurement.C1345v5) r2     // Catch:{ all -> 0x0018 }
            if (r2 != 0) goto L_0x0016
            com.google.android.gms.internal.measurement.v5 r3 = new com.google.android.gms.internal.measurement.v5     // Catch:{ SecurityException -> 0x0016 }
            r3.<init>(r4, r5)     // Catch:{ SecurityException -> 0x0016 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0015 }
        L_0x0015:
            r2 = r3
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r2
        L_0x0018:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1345v5.m3112b(android.content.ContentResolver, android.net.Uri):com.google.android.gms.internal.measurement.v5");
    }

    /* renamed from: e */
    static synchronized void m3113e() {
        synchronized (C1345v5.class) {
            for (C1345v5 v5Var : f1674g.values()) {
                v5Var.f1676a.unregisterContentObserver(v5Var.f1678c);
            }
            f1674g.clear();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12525a(String str) {
        return (String) mo13428c().get(str);
    }

    /* renamed from: c */
    public final Map mo13428c() {
        Map map;
        Map map2 = this.f1680e;
        if (map2 == null) {
            synchronized (this.f1679d) {
                map2 = this.f1680e;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) C1390y5.m3297a(new C1315t5(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                    this.f1680e = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Map mo13429d() {
        Cursor query = this.f1676a.query(this.f1677b, f1675h, (String) null, (String[]) null, (String) null);
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

    /* renamed from: f */
    public final void mo13430f() {
        synchronized (this.f1679d) {
            this.f1680e = null;
            C1252p6.m2451d();
        }
        synchronized (this) {
            for (C1360w5 zza : this.f1681f) {
                zza.zza();
            }
        }
    }
}
