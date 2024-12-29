package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.C0877b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0904d;
import com.google.android.gms.common.internal.C0917i;
import com.xiaomi.mipush.sdk.Constants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import p040h0.C3234e;

/* renamed from: com.google.android.gms.common.api.internal.u */
final class C0847u implements C0836r1 {

    /* renamed from: a */
    private final Context f788a;

    /* renamed from: b */
    private final C0852v0 f789b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0868z0 f790c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C0868z0 f791d;

    /* renamed from: e */
    private final Map f792e;

    /* renamed from: f */
    private final Set f793f = Collections.newSetFromMap(new WeakHashMap());
    @Nullable

    /* renamed from: g */
    private final C0722a.C0730f f794g;
    @Nullable

    /* renamed from: h */
    private Bundle f795h;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: i */
    public ConnectionResult f796i = null;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: j */
    public ConnectionResult f797j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f798k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Lock f799l;
    @GuardedBy("mLock")

    /* renamed from: m */
    private int f800m = 0;

    private C0847u(Context context, C0852v0 v0Var, Lock lock, Looper looper, C0877b bVar, Map map, Map map2, C0904d dVar, C0722a.C0723a aVar, @Nullable C0722a.C0730f fVar, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f788a = context;
        this.f789b = v0Var;
        this.f799l = lock;
        this.f794g = fVar;
        Context context2 = context;
        C0852v0 v0Var2 = v0Var;
        Lock lock2 = lock;
        Looper looper2 = looper;
        C0877b bVar2 = bVar;
        C0868z0 z0Var = r3;
        C0868z0 z0Var2 = new C0868z0(context2, v0Var2, lock2, looper2, bVar2, map2, (C0904d) null, map4, (C0722a.C0723a) null, arrayList2, new C0799j3(this, (C0792i3) null));
        this.f790c = z0Var;
        this.f791d = new C0868z0(context2, v0Var2, lock2, looper2, bVar2, map, dVar, map3, aVar, arrayList, new C0809l3(this, (C0804k3) null));
        ArrayMap arrayMap = new ArrayMap();
        for (C0722a.C0725c put : map2.keySet()) {
            arrayMap.put(put, this.f790c);
        }
        for (C0722a.C0725c put2 : map.keySet()) {
            arrayMap.put(put2, this.f791d);
        }
        this.f792e = Collections.unmodifiableMap(arrayMap);
    }

    @GuardedBy("mLock")
    /* renamed from: c */
    private final void m1084c(ConnectionResult connectionResult) {
        int i = this.f800m;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f800m = 0;
            }
            this.f789b.mo12020c(connectionResult);
        }
        m1085f();
        this.f800m = 0;
    }

    @GuardedBy("mLock")
    /* renamed from: f */
    private final void m1085f() {
        for (C0830q a : this.f793f) {
            a.mo12059a();
        }
        this.f793f.clear();
    }

    @GuardedBy("mLock")
    /* renamed from: j */
    private final boolean m1086j() {
        ConnectionResult connectionResult = this.f797j;
        return connectionResult != null && connectionResult.mo11751V() == 4;
    }

    /* renamed from: k */
    private final boolean m1087k(C0763d dVar) {
        C0868z0 z0Var = (C0868z0) this.f792e.get(dVar.mo11931s());
        C0917i.m1420k(z0Var, "GoogleApiClient is not configured to use the API required for this call.");
        return z0Var.equals(this.f791d);
    }

    /* renamed from: l */
    private static boolean m1088l(@Nullable ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.mo11756f0();
    }

    /* renamed from: n */
    public static C0847u m1090n(Context context, C0852v0 v0Var, Lock lock, Looper looper, C0877b bVar, Map map, C0904d dVar, Map map2, C0722a.C0723a aVar, ArrayList arrayList) {
        Map map3 = map2;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        C0722a.C0730f fVar = null;
        for (Map.Entry entry : map.entrySet()) {
            C0722a.C0730f fVar2 = (C0722a.C0730f) entry.getValue();
            if (true == fVar2.mo11829a()) {
                fVar = fVar2;
            }
            boolean q = fVar2.mo11845q();
            C0722a.C0725c cVar = (C0722a.C0725c) entry.getKey();
            if (q) {
                arrayMap.put(cVar, fVar2);
            } else {
                arrayMap2.put(cVar, fVar2);
            }
        }
        C0917i.m1424o(!arrayMap.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        for (C0722a aVar2 : map2.keySet()) {
            C0722a.C0725c b = aVar2.mo11820b();
            if (arrayMap.containsKey(b)) {
                arrayMap3.put(aVar2, (Boolean) map3.get(aVar2));
            } else if (arrayMap2.containsKey(b)) {
                arrayMap4.put(aVar2, (Boolean) map3.get(aVar2));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0782g3 g3Var = (C0782g3) arrayList.get(i);
            if (arrayMap3.containsKey(g3Var.f639a)) {
                arrayList2.add(g3Var);
            } else if (arrayMap4.containsKey(g3Var.f639a)) {
                arrayList3.add(g3Var);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new C0847u(context, v0Var, lock, looper, bVar, arrayMap, arrayMap2, dVar, aVar, fVar, arrayList2, arrayList3, arrayMap3, arrayMap4);
    }

    /* renamed from: u */
    static /* bridge */ /* synthetic */ void m1097u(C0847u uVar, int i, boolean z) {
        uVar.f789b.mo12019b(i, z);
        uVar.f797j = null;
        uVar.f796i = null;
    }

    /* renamed from: v */
    static /* bridge */ /* synthetic */ void m1098v(C0847u uVar, Bundle bundle) {
        Bundle bundle2 = uVar.f795h;
        if (bundle2 == null) {
            uVar.f795h = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    /* renamed from: w */
    static /* bridge */ /* synthetic */ void m1099w(C0847u uVar) {
        ConnectionResult connectionResult;
        if (m1088l(uVar.f796i)) {
            if (m1088l(uVar.f797j) || uVar.m1086j()) {
                int i = uVar.f800m;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        uVar.f800m = 0;
                        return;
                    }
                    ((C0852v0) C0917i.m1419j(uVar.f789b)).mo12018a(uVar.f795h);
                }
                uVar.m1085f();
                uVar.f800m = 0;
                return;
            }
            ConnectionResult connectionResult2 = uVar.f797j;
            if (connectionResult2 == null) {
                return;
            }
            if (uVar.f800m == 1) {
                uVar.m1085f();
                return;
            }
            uVar.m1084c(connectionResult2);
            uVar.f790c.mo12069h();
        } else if (uVar.f796i == null || !m1088l(uVar.f797j)) {
            ConnectionResult connectionResult3 = uVar.f796i;
            if (connectionResult3 != null && (connectionResult = uVar.f797j) != null) {
                if (uVar.f791d.f874l < uVar.f790c.f874l) {
                    connectionResult3 = connectionResult;
                }
                uVar.m1084c(connectionResult3);
            }
        } else {
            uVar.f791d.mo12069h();
            uVar.m1084c((ConnectionResult) C0917i.m1419j(uVar.f796i));
        }
    }

    @Nullable
    /* renamed from: y */
    private final PendingIntent m1101y() {
        if (this.f794g == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f788a, System.identityHashCode(this.f789b), this.f794g.mo11844p(), C3234e.f5217a | 134217728);
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo12064a() {
        this.f800m = 2;
        this.f798k = false;
        this.f797j = null;
        this.f796i = null;
        this.f790c.mo12064a();
        this.f791d.mo12064a();
    }

    @GuardedBy("mLock")
    /* renamed from: b */
    public final C0763d mo12065b(@NonNull C0763d dVar) {
        if (!m1087k(dVar)) {
            this.f790c.mo12065b(dVar);
            return dVar;
        } else if (m1086j()) {
            dVar.mo11934w(new Status(4, (String) null, m1101y()));
            return dVar;
        } else {
            this.f791d.mo12065b(dVar);
            return dVar;
        }
    }

    /* renamed from: d */
    public final boolean mo12066d() {
        this.f799l.lock();
        try {
            boolean z = false;
            if (this.f790c.mo12066d() && (this.f791d.mo12066d() || m1086j() || this.f800m == 1)) {
                z = true;
            }
            return z;
        } finally {
            this.f799l.unlock();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: e */
    public final C0763d mo12067e(@NonNull C0763d dVar) {
        if (!m1087k(dVar)) {
            return this.f790c.mo12067e(dVar);
        }
        if (!m1086j()) {
            return this.f791d.mo12067e(dVar);
        }
        dVar.mo11934w(new Status(4, (String) null, m1101y()));
        return dVar;
    }

    @GuardedBy("mLock")
    /* renamed from: g */
    public final void mo12068g() {
        this.f790c.mo12068g();
        this.f791d.mo12068g();
    }

    @GuardedBy("mLock")
    /* renamed from: h */
    public final void mo12069h() {
        this.f797j = null;
        this.f796i = null;
        this.f800m = 0;
        this.f790c.mo12069h();
        this.f791d.mo12069h();
        m1085f();
    }

    /* renamed from: i */
    public final void mo12070i(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append(str).append("authClient").println(Constants.COLON_SEPARATOR);
        this.f791d.mo12070i(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(Constants.COLON_SEPARATOR);
        this.f790c.mo12070i(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }
}
