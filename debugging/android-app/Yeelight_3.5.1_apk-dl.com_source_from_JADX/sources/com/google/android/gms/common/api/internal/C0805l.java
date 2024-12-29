package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C0897c;
import com.google.android.gms.common.internal.C0909f;
import com.google.android.gms.common.internal.C0911g;
import com.google.android.gms.common.internal.C0917i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

@KeepForSdk
/* renamed from: com.google.android.gms.common.api.internal.l */
public final class C0805l implements C0722a.C0730f, ServiceConnection {
    @Nullable

    /* renamed from: a */
    private final String f683a;
    @Nullable

    /* renamed from: b */
    private final String f684b;
    @Nullable

    /* renamed from: c */
    private final ComponentName f685c;

    /* renamed from: d */
    private final Context f686d;

    /* renamed from: e */
    private final C0773f f687e;

    /* renamed from: f */
    private final Handler f688f;

    /* renamed from: g */
    private final C0810m f689g;
    @Nullable

    /* renamed from: h */
    private IBinder f690h;

    /* renamed from: i */
    private boolean f691i;
    @Nullable

    /* renamed from: j */
    private String f692j;

    static {
        Class<C0805l> cls = C0805l.class;
    }

    @WorkerThread
    /* renamed from: u */
    private final void m919u() {
        if (Thread.currentThread() != this.f688f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    /* renamed from: a */
    public final boolean mo11829a() {
        return false;
    }

    @NonNull
    /* renamed from: b */
    public final Set<Scope> mo11830b() {
        return Collections.emptySet();
    }

    /* renamed from: c */
    public final void mo11831c(@Nullable C0911g gVar, @Nullable Set<Scope> set) {
    }

    @WorkerThread
    /* renamed from: d */
    public final boolean mo11832d() {
        m919u();
        return this.f691i;
    }

    @WorkerThread
    public final void disconnect() {
        m919u();
        String.valueOf(this.f690h);
        try {
            this.f686d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f691i = false;
        this.f690h = null;
    }

    @WorkerThread
    public final void disconnect(@NonNull String str) {
        m919u();
        this.f692j = str;
        disconnect();
    }

    @NonNull
    /* renamed from: e */
    public final String mo11835e() {
        String str = this.f683a;
        if (str != null) {
            return str;
        }
        C0917i.m1419j(this.f685c);
        return this.f685c.getPackageName();
    }

    @WorkerThread
    /* renamed from: f */
    public final void mo11836f(@NonNull C0897c.C0900c cVar) {
        m919u();
        String.valueOf(this.f690h);
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f685c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f683a).setAction(this.f684b);
            }
            boolean bindService = this.f686d.bindService(intent, this, C0909f.m1387a());
            this.f691i = bindService;
            if (!bindService) {
                this.f690h = null;
                this.f689g.mo11972e(new ConnectionResult(16));
            }
            String.valueOf(this.f690h);
        } catch (SecurityException e) {
            this.f691i = false;
            this.f690h = null;
            throw e;
        }
    }

    /* renamed from: g */
    public final void mo11837g(@NonNull C0897c.C0902e eVar) {
    }

    /* renamed from: h */
    public final void mo11838h(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
    }

    /* renamed from: i */
    public final boolean mo11839i() {
        return false;
    }

    @WorkerThread
    public final boolean isConnected() {
        m919u();
        return this.f690h != null;
    }

    /* renamed from: k */
    public final int mo11841k() {
        return 0;
    }

    @NonNull
    /* renamed from: l */
    public final Feature[] mo11842l() {
        return new Feature[0];
    }

    @Nullable
    /* renamed from: o */
    public final String mo11843o() {
        return this.f692j;
    }

    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.f688f.post(new C0857w1(this, iBinder));
    }

    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
        this.f688f.post(new C0853v1(this));
    }

    @NonNull
    /* renamed from: p */
    public final Intent mo11844p() {
        return new Intent();
    }

    /* renamed from: q */
    public final boolean mo11845q() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void mo12025r() {
        this.f691i = false;
        this.f690h = null;
        this.f687e.mo11948c(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final /* synthetic */ void mo12026s(IBinder iBinder) {
        this.f691i = false;
        this.f690h = iBinder;
        String.valueOf(iBinder);
        this.f687e.mo11949f(new Bundle());
    }

    /* renamed from: t */
    public final void mo12027t(@Nullable String str) {
    }
}
