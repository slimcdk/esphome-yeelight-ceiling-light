package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.q6 */
public final class C1268q6 implements C1012a6 {
    @GuardedBy("SharedPreferencesLoader.class")

    /* renamed from: b */
    private static final Map f1550b = new ArrayMap();

    /* renamed from: a */
    private final SharedPreferences f1551a;

    @Nullable
    /* renamed from: b */
    static C1268q6 m2520b(Context context, String str) {
        C1268q6 q6Var;
        if (!C1283r5.m2682a()) {
            synchronized (C1268q6.class) {
                q6Var = (C1268q6) f1550b.get((Object) null);
                if (q6Var == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return q6Var;
        }
        throw null;
    }

    /* renamed from: c */
    static synchronized void m2521c() {
        synchronized (C1268q6.class) {
            Map map = f1550b;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = ((C1268q6) it.next()).f1551a;
                throw null;
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public final Object mo12525a(String str) {
        throw null;
    }
}
