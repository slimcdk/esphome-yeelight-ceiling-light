package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.C1520d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1507j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1564e;
import com.google.android.gms.common.internal.C1609u;
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
import p011c.p012a.p019b.p028b.p037d.C0603a;
import p011c.p012a.p019b.p028b.p037d.C0607e;

/* renamed from: com.google.android.gms.common.api.internal.f2 */
final class C1436f2 implements C1424d1 {

    /* renamed from: a */
    private final Context f2679a;

    /* renamed from: b */
    private final C1453j0 f2680b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1475p0 f2681c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1475p0 f2682d;

    /* renamed from: e */
    private final Map<C1382a.C1385c<?>, C1475p0> f2683e;

    /* renamed from: f */
    private final Set<C1460l> f2684f = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: g */
    private final C1382a.C1390f f2685g;

    /* renamed from: h */
    private Bundle f2686h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ConnectionResult f2687i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ConnectionResult f2688j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f2689k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Lock f2690l;
    @GuardedBy("mLock")

    /* renamed from: m */
    private int f2691m = 0;

    private C1436f2(Context context, C1453j0 j0Var, Lock lock, Looper looper, C1520d dVar, Map<C1382a.C1385c<?>, C1382a.C1390f> map, Map<C1382a.C1385c<?>, C1382a.C1390f> map2, C1564e eVar, C1382a.C1383a<? extends C0607e, C0603a> aVar, C1382a.C1390f fVar, ArrayList<C1425d2> arrayList, ArrayList<C1425d2> arrayList2, Map<C1382a<?>, Boolean> map3, Map<C1382a<?>, Boolean> map4) {
        this.f2679a = context;
        C1453j0 j0Var2 = j0Var;
        this.f2680b = j0Var2;
        this.f2690l = lock;
        this.f2685g = fVar;
        Context context2 = context;
        Lock lock2 = lock;
        Looper looper2 = looper;
        C1520d dVar2 = dVar;
        C1475p0 p0Var = r3;
        C1475p0 p0Var2 = new C1475p0(context2, j0Var2, lock2, looper2, dVar2, map2, (C1564e) null, map4, (C1382a.C1383a<? extends C0607e, C0603a>) null, arrayList2, new C1444h2(this, (C1440g2) null));
        this.f2681c = p0Var;
        this.f2682d = new C1475p0(context2, this.f2680b, lock2, looper2, dVar2, map, eVar, map3, aVar, arrayList, new C1451i2(this, (C1440g2) null));
        ArrayMap arrayMap = new ArrayMap();
        for (C1382a.C1385c<?> put : map2.keySet()) {
            arrayMap.put(put, this.f2681c);
        }
        for (C1382a.C1385c<?> put2 : map.keySet()) {
            arrayMap.put(put2, this.f2682d);
        }
        this.f2683e = Collections.unmodifiableMap(arrayMap);
    }

    /* renamed from: c */
    public static C1436f2 m3830c(Context context, C1453j0 j0Var, Lock lock, Looper looper, C1520d dVar, Map<C1382a.C1385c<?>, C1382a.C1390f> map, C1564e eVar, Map<C1382a<?>, Boolean> map2, C1382a.C1383a<? extends C0607e, C0603a> aVar, ArrayList<C1425d2> arrayList) {
        Map<C1382a<?>, Boolean> map3 = map2;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        C1382a.C1390f fVar = null;
        for (Map.Entry next : map.entrySet()) {
            C1382a.C1390f fVar2 = (C1382a.C1390f) next.getValue();
            if (fVar2.mo10791c()) {
                fVar = fVar2;
            }
            boolean r = fVar2.mo10803r();
            C1382a.C1385c cVar = (C1382a.C1385c) next.getKey();
            if (r) {
                arrayMap.put(cVar, fVar2);
            } else {
                arrayMap2.put(cVar, fVar2);
            }
        }
        C1609u.m4479o(!arrayMap.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        for (C1382a next2 : map2.keySet()) {
            C1382a.C1385c<?> a = next2.mo10782a();
            if (arrayMap.containsKey(a)) {
                arrayMap3.put(next2, map3.get(next2));
            } else if (arrayMap2.containsKey(a)) {
                arrayMap4.put(next2, map3.get(next2));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C1425d2 d2Var = arrayList.get(i);
            i++;
            C1425d2 d2Var2 = d2Var;
            if (arrayMap3.containsKey(d2Var2.f2627a)) {
                arrayList2.add(d2Var2);
            } else if (arrayMap4.containsKey(d2Var2.f2627a)) {
                arrayList3.add(d2Var2);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new C1436f2(context, j0Var, lock, looper, dVar, arrayMap, arrayMap2, eVar, aVar, fVar, arrayList2, arrayList3, arrayMap3, arrayMap4);
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: h */
    public final void m3832h(int i, boolean z) {
        this.f2680b.mo10943c(i, z);
        this.f2688j = null;
        this.f2687i = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m3833i(Bundle bundle) {
        Bundle bundle2 = this.f2686h;
        if (bundle2 == null) {
            this.f2686h = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    @GuardedBy("mLock")
    /* renamed from: j */
    private final void m3834j(ConnectionResult connectionResult) {
        int i = this.f2691m;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f2691m = 0;
            }
            this.f2680b.mo10941a(connectionResult);
        }
        m3848x();
        this.f2691m = 0;
    }

    /* renamed from: m */
    private final boolean m3837m(C1418c<? extends C1507j, ? extends C1382a.C1384b> cVar) {
        C1382a.C1385c<? extends C1382a.C1384b> u = cVar.mo10891u();
        C1609u.m4466b(this.f2683e.containsKey(u), "GoogleApiClient is not configured to use the API required for this call.");
        return this.f2683e.get(u).equals(this.f2682d);
    }

    @Nullable
    /* renamed from: o */
    private final PendingIntent m3839o() {
        if (this.f2685g == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f2679a, System.identityHashCode(this.f2680b), this.f2685g.mo10802q(), 134217728);
    }

    /* renamed from: r */
    private static boolean m3842r(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.mo10749V();
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: w */
    public final void m3847w() {
        ConnectionResult connectionResult;
        if (m3842r(this.f2687i)) {
            if (m3842r(this.f2688j) || m3849y()) {
                int i = this.f2691m;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        this.f2691m = 0;
                        return;
                    }
                    this.f2680b.mo10942b(this.f2686h);
                }
                m3848x();
                this.f2691m = 0;
                return;
            }
            ConnectionResult connectionResult2 = this.f2688j;
            if (connectionResult2 == null) {
                return;
            }
            if (this.f2691m == 1) {
                m3848x();
                return;
            }
            m3834j(connectionResult2);
            this.f2681c.disconnect();
        } else if (this.f2687i == null || !m3842r(this.f2688j)) {
            ConnectionResult connectionResult3 = this.f2687i;
            if (connectionResult3 != null && (connectionResult = this.f2688j) != null) {
                if (this.f2682d.f2796m < this.f2681c.f2796m) {
                    connectionResult3 = connectionResult;
                }
                m3834j(connectionResult3);
            }
        } else {
            this.f2682d.disconnect();
            m3834j(this.f2687i);
        }
    }

    @GuardedBy("mLock")
    /* renamed from: x */
    private final void m3848x() {
        for (C1460l a : this.f2684f) {
            a.mo10985a();
        }
        this.f2684f.clear();
    }

    @GuardedBy("mLock")
    /* renamed from: y */
    private final boolean m3849y() {
        ConnectionResult connectionResult = this.f2688j;
        return connectionResult != null && connectionResult.mo10745Q() == 4;
    }

    /* renamed from: b */
    public final void mo10897b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(Constants.COLON_SEPARATOR);
        this.f2682d.mo10897b(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(Constants.COLON_SEPARATOR);
        this.f2681c.mo10897b(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @GuardedBy("mLock")
    public final void connect() {
        this.f2691m = 2;
        this.f2689k = false;
        this.f2688j = null;
        this.f2687i = null;
        this.f2681c.connect();
        this.f2682d.connect();
    }

    @GuardedBy("mLock")
    /* renamed from: d */
    public final void mo10899d() {
        this.f2681c.mo10899d();
        this.f2682d.mo10899d();
    }

    @GuardedBy("mLock")
    public final void disconnect() {
        this.f2688j = null;
        this.f2687i = null;
        this.f2691m = 0;
        this.f2681c.disconnect();
        this.f2682d.disconnect();
        m3848x();
    }

    @GuardedBy("mLock")
    /* renamed from: f */
    public final <A extends C1382a.C1384b, T extends C1418c<? extends C1507j, A>> T mo10901f(@NonNull T t) {
        if (!m3837m(t)) {
            return this.f2681c.mo10901f(t);
        }
        if (!m3849y()) {
            return this.f2682d.mo10901f(t);
        }
        t.mo10894y(new Status(4, (String) null, m3839o()));
        return t;
    }

    @GuardedBy("mLock")
    /* renamed from: g */
    public final <A extends C1382a.C1384b, R extends C1507j, T extends C1418c<R, A>> T mo10902g(@NonNull T t) {
        if (!m3837m(t)) {
            return this.f2681c.mo10902g(t);
        }
        if (!m3849y()) {
            return this.f2682d.mo10902g(t);
        }
        t.mo10894y(new Status(4, (String) null, m3839o()));
        return t;
    }

    public final boolean isConnected() {
        this.f2690l.lock();
        try {
            boolean z = true;
            if (!this.f2681c.isConnected() || (!this.f2682d.isConnected() && !m3849y() && this.f2691m != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.f2690l.unlock();
        }
    }
}
