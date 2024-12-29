package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.z */
public final class C0935z extends C0927r {
    @Nullable

    /* renamed from: g */
    public final IBinder f1072g;

    /* renamed from: h */
    final /* synthetic */ C0897c f1073h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @BinderThread
    public C0935z(C0897c cVar, @Nullable int i, @Nullable IBinder iBinder, Bundle bundle) {
        super(cVar, i, bundle);
        this.f1073h = cVar;
        this.f1072g = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo12188f(ConnectionResult connectionResult) {
        if (this.f1073h.f996u != null) {
            this.f1073h.f996u.mo12241e(connectionResult);
        }
        this.f1073h.mo12205N(connectionResult);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo12189g() {
        try {
            IBinder iBinder = this.f1072g;
            C0917i.m1419j(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f1073h.mo12198G().equals(interfaceDescriptor)) {
                String G = this.f1073h.mo12198G();
                StringBuilder sb = new StringBuilder();
                sb.append("service descriptor mismatch: ");
                sb.append(G);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                return false;
            }
            IInterface u = this.f1073h.mo12233u(this.f1072g);
            if (u == null) {
                return false;
            }
            if (!C0897c.m1302i0(this.f1073h, 2, 4, u) && !C0897c.m1302i0(this.f1073h, 3, 4, u)) {
                return false;
            }
            this.f1073h.f1000y = null;
            Bundle z = this.f1073h.mo12238z();
            C0897c cVar = this.f1073h;
            if (cVar.f995t != null) {
                cVar.f995t.mo12240f(z);
            }
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
