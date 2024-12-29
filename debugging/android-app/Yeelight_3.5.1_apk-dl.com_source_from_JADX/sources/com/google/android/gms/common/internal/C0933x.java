package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import p109w.C3864x;

@VisibleForTesting
/* renamed from: com.google.android.gms.common.internal.x */
public final class C0933x extends C3864x {
    @Nullable

    /* renamed from: a */
    private C0897c f1068a;

    /* renamed from: b */
    private final int f1069b;

    public C0933x(@NonNull C0897c cVar, int i) {
        this.f1068a = cVar;
        this.f1069b = i;
    }

    @BinderThread
    /* renamed from: F */
    public final void mo12329F(int i, @Nullable Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @BinderThread
    /* renamed from: X */
    public final void mo12330X(int i, @NonNull IBinder iBinder, @Nullable Bundle bundle) {
        C0917i.m1420k(this.f1068a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f1068a.mo12207P(i, iBinder, bundle, this.f1069b);
        this.f1068a = null;
    }

    @BinderThread
    /* renamed from: d0 */
    public final void mo12331d0(int i, @NonNull IBinder iBinder, @NonNull zzj zzj) {
        C0897c cVar = this.f1068a;
        C0917i.m1420k(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C0917i.m1419j(zzj);
        C0897c.m1299e0(cVar, zzj);
        mo12330X(i, iBinder, zzj.f1088a);
    }
}
