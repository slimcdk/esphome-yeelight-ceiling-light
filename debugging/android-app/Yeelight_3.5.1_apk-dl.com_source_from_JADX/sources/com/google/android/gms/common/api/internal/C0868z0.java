package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0877b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.internal.C0904d;
import com.google.android.gms.common.internal.C0917i;
import com.xiaomi.mipush.sdk.Constants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: com.google.android.gms.common.api.internal.z0 */
public final class C0868z0 implements C0836r1, C0787h3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Lock f863a;

    /* renamed from: b */
    private final Condition f864b;

    /* renamed from: c */
    private final Context f865c;

    /* renamed from: d */
    private final C0877b f866d;

    /* renamed from: e */
    private final C0864y0 f867e;

    /* renamed from: f */
    final Map f868f;

    /* renamed from: g */
    final Map f869g = new HashMap();
    @Nullable

    /* renamed from: h */
    final C0904d f870h;

    /* renamed from: i */
    final Map f871i;
    @Nullable

    /* renamed from: j */
    final C0722a.C0723a f872j;
    /* access modifiers changed from: private */
    @NotOnlyInitialized

    /* renamed from: k */
    public volatile C0856w0 f873k;

    /* renamed from: l */
    int f874l;

    /* renamed from: m */
    final C0852v0 f875m;

    /* renamed from: n */
    final C0828p1 f876n;

    public C0868z0(Context context, C0852v0 v0Var, Lock lock, Looper looper, C0877b bVar, Map map, @Nullable C0904d dVar, Map map2, @Nullable C0722a.C0723a aVar, ArrayList arrayList, C0828p1 p1Var) {
        this.f865c = context;
        this.f863a = lock;
        this.f866d = bVar;
        this.f868f = map;
        this.f870h = dVar;
        this.f871i = map2;
        this.f872j = aVar;
        this.f875m = v0Var;
        this.f876n = p1Var;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0782g3) arrayList.get(i)).mo11971a(this);
        }
        this.f867e = new C0864y0(this, looper);
        this.f864b = lock.newCondition();
        this.f873k = new C0835r0(this);
    }

    /* renamed from: T */
    public final void mo11989T(@NonNull ConnectionResult connectionResult, @NonNull C0722a aVar, boolean z) {
        this.f863a.lock();
        try {
            this.f873k.mo11937c(connectionResult, aVar, z);
        } finally {
            this.f863a.unlock();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo12064a() {
        this.f873k.mo11936b();
    }

    @GuardedBy("mLock")
    /* renamed from: b */
    public final C0763d mo12065b(@NonNull C0763d dVar) {
        dVar.mo11886m();
        this.f873k.mo11940f(dVar);
        return dVar;
    }

    /* renamed from: c */
    public final void mo11948c(int i) {
        this.f863a.lock();
        try {
            this.f873k.mo11938d(i);
        } finally {
            this.f863a.unlock();
        }
    }

    /* renamed from: d */
    public final boolean mo12066d() {
        return this.f873k instanceof C0764d0;
    }

    @GuardedBy("mLock")
    /* renamed from: e */
    public final C0763d mo12067e(@NonNull C0763d dVar) {
        dVar.mo11886m();
        return this.f873k.mo11942h(dVar);
    }

    /* renamed from: f */
    public final void mo11949f(@Nullable Bundle bundle) {
        this.f863a.lock();
        try {
            this.f873k.mo11935a(bundle);
        } finally {
            this.f863a.unlock();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: g */
    public final void mo12068g() {
        if (this.f873k instanceof C0764d0) {
            ((C0764d0) this.f873k).mo11943j();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: h */
    public final void mo12069h() {
        if (this.f873k.mo11941g()) {
            this.f869g.clear();
        }
    }

    /* renamed from: i */
    public final void mo12070i(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f873k);
        for (C0722a aVar : this.f871i.keySet()) {
            printWriter.append(str).append(aVar.mo11822d()).println(Constants.COLON_SEPARATOR);
            ((C0722a.C0730f) C0917i.m1419j((C0722a.C0730f) this.f868f.get(aVar.mo11820b()))).mo11838h(concat, fileDescriptor, printWriter, strArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo12102l() {
        this.f863a.lock();
        try {
            this.f875m.mo12085t();
            this.f873k = new C0764d0(this);
            this.f873k.mo11939e();
            this.f864b.signalAll();
        } finally {
            this.f863a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo12103m() {
        this.f863a.lock();
        try {
            this.f873k = new C0831q0(this, this.f870h, this.f871i, this.f866d, this.f872j, this.f863a, this.f865c);
            this.f873k.mo11939e();
            this.f864b.signalAll();
        } finally {
            this.f863a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo12104n(@Nullable ConnectionResult connectionResult) {
        this.f863a.lock();
        try {
            this.f873k = new C0835r0(this);
            this.f873k.mo11939e();
            this.f864b.signalAll();
        } finally {
            this.f863a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo12105o(C0860x0 x0Var) {
        this.f867e.sendMessage(this.f867e.obtainMessage(1, x0Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo12106p(RuntimeException runtimeException) {
        this.f867e.sendMessage(this.f867e.obtainMessage(2, runtimeException));
    }
}
