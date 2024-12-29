package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.e2 */
public final class C1763e2 implements C1871l1 {
    @GuardedBy("SharedPreferencesLoader.class")

    /* renamed from: f */
    private static final Map<String, C1763e2> f3315f = new ArrayMap();

    /* renamed from: a */
    private final SharedPreferences f3316a;

    /* renamed from: b */
    private final SharedPreferences.OnSharedPreferenceChangeListener f3317b = new C1748d2(this);

    /* renamed from: c */
    private final Object f3318c = new Object();

    /* renamed from: d */
    private volatile Map<String, ?> f3319d;
    @GuardedBy("this")

    /* renamed from: e */
    private final List<C1886m1> f3320e = new ArrayList();

    private C1763e2(SharedPreferences sharedPreferences) {
        this.f3316a = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.f3317b);
    }

    /* renamed from: b */
    static C1763e2 m5012b(Context context, String str) {
        C1763e2 e2Var;
        if (!((!C1823i1.m5238a() || str.startsWith("direct_boot:")) ? true : C1823i1.m5239b(context))) {
            return null;
        }
        synchronized (C1763e2.class) {
            e2Var = f3315f.get(str);
            if (e2Var == null) {
                e2Var = new C1763e2(m5014e(context, str));
                f3315f.put(str, e2Var);
            }
        }
        return e2Var;
    }

    /* renamed from: c */
    static synchronized void m5013c() {
        synchronized (C1763e2.class) {
            for (C1763e2 next : f3315f.values()) {
                next.f3316a.unregisterOnSharedPreferenceChangeListener(next.f3317b);
            }
            f3315f.clear();
        }
    }

    /* renamed from: e */
    private static SharedPreferences m5014e(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (C1823i1.m5238a()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                return context.getSharedPreferences(str.substring(12), 0);
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return sharedPreferences;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Object mo11597a(String str) {
        Map<String, ?> map = this.f3319d;
        if (map == null) {
            synchronized (this.f3318c) {
                map = this.f3319d;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.f3316a.getAll();
                        this.f3319d = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo11598d(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f3318c) {
            this.f3319d = null;
            C2026v1.m6108g();
        }
        synchronized (this) {
            for (C1886m1 C : this.f3320e) {
                C.mo11834C();
            }
        }
    }
}
