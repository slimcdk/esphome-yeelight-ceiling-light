package com.google.firebase.analytics.p109a;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.C2800a;
import com.google.firebase.C2816c;
import com.google.firebase.analytics.connector.internal.C2810b;
import com.google.firebase.analytics.connector.internal.C2811c;
import com.google.firebase.analytics.connector.internal.C2812d;
import com.google.firebase.analytics.p109a.C2801a;
import com.google.firebase.p131g.C3192a;
import com.google.firebase.p131g.C3195d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.firebase.analytics.a.b */
public class C2804b implements C2801a {

    /* renamed from: c */
    private static volatile C2801a f5409c;
    @VisibleForTesting

    /* renamed from: a */
    private final AppMeasurement f5410a;
    @VisibleForTesting

    /* renamed from: b */
    final Map<String, Object> f5411b = new ConcurrentHashMap();

    /* renamed from: com.google.firebase.analytics.a.b$a */
    class C2805a implements C2801a.C2802a {
        C2805a(C2804b bVar, String str) {
        }
    }

    private C2804b(AppMeasurement appMeasurement) {
        C1609u.m4475k(appMeasurement);
        this.f5410a = appMeasurement;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @KeepForSdk
    /* renamed from: c */
    public static C2801a m8521c(C2816c cVar, Context context, C3195d dVar) {
        C1609u.m4475k(cVar);
        C1609u.m4475k(context);
        C1609u.m4475k(dVar);
        C1609u.m4475k(context.getApplicationContext());
        if (f5409c == null) {
            synchronized (C2804b.class) {
                if (f5409c == null) {
                    Bundle bundle = new Bundle(1);
                    if (cVar.mo17067q()) {
                        dVar.mo17113b(C2800a.class, C2807d.f5413a, C2806c.f5412a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", cVar.mo17066p());
                    }
                    f5409c = new C2804b(AppMeasurement.m6685b(context, bundle));
                }
            }
        }
        return f5409c;
    }

    /* renamed from: d */
    static final /* synthetic */ void m8522d(C3192a aVar) {
        boolean z = ((C2800a) aVar.mo17778a()).f5404a;
        synchronized (C2804b.class) {
            ((C2804b) f5409c).f5410a.mo12367d(z);
        }
    }

    /* renamed from: e */
    private final boolean m8523e(@NonNull String str) {
        return !str.isEmpty() && this.f5411b.containsKey(str) && this.f5411b.get(str) != null;
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo17051a(@NonNull String str, @NonNull String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C2811c.m8544a(str) && C2811c.m8545b(str2, bundle) && C2811c.m8546c(str, str2, bundle)) {
            C2811c.m8547d(str, str2, bundle);
            this.f5410a.logEventInternal(str, str2, bundle);
        }
    }

    @WorkerThread
    @KeepForSdk
    /* renamed from: b */
    public C2801a.C2802a mo17052b(@NonNull String str, C2801a.C2803b bVar) {
        C1609u.m4475k(bVar);
        if (!C2811c.m8544a(str) || m8523e(str)) {
            return null;
        }
        AppMeasurement appMeasurement = this.f5410a;
        Object bVar2 = "fiam".equals(str) ? new C2810b(appMeasurement, bVar) : ("crash".equals(str) || "clx".equals(str)) ? new C2812d(appMeasurement, bVar) : null;
        if (bVar2 == null) {
            return null;
        }
        this.f5411b.put(str, bVar2);
        return new C2805a(this, str);
    }
}
