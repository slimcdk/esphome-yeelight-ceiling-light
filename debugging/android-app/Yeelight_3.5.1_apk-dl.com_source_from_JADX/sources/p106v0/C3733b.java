package p106v0;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1296s2;
import com.google.firebase.C2190a;
import com.google.firebase.C2406d;
import com.google.firebase.analytics.connector.internal.C2193b;
import com.google.firebase.analytics.connector.internal.C2195d;
import com.google.firebase.analytics.connector.internal.C2197f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p048j0.C3262a;
import p066m1.C3341a;
import p066m1.C3344d;
import p106v0.C3730a;

/* renamed from: v0.b */
public class C3733b implements C3730a {

    /* renamed from: c */
    private static volatile C3730a f6259c;
    @VisibleForTesting

    /* renamed from: a */
    final C3262a f6260a;
    @VisibleForTesting

    /* renamed from: b */
    final Map f6261b = new ConcurrentHashMap();

    /* renamed from: v0.b$a */
    class C3734a implements C3730a.C3731a {
        C3734a(C3733b bVar, String str) {
        }
    }

    C3733b(C3262a aVar) {
        C0917i.m1419j(aVar);
        this.f6260a = aVar;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public static C3730a m10625c(@NonNull C2406d dVar, @NonNull Context context, @NonNull C3344d dVar2) {
        C0917i.m1419j(dVar);
        C0917i.m1419j(context);
        C0917i.m1419j(dVar2);
        C0917i.m1419j(context.getApplicationContext());
        if (f6259c == null) {
            synchronized (C3733b.class) {
                if (f6259c == null) {
                    Bundle bundle = new Bundle(1);
                    if (dVar.mo18988t()) {
                        dVar2.mo24070a(C2190a.class, C3735c.f6262a, C3736d.f6263a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", dVar.mo18987s());
                    }
                    f6259c = new C3733b(C1296s2.m2742r(context, (String) null, (String) null, (String) null, bundle).mo13266o());
                }
            }
        }
        return f6259c;
    }

    /* renamed from: d */
    static /* synthetic */ void m10626d(C3341a aVar) {
        boolean z = ((C2190a) aVar.mo24066a()).f3484a;
        synchronized (C3733b.class) {
            ((C3733b) C0917i.m1419j(f6259c)).f6260a.mo23826c(z);
        }
    }

    /* renamed from: e */
    private final boolean m10627e(@NonNull String str) {
        return !str.isEmpty() && this.f6261b.containsKey(str) && this.f6261b.get(str) != null;
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo26155a(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C2193b.m5513f(str) && C2193b.m5511d(str2, bundle) && C2193b.m5510c(str, str2, bundle)) {
            C2193b.m5509b(str, str2, bundle);
            this.f6260a.mo23824a(str, str2, bundle);
        }
    }

    @WorkerThread
    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public C3730a.C3731a mo26156b(@NonNull String str, @NonNull C3730a.C3732b bVar) {
        C0917i.m1419j(bVar);
        if (!C2193b.m5513f(str) || m10627e(str)) {
            return null;
        }
        C3262a aVar = this.f6260a;
        Object dVar = "fiam".equals(str) ? new C2195d(aVar, bVar) : ("crash".equals(str) || "clx".equals(str)) ? new C2197f(aVar, bVar) : null;
        if (dVar == null) {
            return null;
        }
        this.f6261b.put(str, dVar);
        return new C3734a(this, str);
    }
}
