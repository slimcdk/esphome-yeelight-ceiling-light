package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C1520d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1507j;
import com.google.android.gms.common.internal.C1564e;
import com.xiaomi.mipush.sdk.Constants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import p011c.p012a.p019b.p028b.p037d.C0603a;
import p011c.p012a.p019b.p028b.p037d.C0607e;

/* renamed from: com.google.android.gms.common.api.internal.p0 */
public final class C1475p0 implements C1424d1, C1432e2 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Lock f2784a;

    /* renamed from: b */
    private final Condition f2785b;

    /* renamed from: c */
    private final Context f2786c;

    /* renamed from: d */
    private final C1520d f2787d;

    /* renamed from: e */
    private final C1481r0 f2788e;

    /* renamed from: f */
    final Map<C1382a.C1385c<?>, C1382a.C1390f> f2789f;

    /* renamed from: g */
    final Map<C1382a.C1385c<?>, ConnectionResult> f2790g = new HashMap();

    /* renamed from: h */
    private final C1564e f2791h;

    /* renamed from: i */
    private final Map<C1382a<?>, Boolean> f2792i;

    /* renamed from: j */
    private final C1382a.C1383a<? extends C0607e, C0603a> f2793j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile C1472o0 f2794k;

    /* renamed from: l */
    private ConnectionResult f2795l;

    /* renamed from: m */
    int f2796m;

    /* renamed from: n */
    final C1453j0 f2797n;

    /* renamed from: o */
    final C1431e1 f2798o;

    public C1475p0(Context context, C1453j0 j0Var, Lock lock, Looper looper, C1520d dVar, Map<C1382a.C1385c<?>, C1382a.C1390f> map, C1564e eVar, Map<C1382a<?>, Boolean> map2, C1382a.C1383a<? extends C0607e, C0603a> aVar, ArrayList<C1425d2> arrayList, C1431e1 e1Var) {
        this.f2786c = context;
        this.f2784a = lock;
        this.f2787d = dVar;
        this.f2789f = map;
        this.f2791h = eVar;
        this.f2792i = map2;
        this.f2793j = aVar;
        this.f2797n = j0Var;
        this.f2798o = e1Var;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C1425d2 d2Var = arrayList.get(i);
            i++;
            d2Var.mo10904b(this);
        }
        this.f2788e = new C1481r0(this, looper);
        this.f2785b = lock.newCondition();
        this.f2794k = new C1449i0(this);
    }

    /* renamed from: a */
    public final void mo10836a(int i) {
        this.f2784a.lock();
        try {
            this.f2794k.mo10957a(i);
        } finally {
            this.f2784a.unlock();
        }
    }

    /* renamed from: b */
    public final void mo10897b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f2794k);
        for (C1382a next : this.f2792i.keySet()) {
            printWriter.append(str).append(next.mo10783b()).println(Constants.COLON_SEPARATOR);
            this.f2789f.get(next.mo10782a()).mo10790b(concat, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: c */
    public final void mo10837c(@Nullable Bundle bundle) {
        this.f2784a.lock();
        try {
            this.f2794k.mo10958c(bundle);
        } finally {
            this.f2784a.unlock();
        }
    }

    @GuardedBy("mLock")
    public final void connect() {
        this.f2794k.connect();
    }

    @GuardedBy("mLock")
    /* renamed from: d */
    public final void mo10899d() {
        if (isConnected()) {
            ((C1489u) this.f2794k).mo11016d();
        }
    }

    @GuardedBy("mLock")
    public final void disconnect() {
        if (this.f2794k.disconnect()) {
            this.f2790g.clear();
        }
    }

    /* renamed from: e */
    public final void mo10923e(@NonNull ConnectionResult connectionResult, @NonNull C1382a<?> aVar, boolean z) {
        this.f2784a.lock();
        try {
            this.f2794k.mo10961e(connectionResult, aVar, z);
        } finally {
            this.f2784a.unlock();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: f */
    public final <A extends C1382a.C1384b, T extends C1418c<? extends C1507j, A>> T mo10901f(@NonNull T t) {
        t.mo10853r();
        return this.f2794k.mo10962f(t);
    }

    @GuardedBy("mLock")
    /* renamed from: g */
    public final <A extends C1382a.C1384b, R extends C1507j, T extends C1418c<R, A>> T mo10902g(@NonNull T t) {
        t.mo10853r();
        return this.f2794k.mo10963g(t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo11002i(C1478q0 q0Var) {
        this.f2788e.sendMessage(this.f2788e.obtainMessage(1, q0Var));
    }

    public final boolean isConnected() {
        return this.f2794k instanceof C1489u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo11003j() {
        this.f2784a.lock();
        try {
            this.f2794k = new C1498x(this, this.f2791h, this.f2792i, this.f2787d, this.f2793j, this.f2784a, this.f2786c);
            this.f2794k.mo10964h();
            this.f2785b.signalAll();
        } finally {
            this.f2784a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo11004l(RuntimeException runtimeException) {
        this.f2788e.sendMessage(this.f2788e.obtainMessage(2, runtimeException));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo11005m() {
        this.f2784a.lock();
        try {
            this.f2797n.mo10969s();
            this.f2794k = new C1489u(this);
            this.f2794k.mo10964h();
            this.f2785b.signalAll();
        } finally {
            this.f2784a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo11006n(ConnectionResult connectionResult) {
        this.f2784a.lock();
        try {
            this.f2795l = connectionResult;
            this.f2794k = new C1449i0(this);
            this.f2794k.mo10964h();
            this.f2785b.signalAll();
        } finally {
            this.f2784a.unlock();
        }
    }
}
