package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.r */
abstract class C0927r extends C0932w {

    /* renamed from: d */
    public final int f1057d;
    @Nullable

    /* renamed from: e */
    public final Bundle f1058e;

    /* renamed from: f */
    final /* synthetic */ C0897c f1059f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @BinderThread
    protected C0927r(C0897c cVar, @Nullable int i, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f1059f = cVar;
        this.f1057d = i;
        this.f1058e = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo12301a(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f1057d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.mo12189g()
            if (r3 != 0) goto L_0x001b
            com.google.android.gms.common.internal.c r3 = r2.f1059f
            r3.m1304k0(r0, (android.os.IInterface) null)
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 8
            r3.<init>(r0, r1)
        L_0x0018:
            r2.mo12188f(r3)
        L_0x001b:
            return
        L_0x001c:
            com.google.android.gms.common.internal.c r3 = r2.f1059f
            r3.m1304k0(r0, (android.os.IInterface) null)
            android.os.Bundle r3 = r2.f1058e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            int r0 = r2.f1057d
            r3.<init>(r0, r1)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0927r.mo12301a(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12302b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo12188f(ConnectionResult connectionResult);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo12189g();
}
